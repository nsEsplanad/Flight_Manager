package com.lexicon.dao;

import com.lexicon.domain.Food;
import com.lexicon.domain.TripClass;
import org.junit.Assert;
import org.junit.Test;

public class FoodDaoImplTest {

    @Test
    public void createFoodTest(){
       Food food= Food.builder().withFoodName("Rice").withFoodPrice(8d).build();
        Assert.assertTrue("this should be true", food.getFoodName().equals("Rice"));
    }

    @Test
    public void menu(){


        Food food = Food.builder().withId(1).withFoodName("Lax").withFoodPrice(45d).withTripClass(TripClass.BUSINESS_CLASS).build();

        Food food2 = Food.builder().withId(2).withFoodName("MaiThai").withFoodPrice(20d).withTripClass(TripClass.ECONOMY_CLASS).build();
        Food food3 = Food.builder().withId(2).withFoodName("rice").withFoodPrice(25d).withTripClass(TripClass.ECONOMY_CLASS).build();
        Food food4 = Food.builder().withId(2).withFoodName("Thandhori").withFoodPrice(50d).withTripClass(TripClass.BUSINESS_CLASS).build();

//        food.builder().withFoodName("chicken").withFoodPrice(5d).withTripClass(TripClass.ECONOMY_CLASS).build();
//        foods.put(6, food);
//
//        food.builder().withFoodName("ric").withFoodPrice(3d).withTripClass(TripClass.ECONOMY_CLASS).build();
//        foods.put(7, food);
        FoodDao foodDao=new FoodDaoImpl();
        foodDao.createFood(food.getId(),food);
        foodDao.createFood(food2.getId(),food2);
        foodDao.createFood(food3.getId(),food3);
        foodDao.createFood(food4.getId(), food4);

        System.out.println(foodDao.menu(TripClass.BUSINESS_CLASS).size());
        System.out.println(foodDao.menu(TripClass.BUSINESS_CLASS));
    }

}
