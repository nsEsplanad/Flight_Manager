package com.lexicon.service;

import com.lexicon.dao.AirplaneDao;
import com.lexicon.domain.Airplane;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {

    private AirplaneDao airplaneDao;

    public AirplaneServiceImpl(){

    }

    public AirplaneServiceImpl(AirplaneDao airplaneDao) {
        this.airplaneDao = airplaneDao;
    }

    public void setAirplaneDao(AirplaneDao airplaneDao) {
        this.airplaneDao = airplaneDao;
    }

    @Override
    public void createAirplane(Airplane airplane) {
        airplaneDao.createAirplane(airplane);
    }

    @Override
    public List<Airplane> getAirPlanes(String airlineName) {
        return airplaneDao.getAirPlanes(airlineName);
    }
}
