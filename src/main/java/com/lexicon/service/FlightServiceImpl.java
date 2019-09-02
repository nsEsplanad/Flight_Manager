package com.lexicon.service;

import com.lexicon.dao.FlightDao;
import com.lexicon.domain.Flight;

import java.util.Collection;

public class FlightServiceImpl implements FlightService {
    private FlightDao flightDao;

    public FlightServiceImpl(){

    }

    public FlightServiceImpl(FlightDao flightDao) {
        this.flightDao = flightDao;
    }
    public void setFlightDao(FlightDao flightDao) {
        this.flightDao = flightDao;
    }
    @Override
    public void createFlight(Flight flight) {
        flightDao.createFlight(flight);
    }
    @Override
    public Collection<Flight> getFlight(String flightNumber) {
        return flightDao.getFlight(flightNumber);
    }

    public Double getTotalincome(){


        return 0.0;
    }
}
