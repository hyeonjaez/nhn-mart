package com.nhnacademy.mart;

import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartTest {

    @Test
    @DisplayName("prepareMart() 테스트입니다")
    void prepareMartTest() {
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();

        FoodStand foodStand = new FoodStand();
        int test =
                Collections.frequency(nhnMart.getFoodStand().getFoods(), new Food("양파", 1_000));
        int onionCount = 2;
        int eggCount = 5;
        int faaCount = 10;
        int appleCount = 20;

        int onionTest = 0;
        int eggTest = 0;
        int faaTest = 0;
        int appleTest = 0;
        for (Food food : nhnMart.getFoodStand().getFoods()) {

            if (food.getName() == "양파") {
                onionTest++;
            } else if (food.getName() == "계란") {
                eggTest++;
            } else if (food.getName() == "파") {
                faaTest++;
            } else if (food.getName() == "사과") {
                appleTest++;
            }
        }

        Assertions.assertEquals(onionCount, onionTest);
        Assertions.assertEquals(eggTest, eggCount);
        Assertions.assertEquals(faaCount, faaTest);
        Assertions.assertEquals(appleTest, appleCount);

    }

}