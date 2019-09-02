package com.lexicon.dao;

import com.lexicon.domain.Airplane;
import com.lexicon.domain.Flight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightDaoImpl implements FlightDao {
    Map<String, Flight> flights=new HashMap<>();
    @Override
    public void createFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    @Override
    public Collection<Flight> getFlight(String flightNumber) {
        return flights.values().stream().map(flight -> Flight.builder().withFlightNumber(flight.getFlightNumber())
                        .withAirplane(Airplane.builder().withAirId(flight.getAirplane().getAirId()).withAirplaneName(flight.getAirplane()
                                .getAirplaneName()).withAirlineName(flight.getAirplane().getAirlineName()).build()).withSource(flight.getSource())
                                .withDestination(flight.getDestination()).build()).collect(Collectors.toList());
    }
}
