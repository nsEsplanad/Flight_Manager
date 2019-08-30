package com.lexicon.dao;

import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;
import org.junit.Test;

public class SeatDaoTest {
    @Test
    public void listSeats(){
        SeatDao seatDao=new SeatDaoImpl();
        Seat seat1=Seat.builder().withSeatNumber(1).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();
        Seat seat2=Seat.builder().withSeatNumber(2).withPrice(20000d)
                .withTripClass(TripClass.BUSINESS_CLASS).build();
        Seat seat3=Seat.builder().withSeatNumber(3).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();
        seatDao.createSeats(seat1.getSeatNumber(),seat1);
        seatDao.createSeats(seat2.getSeatNumber(),seat2);
        seatDao.createSeats(seat3.getSeatNumber(),seat3);

        System.out.println(seatDao.allSeats(TripClass.ECONOMY_CLASS));

    }
}
