package fr.iambluedev.trello4j;

import java.io.IOException;

import fr.iambluedev.trello4j.model.Board;
import fr.iambluedev.trello4j.model.BoardAction;
import fr.iambluedev.trello4j.model.Organization;
import fr.iambluedev.trello4j.model.OrganizationMember;
import fr.iambluedev.trello4j.model.OrganizationMembership;
import fr.iambluedev.trello4j.request.HttpRequest;
import fr.iambluedev.trello4j.request.RequestBuilder;

public class Trello4jImpl implements Trello4j{

	private String key;
	private String token;
	private static Trello4jImpl instance;
	
	public Trello4jImpl(String key, String token) throws IOException{
		this.key = key;
		this.token = token;
		instance = this;
	}

	public static Trello4jImpl getInstance() {
		return instance;
	}

	@Override
	public Organization getOrganizationByName(String name) {
		return new HttpRequest<Organization>(Organization.class).builder(new RequestBuilder(key, token, RequestBuilder.ORGANIZATION_URL, name)).doGet();
	}
	
	@Override
	public OrganizationMember[] getOrganizationMembersByOrganizationId(String id) {
		return new HttpRequest<OrganizationMember[]>(OrganizationMember[].class).builder(new RequestBuilder(key, token, RequestBuilder.ORGANIZATION_MEMBERS_URL, id)).doGet();
	}
	
	@Override
	public Board[] getBoardsByOrganizationId(String id) {
		return new HttpRequest<Board[]>(Board[].class).builder(new RequestBuilder(key, token, RequestBuilder.ORGANIZATION_BOARDS_URL, id)).doGet();
	}

	@Override
	public OrganizationMembership[] getOrganizationMemberShipsByOrganizationId(String id) {
		return new HttpRequest<OrganizationMembership[]>(OrganizationMembership[].class).builder(new RequestBuilder(key, token, RequestBuilder.ORGANIZATION_MEMBERSHIPS_URL, id)).doGet();
	}

	@Override
	public BoardAction[] getActionsByBoardId(String id) {
		return new HttpRequest<BoardAction[]>(BoardAction[].class).builder(new RequestBuilder(key, token, RequestBuilder.BOARD_ACTIONS_URL, id)).doGet();
	}

}
