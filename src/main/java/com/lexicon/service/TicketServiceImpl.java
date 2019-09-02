package com.lexicon.service;

import com.lexicon.dao.TicketDao;
import com.lexicon.dao.TicketDaoImpl;
import com.lexicon.domain.Ticket;

import java.util.List;

public class TicketServiceImpl implements TicketService {
    private TicketDao ticketDao;

    public TicketServiceImpl(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @Override
    public void createTicket(Integer id, Ticket ticket) {
        ticketDao.createTicket(id, ticket);
    }

    @Override
    public List<Ticket> listTickets() {
        return ticketDao.listTickets();
    }

    @Override
    public double ticketTotalCost(int passengerId) {
        return ticketTotalCost(passengerId);
    }

}
