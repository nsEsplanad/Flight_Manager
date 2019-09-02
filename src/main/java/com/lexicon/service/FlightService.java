package com.lexicon.service;

import com.lexicon.domain.Flight;

import java.util.Collection;

public interface FlightService {
    void createFlight(Flight flight);
    Collection<Flight> getFlight(String flightNumber);
}
