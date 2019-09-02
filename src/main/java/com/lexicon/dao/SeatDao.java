package com.lexicon.dao;

import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;

import java.util.List;

public interface SeatDao {

    void createSeats(int id,Seat seat);
    List<Seat> allSeats(TripClass tripClass);
}
