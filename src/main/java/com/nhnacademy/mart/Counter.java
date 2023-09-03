package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {

    private final static Logger logger = LoggerFactory.getLogger(Counter.class);

    public int pay(Basket basket) {
        int totalPrice = 0;

        for (Food food : basket.getFoods()) {
            totalPrice += food.getPrice();
        }
        printMsg(totalPrice);
        return totalPrice;
    }

    private void printMsg(int totalPrice) {
        logger.info("총 가격은 " + totalPrice + "원 입니다.");
    }
}