package com.lexicon.domain;

import org.junit.Assert;
import org.junit.Test;

public class TicketTest {

    @Test
    public void ticketTest(){
        Ticket ticket=Ticket.builder().withTicketId("111").withTicketClass(TripClass.ECONOMY_CLASS).withCost(300.0d).build();
        Assert.assertTrue("True ", ticket.getTicketId().equals("111"));
    }
}
