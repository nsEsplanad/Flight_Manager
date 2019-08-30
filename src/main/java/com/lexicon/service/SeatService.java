package com.lexicon.service;

import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;

import java.util.List;

public interface SeatService {
    void createSeats(int id, Seat seat);
    List<Seat> allSeats(TripClass tripClass);
}
