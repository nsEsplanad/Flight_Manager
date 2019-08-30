package com.lexicon.dao;

import com.lexicon.domain.Ticket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TicketDaoImpl implements TicketDao {
    private Map<Integer, Ticket> tickets=new HashMap<>(10);
    @Override
    public void createTicket(Integer id, Ticket ticket) {
        tickets.put(id, ticket);
    }

    @Override
    public List<Ticket> listTickets() {
        return tickets.values().stream().map(seat-> Ticket.builder().withTicketId(seat.getTicketId())
                .withTicketClass(seat.getTripClass()).withPassenger(seat.getPassenger())
                .withCost(seat.getCost()).withSeat(seat.getSeat()).build()).collect(Collectors.toList());
    }
}
