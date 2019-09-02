package com.lexicon.dao;

import com.lexicon.domain.Passenger;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {
    Map<Integer, Passenger> passengers=new HashMap<>();
    @Override
    public void createPassenger(int id, Passenger passenger) {
        passengers.put(id, passenger);
    }
}
