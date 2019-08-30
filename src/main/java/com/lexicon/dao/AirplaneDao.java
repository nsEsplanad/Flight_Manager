package com.lexicon.dao;

import com.lexicon.domain.Airplane;

import java.util.List;

public interface AirplaneDao {
    void createAirplane(Airplane airplane);
    List<Airplane> getAirPlanes(String airlineName);
}
