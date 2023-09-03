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

}