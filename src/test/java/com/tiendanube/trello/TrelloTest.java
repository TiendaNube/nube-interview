package com.tiendanube.trello;

import junit.framework.TestCase;

public class TrelloTest extends TestCase {

    private TrelloService service;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        service = new TrelloService();
    }

    public void testCreateBoard() {
        service.createBoard("backlog");
        assertTrue(service.hasBoard("backlog"));
    }

    public void testAddListToBoard() {

    }

    public void testAddCardToList() {

    }

    public void testAddingMoreThanTenCardsToAListShouldFail() {

    }

    public void testAddCommentToCard() {

    }

    public void testMoveCardBetweenTwoLists() {

    }

    public void testArchiveCard() {

    }
}
