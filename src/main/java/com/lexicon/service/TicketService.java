package com.lexicon.service;

import com.lexicon.domain.Ticket;

import java.util.List;

public interface TicketService {
    void createTicket(Integer id, Ticket ticket);
    List<Ticket> listTickets();
    double ticketTotalCost(int passengerId);
}
