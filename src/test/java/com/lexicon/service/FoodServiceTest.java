package com.lexicon.service;

import com.lexicon.dao.FoodDao;
import com.lexicon.dao.FoodDaoImpl;
import com.lexicon.domain.Food;

public class FoodServiceTest {

    public void createFoodMenu(Integer id, Food food){
        FoodDao foodDao=new FoodDaoImpl();
        FoodService foodService=new FoodServiceImpl(foodDao);


    }
}
