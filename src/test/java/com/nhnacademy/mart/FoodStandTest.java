package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {

    @Test
    @DisplayName("add() 구현")
    void addTest() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));

        Assertions.assertEquals(foodStand.getFoods().get(0).getName(), "양파");
        Assertions.assertEquals(foodStand.getFoods().get(0).getPrice(), 1000);
    }

}