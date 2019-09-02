package com.lexicon.dao;

import com.lexicon.domain.Ticket;

import java.util.List;
import java.util.stream.Stream;

public interface TicketDao {
    void createTicket(Integer id, Ticket ticket);
    List<Ticket> listTickets();
    double ticketTotalCost(int passengerId);
}
