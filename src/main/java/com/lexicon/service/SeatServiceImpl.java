package com.lexicon.service;

import com.lexicon.dao.SeatDao;
import com.lexicon.dao.SeatDaoImpl;
import com.lexicon.domain.Seat;
import com.lexicon.domain.TripClass;

import java.util.List;

public class SeatServiceImpl implements SeatService {
    private SeatDao seatDao;

    public void setSeatDao(SeatDao seatDao) {
        this.seatDao = seatDao;
    }

    public SeatServiceImpl(SeatDao seatDao) {
        this.seatDao = seatDao;
    }

    @Override
    public void createSeats(int id, Seat seat) {
    seatDao.createSeats(id,seat);
    }

    @Override
    public List<Seat> allSeats(TripClass tripClass) {
        return seatDao.allSeats(tripClass);
    }
}