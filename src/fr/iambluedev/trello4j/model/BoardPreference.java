package fr.iambluedev.trello4j.model;

import java.util.List;

public class BoardPreference {

	private String permissionLevel;
	private String voting;
	private String comments;
	private String invitations;
	private Boolean selfJoin;
	private Boolean cardCovers;
	private String cardAging;
	private Boolean calendarFeedEnabled;
	private String backgroundImage;
	private List<BoardBackgroundImage> backgroundImageScaled;
	private Boolean backgroundTile;
	private String backgroundBrightness;
	private String backgroundBottomColor;
	private String backgroundTopColor;
	private Boolean canBePublic;
	private Boolean canBeOrg;
	private Boolean canBePrivate;
	private Boolean canInvite;
	
	public BoardPreference(String permissionLevel, String voting, String comments, String invitations, Boolean selfJoin,
			Boolean cardCovers, String cardAging, Boolean calendarFeedEnabled, String backgroundImage,
			List<BoardBackgroundImage> backgroundImageScaled, Boolean backgroundTile, String backgroundBrightness,
			String backgroundBottomColor, String backgroundTopColor, Boolean canBePublic, Boolean canBeOrg,
			Boolean canBePrivate, Boolean canInvite) {
		this.permissionLevel = permissionLevel;
		this.voting = voting;
		this.comments = comments;
		this.invitations = invitations;
		this.selfJoin = selfJoin;
		this.cardCovers = cardCovers;
		this.cardAging = cardAging;
		this.calendarFeedEnabled = calendarFeedEnabled;
		this.backgroundImage = backgroundImage;
		this.backgroundImageScaled = backgroundImageScaled;
		this.backgroundTile = backgroundTile;
		this.backgroundBrightness = backgroundBrightness;
		this.backgroundBottomColor = backgroundBottomColor;
		this.backgroundTopColor = backgroundTopColor;
		this.canBePublic = canBePublic;
		this.canBeOrg = canBeOrg;
		this.canBePrivate = canBePrivate;
		this.canInvite = canInvite;
	}

	public String getPermissionLevel() {
		return permissionLevel;
	}

	public String getVoting() {
		return voting;
	}

	public String getComments() {
		return comments;
	}

	public String getInvitations() {
		return invitations;
	}

	public Boolean getSelfJoin() {
		return selfJoin;
	}

	public Boolean getCardCovers() {
		return cardCovers;
	}

	public String getCardAging() {
		return cardAging;
	}

	public Boolean getCalendarFeedEnabled() {
		return calendarFeedEnabled;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public List<BoardBackgroundImage> getBackgroundImageScaled() {
		return backgroundImageScaled;
	}

	public Boolean getBackgroundTile() {
		return backgroundTile;
	}

	public String getBackgroundBrightness() {
		return backgroundBrightness;
	}

	public String getBackgroundBottomColor() {
		return backgroundBottomColor;
	}

	public String getBackgroundTopColor() {
		return backgroundTopColor;
	}

	public Boolean getCanBePublic() {
		return canBePublic;
	}

	public Boolean getCanBeOrg() {
		return canBeOrg;
	}

	public Boolean getCanBePrivate() {
		return canBePrivate;
	}

	public Boolean getCanInvite() {
		return canInvite;
	}
}
