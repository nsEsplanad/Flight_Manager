package com.lexicon.dao;

import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeatDaoImpl implements SeatDao {
    private Map<Integer, Seat> seats=new HashMap<>(10);
    @Override
    public void createSeats(int id,Seat seat) {
        seats.put(id,seat);
    }

    @Override
    public List<Seat> allSeats(TripClass tripClass) {
        return seats.values().stream().filter(seat -> seat.getTripClass().equals(tripClass))
                .map(seat -> Seat.builder()
                .withSeatNumber(seat.getSeatNumber()).withPrice(seat.getPrice())
                .withTripClass(seat.getTripClass()).build()).collect(Collectors.toList());
    }
}
