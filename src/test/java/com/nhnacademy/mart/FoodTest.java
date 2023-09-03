package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {

    @Test
    @DisplayName("Food 생성자 테스트")
    void foodConstructorTest() {
        Food food = new Food("양파", 100);

        Assertions.assertEquals(food.getName(), "양파");
        Assertions.assertEquals(food.getPrice(), 100);
    }

}