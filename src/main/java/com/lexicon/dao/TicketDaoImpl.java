package com.lexicon.dao;

import com.lexicon.domain.Ticket;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TicketDaoImpl implements TicketDao {
    private Map<Integer, Ticket> tickets = new HashMap<>(10);

    @Override
    public void createTicket(Integer id, Ticket ticket) {
        tickets.put(id, ticket);
    }

    @Override
    public List<Ticket> listTickets() {
        return tickets.values().stream().map(seat -> Ticket.builder().withTicketId(seat.getTicketId())
                .withTicketClass(seat.getTripClass()).withPassenger(seat.getPassenger())
                .withCost(seat.getCost()).withSeat(seat.getSeat()).build()).collect(Collectors.toList());

    }
    @Override
    public double ticketTotalCost(int passengerId) {
        double seatPrice = 0.0;
        double foodPrice=0.0;
       /* List<Ticket> ticket = tickets.values().stream().map(seat -> Ticket.builder().withTicketId(seat.getTicketId())
                .withTicketClass(seat.getTripClass()).withPassenger(seat.getPassenger())
                .withCost(seat.getCost()).withSeat(seat.getSeat()).build()).collect(Collectors.toList());

        ListIterator<Ticket> listIterator = ticket.listIterator();*/

            //seatPrice = tickets.values().stream().mapToDouble(ticket1 -> ticket1.getSeat().getPrice());
            seatPrice=tickets.entrySet().stream().filter(x->passengerId==x.getKey()).map(x->x.getValue()).collect(Collectors.summingDouble(ticket1 -> ticket1.getSeat().getPrice()));
            foodPrice=tickets.entrySet().stream().filter(x->passengerId==x.getKey()).map(x->x.getValue()).collect(Collectors.summingDouble(ticket1 -> ticket1.getFood().getFoodPrice()));

        return seatPrice+foodPrice;


        /*List<Ticket> ticket = tickets.values().stream().filter(tic -> tic.getPassenger().getPassengerId() == passengerId).collect(Collectors.toList());


        double seatPrice = tickets.values().stream().filter(ticket -> ticket.getPassenger().getPassengerId() == passengerId)
                .mapToDouble(ticket -> ticket.getSeat().getPrice()) */

                /*return   tickets.values().stream().filter(ticket -> ticket.getPassenger().getPassengerId() == passengerId)
                .mapToDouble(ticket -> ticket.getFood().getFoodPrice()+ticket.getSeat().getPrice()).sum();*/

               /* .map(ticket -> Ticket.builder().withTicketId(ticket.getTicketId()).withTicketClass(ticket.getTripClass())
                        .withPassenger(ticket.getPassenger()).withCost(ticket.getSeat().getPrice()+ticket.getFood().getFoodPrice()).build());*/
    }

    /*@Override
    public double ticketTotalCost(int passengerId) {
        //return tickets.values().stream().filter(ticket -> ticket.getPassenger().getPassengerId()==passengerId).flatMapToDouble(ticket -> ticket.getSeat().getPrice());

        Stream<Object> objectStream = tickets.values().stream().filter(ticket -> ticket.getPassenger().getPassengerId() == passengerId)
                .map(ticket -> ticket.getSeat().getPrice());
        return 0.0d;
    }*/
}
