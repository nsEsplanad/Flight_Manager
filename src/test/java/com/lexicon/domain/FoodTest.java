package com.lexicon.domain;

import org.junit.Assert;
import org.junit.Test;

public class FoodTest {
    @Test
    public void foodTest(){
        Food food= Food.builder().withFoodName("Lax").withFoodPrice(20.0d).build();
        Assert.assertEquals("Lax", food.getFoodName());
    }
}
