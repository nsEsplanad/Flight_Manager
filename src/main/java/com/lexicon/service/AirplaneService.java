package com.lexicon.service;

import java.util.List;

public interface AirplaneService {
    void createAirplane(com.lexicon.domain.Airplane airplane);
    List<com.lexicon.domain.Airplane> getAirPlanes(String airlineName);
}
