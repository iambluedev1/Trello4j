package fr.iambluedev.trello4j.request;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class HttpRequest<T> {

	private RequestBuilder builder;
	private String url;
	private Gson gson;
	private Class<T> clazz;
	
	private String METHOD_DELETE = "DELETE";
    private String METHOD_GET = "GET";
    private String METHOD_POST = "POST";
    private String METHOD_PUT = "PUT";
    private String GZIP_ENCODING = "gzip";
    
	public HttpRequest(Class<T> clazz){
		this.gson = new Gson();
		this.clazz = clazz;
	}
	
	public HttpRequest<T> builder(RequestBuilder builder){
		this.builder = builder;
		this.url = this.builder.build();
		return this;
	}
	
	public T doGet() {
		return doRequest(url, METHOD_GET);
	}

	public T doPut() {
		return doRequest(url, METHOD_PUT);
	}

	public T doPost(Map<String, String> map) {
		return doRequest(url, METHOD_POST, map);
	}

	public T doDelete() {
		return doRequest(url, METHOD_DELETE);
	}

	private T doRequest(String url, String requestMethod) {
        return doRequest(url, requestMethod, null);
	}
	
	private T doRequest(String url, String requestMethod, Map<String, String> map) {
		try {
			HttpsURLConnection conn = (HttpsURLConnection) new URL(url).openConnection();
			conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
            conn.setDoOutput(requestMethod.equals(METHOD_POST) || requestMethod.equals(METHOD_PUT));
            conn.setRequestMethod(requestMethod);

            if(map != null && !map.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String key : map.keySet()) {
                    sb.append(sb.length() > 0 ? "&" : "")
                        .append(key)
                        .append("=")
                        .append(URLEncoder.encode(map.get(key), "UTF-8"));
                }
                conn.getOutputStream().write(sb.toString().getBytes());
                conn.getOutputStream().close();
            }

			if (conn.getResponseCode() > 399) {
				return null;
			} else {
				String json = convert(getWrappedInputStream(conn.getInputStream(), GZIP_ENCODING.equalsIgnoreCase(conn.getContentEncoding()))); 
				return gson.fromJson(json, this.clazz);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private InputStream getWrappedInputStream(InputStream is, boolean gzip) throws IOException {
		if (gzip) {
			return new BufferedInputStream(new GZIPInputStream(is));
		} else {
			return new BufferedInputStream(is);
		}
	}
	
	private String convert(InputStream is) throws IOException {
        if (is != null) {
            Writer writer = new StringWriter();

            char[] buffer = new char[1024];
            try
            {
                Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                int n;
                while ((n = reader.read(buffer)) != -1) 
                {
                    writer.write(buffer, 0, n);
                }
            }
            finally 
            {
                is.close();
            }
            return writer.toString();
        } else {       
            return "";
        }
    }
}
