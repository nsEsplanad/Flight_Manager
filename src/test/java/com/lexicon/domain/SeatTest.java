package com.lexicon.domain;

import org.junit.Assert;
import org.junit.Test;

public class SeatTest {

    @Test
    public void seatTest(){
        Seat seat=Seat.builder().withSeatNumber(2).withTripClass(TripClass.BUSINESS_CLASS).withPrice(20000d).build();
        Assert.assertEquals(2,seat.getSeatNumber());
    }
}
