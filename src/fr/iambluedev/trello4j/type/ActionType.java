package fr.iambluedev.trello4j.type;

public enum ActionType {

	UPDATE_CHECK_ITEM_STATE_ON_CARD("updateCheckItemStateOnCard"),
	ADD_MEMBER_TO_CARD("addMemberToCard"),
	ADD_CHECKLIST_TO_CARD("addChecklistToCard"),
	UPDATE_CARD("updateCard"),
	CREATE_CARD("createCard"),
	REMOVE_CHECKLIST_FROM_CARD("removeChecklistFromCard"),
	UPDATE_LIST("updateList"),
	CREATE_LIST("createList"),
	DELETE_CARD("deleteCard"),
	REMOVE_MEMBER_FROM_CARD("removeMemberFromCard"),
	UPDATE_BOARD("updateBoard"),
	COMMENT_CARD("commentCard"),
	UPDATE_CHECKLIST("updateChecklist");

	private String name;
	
	private ActionType(String name) {
		this.name = name;
	}
	
	public static ActionType fromString(String search) {
	    for (ActionType type : ActionType.values()) {
	    	if (type.name.equalsIgnoreCase(search)) {
	    		return type;
	      	}
	    }
	    return null;
	}
}
