package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.List;
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

    @Test
    @DisplayName("add(), getFoods() 테스트 2")
    void basketTest2() {
        List<Food> foodsTest = List.of(
                new Food("양배추", 10000),
                new Food("닭가슴살", 2500),
                new Food("프로틴 우유", 2300));

        Basket basket = new Basket();
        basket.add(new Food("양배추", 10000));
        basket.add(new Food("닭가슴살", 2500));
        basket.add(new Food("프로틴 우유", 2300));

        for (int i = 0; i < basket.getFoods().size(); i++) {

            Assertions.assertEquals(basket.getFoods().get(i).getName(), foodsTest.get(i).getName());
            Assertions.assertEquals(basket.getFoods().get(i).getPrice(), foodsTest.get(i).getPrice());
        }
    }

}




