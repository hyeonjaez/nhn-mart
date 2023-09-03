package com.nhnacademy.mart;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    @DisplayName("Basket 클래스의 add(), getFoods() 테스트")
    void basketTest() {
        Basket basket = new Basket();
        basket.add(new Food("계란", 10000));

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("계란", 10000));

        Assertions.assertEquals(basket.getFoods().get(0).getPrice(), foods.get(0).getPrice());
        Assertions.assertEquals(basket.getFoods().get(0).getName(), foods.get(0).getName());
    }

}