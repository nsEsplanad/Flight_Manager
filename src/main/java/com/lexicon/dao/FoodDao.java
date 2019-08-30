package com.lexicon.dao;

import com.lexicon.domain.Food;
import com.lexicon.domain.TripClass;

import java.util.List;

public interface FoodDao {
    void createFood(Integer id,Food food);
    List<Food> menu(TripClass tripClass);
}
