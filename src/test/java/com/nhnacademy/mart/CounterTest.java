package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    @DisplayName("pay() 테스트 입니다")
    void payTest() {
        Basket basket = new Basket();
        basket.add(new Food("마늘", 2000));
        basket.add(new Food("양파", 123));

        Counter counter = new Counter();
        Assertions.assertEquals(counter.pay(basket), 2123);
    }

}