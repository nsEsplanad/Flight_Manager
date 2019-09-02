package com.lexicon.dao;

import com.lexicon.dao.AirplaneDao;
import com.lexicon.domain.Airplane;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AirplaneDaoImpl implements AirplaneDao {
    Map<Integer, Airplane> airplanes=new HashMap<>();
    @Override
    public void createAirplane(Airplane airplane) {
        airplanes.put(airplane.getAirId(), airplane);
    }

    @Override
    public List<Airplane> getAirPlanes(String airlineName) {
        return airplanes.values().stream().map(airplane -> Airplane.builder().withAirId(airplane.getAirId())
                .withAirplaneName(airplane.getAirplaneName()).withAirlineName(airplane.getAirlineName()).build())
                .collect(Collectors.toList());
    }


}
