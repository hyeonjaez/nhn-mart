package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("Customer 생성자 테스트 입니다")
    void customerConstructorTest() {
        BuyList buyList = new BuyList();
        buyList.getItems().add(new BuyList.Item("양파", 2));
        int money = 1000;

        Customer customer = new Customer(buyList, money);

        Assertions.assertEquals(customer.getMoney(), money);
        Assertions.assertEquals(customer.getBuyList(), buyList);
    }

    @Test
    @DisplayName("")
    void pickFoodsTest() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 2000));

        BuyList buyList = new BuyList();
        buyList.getItems().add(new BuyList.Item("양파", 1));
        int money = 2000;

        Customer customer = new Customer(buyList, money);

        Basket basket = new Basket();
        basket.add(new Food("양파", 2000));
        customer.pickFoods(foodStand);

        Assertions.assertEquals(basket.getFoods().get(0).getPrice(), customer.getBasket().getFoods().get(0).getPrice());
        Assertions.assertEquals(basket.getFoods().get(0).getName(), customer.getBasket().getFoods().get(0).getName());

    }

}