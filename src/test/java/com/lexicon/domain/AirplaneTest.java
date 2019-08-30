package com.lexicon.domain;

import org.junit.Assert;
import org.junit.Test;

public class AirplaneTest {

    @Test
    public void airplaneTest(){
        Airplane airplane=Airplane.builder().withAirlineName("Turkish Airline").withAirplaneName("Bwing20").build();
        Assert.assertTrue(airplane.getAirplaneName().equals("Bwing20"));

    }
}
