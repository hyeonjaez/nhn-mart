package com.nhnacademy.mart;

public class Counter {

    public int pay(Basket basket) {
        int totalPrice = 0;

        for (Food food : basket.getFoods()) {
            totalPrice += food.getPrice();
        }
        System.out.println("총 가격은 " + totalPrice + "원 입니다.");
        return totalPrice;
    }
}