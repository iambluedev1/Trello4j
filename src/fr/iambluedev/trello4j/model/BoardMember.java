package fr.iambluedev.trello4j.model;

public class BoardMember {

	private String id;
	private String idMember;
	private String memberType;
	private Boolean unconfirmed;
	private Boolean deactivated;
	
	public BoardMember(String id, String idMember, String memberType, Boolean unconfirmed, Boolean deactivated) {
		this.id = id;
		this.idMember = idMember;
		this.memberType = memberType;
		this.unconfirmed = unconfirmed;
		this.deactivated = deactivated;
	}

	public String getId() {
		return id;
	}

	public String getIdMember() {
		return idMember;
	}

	public String getMemberType() {
		return memberType;
	}

	public Boolean getUnconfirmed() {
		return unconfirmed;
	}

	public Boolean getDeactivated() {
		return deactivated;
	}
}
