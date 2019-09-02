package com.lexicon.dao;


import com.lexicon.domain.Food;
import com.lexicon.domain.TripClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoodDaoImpl implements FoodDao {
    private Map<Integer, Food> foods=new HashMap<>();
    @Override
    public void createFood(Integer menuNO,Food food) {
        foods.put(menuNO,food);
    }

    @Override
    public List<Food> menu(TripClass tripClass) {
        return foods.values().stream()
                        .filter(food -> food.getTripClass()==tripClass)
                        .map(food -> Food.builder().withId(food.getId()).withFoodName(food.getFoodName())
                        .withFoodPrice(food.getFoodPrice()).withTripClass(food.getTripClass())
                        .build()).collect(Collectors.toList());
    }
}
