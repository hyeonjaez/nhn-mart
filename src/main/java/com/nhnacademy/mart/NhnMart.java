package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NhnMart {

    private final static Logger logger = LoggerFactory.getLogger(NhnMart.class);
    private final FoodStand foodStand = new FoodStand();
    private final Counter counter = new Counter();

    public void prepareMart() {
        printMsg();
        fillFoodStand();
    }

    // 음식 세팅
    private void fillFoodStand() {
        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1_000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5_000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2_000));
        }
    }

    public FoodStand getFoodStand() {
        return foodStand;
    }

    public Basket provideBasket() {
        return new Basket();
    }

    public Counter getCounter() {
        return counter;
    }

    public void printMsg() {
        logger.info("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");
    }
}
