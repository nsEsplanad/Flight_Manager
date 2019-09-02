package com.lexicon.dao;

import com.lexicon.domain.Flight;

import java.util.Collection;

public interface FlightDao {
    void createFlight(Flight flight);
    Collection<Flight> getFlight(String flightNumber);
}
