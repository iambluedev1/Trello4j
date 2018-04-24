package fr.iambluedev.trello4j.model;

public class ActionMember {

	private String id;
	private String avatarHash;
	private String fullName;
	private String initials;
	private String username;
	
	public ActionMember(String id, String avatarHash, String fullName, String initials, String username) {
		this.id = id;
		this.avatarHash = avatarHash;
		this.fullName = fullName;
		this.initials = initials;
		this.username = username;
	}

	public String getId() {
		return id;
	}
	
	public String getAvatarHash() {
		return avatarHash;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getInitials() {
		return initials;
	}
	
	public String getUsername() {
		return username;
	}
}
