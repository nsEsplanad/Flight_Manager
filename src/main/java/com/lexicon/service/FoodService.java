package com.lexicon.service;

import com.lexicon.domain.Food;
import com.lexicon.domain.TripClass;

import java.util.List;

public interface FoodService {
    void createFood(Integer id, Food food);
    List<Food> menu(TripClass tripClass);
}
