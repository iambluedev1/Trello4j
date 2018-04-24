package fr.iambluedev.trello4j.model;

public class OrganizationMember {

	private String id;
	private String fullName;
	private String username;
	
	public OrganizationMember(String id, String fullName, String username) {
		this.id = id;
		this.fullName = fullName;
		this.username = username;
	}

	public String getId() {
		return id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getUsername() {
		return username;
	}
}
