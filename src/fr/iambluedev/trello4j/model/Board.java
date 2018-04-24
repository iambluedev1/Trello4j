package fr.iambluedev.trello4j.model;

import java.util.List;
import java.util.Map;

import fr.iambluedev.trello4j.Trello4jImpl;

public class Board {
	
	private String name;
	private String desc;
	private Object descData;
	private Boolean closed;
	private String idOrganization;
	private Object limits;
	private Object pinned;
	private Object invitations;
	private String shortLink;
	private List<String> powerUps;
	private String dateLastActivity;
	private List<String> idTags;
	private String datePluginDisable;
	private String id;
	private Boolean invited;
	private Boolean starred;
	private String url;
	private BoardPreference prefs;
	private Boolean suscribed;
	private Map<String, String> labelNames;
	private String dateLastView;
	private String shortUrl;
	private List<BoardMember> memberships;
	
	public Board(String name, String desc, Object descData, Boolean closed, String idOrganization, Object limits,
			Object pinned, Object invitations, String shortLink, List<String> powerUps, String dateLastActivity,
			List<String> idTags, String datePluginDisable, String id, Boolean invited, Boolean starred, String url,
			BoardPreference prefs, Boolean suscribed, String dateLastView, String shortUrl,
			List<BoardMember> memberships, Map<String, String> labelNames) {
		this.name = name;
		this.desc = desc;
		this.descData = descData;
		this.closed = closed;
		this.idOrganization = idOrganization;
		this.limits = limits;
		this.pinned = pinned;
		this.invitations = invitations;
		this.shortLink = shortLink;
		this.powerUps = powerUps;
		this.dateLastActivity = dateLastActivity;
		this.idTags = idTags;
		this.datePluginDisable = datePluginDisable;
		this.id = id;
		this.invited = invited;
		this.starred = starred;
		this.url = url;
		this.prefs = prefs;
		this.suscribed = suscribed;
		this.labelNames = labelNames;
		this.dateLastView = dateLastView;
		this.shortUrl = shortUrl;
		this.memberships = memberships;
	}
	
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public Object getDescData() {
		return descData;
	}
	public Boolean getClosed() {
		return closed;
	}
	public String getIdOrganization() {
		return idOrganization;
	}
	public Object getLimits() {
		return limits;
	}
	public Object getPinned() {
		return pinned;
	}
	public Object getInvitations() {
		return invitations;
	}
	public String getShortLink() {
		return shortLink;
	}
	public List<String> getPowerUps() {
		return powerUps;
	}
	public String getDateLastActivity() {
		return dateLastActivity;
	}
	public List<String> getIdTags() {
		return idTags;
	}
	public String getDatePluginDisable() {
		return datePluginDisable;
	}
	public String getId() {
		return id;
	}
	public Boolean getInvited() {
		return invited;
	}
	public Boolean getStarred() {
		return starred;
	}
	public String getUrl() {
		return url;
	}
	public BoardPreference getPrefs() {
		return prefs;
	}
	public Boolean getSuscribed() {
		return suscribed;
	}
	public Map<String, String> getLabelNames() {
		return labelNames;
	}
	public String getDateLastView() {
		return dateLastView;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public List<BoardMember> getMemberships() {
		return memberships;
	}
	
	public BoardAction[] getActions(){
		return Trello4jImpl.getInstance().getActionsByBoardId(id);
	}
	
}
