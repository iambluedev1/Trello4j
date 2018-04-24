package fr.iambluedev.trello4j.model;

import fr.iambluedev.trello4j.Trello4jImpl;

public class Organization {

	private String id;
	private String name;
	private String displayName;
	private String desc;
	private String descData;
	private String url;
	private String website;
	private String logoHash;
	
	public Organization(String id, String name, String displayName, String desc, String descData, String url, String website, String logoHash) {
		this.id = id;
		this.name = name;
		this.displayName = displayName;
		this.desc = desc;
		this.descData = descData;
		this.url = url;
		this.website = website;
		this.logoHash = logoHash;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getDesc() {
		return desc;
	}

	public String getDescData() {
		return descData;
	}

	public String getUrl() {
		return url;
	}

	public String getWebsite() {
		return website;
	}

	public String getLogoHash() {
		return logoHash;
	}

	public Board[] getBoards(){
		return Trello4jImpl.getInstance().getBoardsByOrganizationId(id);
	}
	
	public OrganizationMember[] getMembers(){
		return Trello4jImpl.getInstance().getOrganizationMembersByOrganizationId(id);
	}
	
	public OrganizationMembership[] getMemberShips(){
		return Trello4jImpl.getInstance().getOrganizationMemberShipsByOrganizationId(id);
	}
	
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", displayName=" + displayName + ", desc=" + desc
				+ ", descData=" + descData + ", url=" + url + ", website=" + website + ", logoHash=" + logoHash + "]";
	}

}
