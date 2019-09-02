package com.lexicon.dao;

import com.lexicon.domain.*;
import org.junit.Assert;
import org.junit.Test;

public class TicketDaoTest {
    @Test
    public void totalTest(){
        TicketDao ticketDao=new TicketDaoImpl();
       // Ticket ticket = Ticket.builder().withPassenger(Passenger.builder().withPassengerId(1).withFirstName("AAA").withLastName("BBB").build());

        Ticket ticket=Ticket.builder().withPassenger(Passenger.builder().withPassengerId(1).withFirstName("A").withLastName("B").build())
                                .withFood(Food.builder().withId(1).withFoodName("AA").withFoodPrice(20d).withTripClass(TripClass.ECONOMY_CLASS).build())
                                .withSeat(Seat.builder().withSeatNumber(1).withPrice(5000d).withTripClass(TripClass.ECONOMY_CLASS).build())
                                .withTicketId("1d").withTicketClass(TripClass.ECONOMY_CLASS).build();
            ticketDao.createTicket(1,ticket);

        Ticket ticket2=Ticket.builder().withPassenger(Passenger.builder().withPassengerId(2).withFirstName("A").withLastName("B").build())
                     .withFood(Food.builder().withId(2).withFoodName("AA").withFoodPrice(50d).withTripClass(TripClass.ECONOMY_CLASS).build())
                     .withSeat(Seat.builder().withSeatNumber(2).withPrice(5000d).withTripClass(TripClass.ECONOMY_CLASS).build())
                     .withTicketId("1d").withTicketClass(TripClass.ECONOMY_CLASS).build();
            ticketDao.createTicket(2,ticket2);


        //Assert.assertEquals(5020,ticketDao.ticketTotalCost(ticket.getPassenger().getPassengerId()), 0d);
        System.out.println(ticketDao.ticketTotalCost(ticket.getPassenger().getPassengerId()));
        System.out.println(ticketDao.ticketTotalCost(ticket2.getPassenger().getPassengerId()));







    }
}
