package com.lexicon.service;

import com.lexicon.dao.FoodDao;
import com.lexicon.domain.Food;
import com.lexicon.domain.TripClass;

import java.util.List;

public class FoodServiceImpl implements FoodService {
    private FoodDao foodDao;

    public FoodServiceImpl(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    public void setFoodDao(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @Override
    public void createFood(Integer id, Food food) {
        foodDao.createFood(id, food);
    }

    @Override
    public List<Food> menu(TripClass tripClass) {
        return foodDao.menu(tripClass);
    }
}
