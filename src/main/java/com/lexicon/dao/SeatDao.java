package com.lexicon.dao;

import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;

import java.util.Collection;
import java.util.List;

public interface SeatDao {

    void createSeats(int id,Seat seat);
    Collection<Seat> allSeats(TripClass tripClass);
}
