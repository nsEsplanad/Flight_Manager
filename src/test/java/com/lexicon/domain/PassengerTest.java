package com.lexicon.domain;

import org.junit.Assert;
import org.junit.Test;

public class PassengerTest {

    @Test
    public void passengerTest(){
        Passenger passenger=Passenger.builder()
                .withFirstName("Erik")
                .withLastName("Andersson")
                .build();
        Assert.assertTrue(passenger.getFirstName().equals("Erik"));
       // Assert.assertEquals("Ali", passenger.getFirstName());

    }
}
