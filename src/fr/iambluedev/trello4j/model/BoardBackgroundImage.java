package fr.iambluedev.trello4j.model;

public class BoardBackgroundImage {

	private Integer width;
	private Integer height;
	private String url;
	
	public BoardBackgroundImage(Integer width, Integer height, String url) {
		this.width = width;
		this.height = height;
		this.url = url;
	}

	public Integer getWidth() {
		return width;
	}

	public Integer getHeight() {
		return height;
	}

	public String getUrl() {
		return url;
	}
}
