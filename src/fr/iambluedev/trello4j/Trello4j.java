package fr.iambluedev.trello4j;

import fr.iambluedev.trello4j.model.Board;
import fr.iambluedev.trello4j.model.BoardAction;
import fr.iambluedev.trello4j.model.Organization;
import fr.iambluedev.trello4j.model.OrganizationMember;
import fr.iambluedev.trello4j.model.OrganizationMembership;

public interface Trello4j {
	Organization getOrganizationByName(String name);
	OrganizationMember[] getOrganizationMembersByOrganizationId(String id);
	OrganizationMembership[] getOrganizationMemberShipsByOrganizationId(String id);
	
	Board[] getBoardsByOrganizationId(String id);
	BoardAction[] getActionsByBoardId(String id);
}