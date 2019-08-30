package com.lexicon.dao;

import com.lexicon.domain.Ticket;

import java.util.List;

public interface TicketDao {
    void createTicket(Integer id, Ticket ticket);
    List<Ticket> listTickets();
}
