package fr.iambluedev.trello4j.model;

public class BoardAction {

	private String id;
	private String idMemberCreator;
	private String type;
	private String date;
	private ActionMember memberCreator;
	private ActionMember member;
	private ActionData data;
	
	public BoardAction(String id, String idMemberCreator, String type, ActionMember memberCreator, ActionMember member,
			ActionData data, String date) {
		this.id = id;
		this.idMemberCreator = idMemberCreator;
		this.type = type;
		this.memberCreator = memberCreator;
		this.member = member;
		this.data = data;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public String getIdMemberCreator() {
		return idMemberCreator;
	}

	public String getType() {
		return type;
	}

	public ActionMember getMemberCreator() {
		return memberCreator;
	}

	public ActionMember getMember() {
		return member;
	}

	public ActionData getData() {
		return data;
	}

	public String getDate() {
		return date;
	}
}
