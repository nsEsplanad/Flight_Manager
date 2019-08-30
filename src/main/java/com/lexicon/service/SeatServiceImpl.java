package com.lexicon.service;

import com.lexicon.dao.SeatDao;
import com.lexicon.dao.SeatDaoImpl;
import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;

import java.util.List;

public class SeatServiceImpl implements SeatService {
    SeatDao seatDao=new SeatDaoImpl();

    @Override
    public void createSeats(int id, Seat seat) {
    seatDao.createSeats(id,seat);
    }

    @Override
    public List<Seat> allSeats(TripClass tripClass) {
        return allSeats(tripClass);
    }
}