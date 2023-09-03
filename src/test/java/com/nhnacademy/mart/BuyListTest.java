package com.nhnacademy.mart;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {

    @Test
    @DisplayName("BuyList 클래스 통합 테스트")
    void buyListTest() {
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Assertions.assertEquals(buyList.getItems().get(0).getName(), "양파");
        Assertions.assertEquals(buyList.getItems().get(0).getAmount(), 2);
    }

    @Test
    @DisplayName("BuyList 클래스 통합 테스트 2")
    void buyList2Test() {
        List<BuyList.Item> itemTest = List.of(
                new BuyList.Item("양파", 2),
                new BuyList.Item("마늘", 123));

        BuyList buyList = new BuyList();
        buyList.add("양파 2 마늘 123");

        for (int i = 0; i < buyList.getItems().size(); i++) {
            Assertions.assertEquals(itemTest.get(i).getName(), buyList.getItems().get(i).getName());
            Assertions.assertEquals(itemTest.get(i).getAmount(), buyList.getItems().get(i).getAmount());
        }
    }

    @Test
    @DisplayName("item 생성자 테스트")
    void itemConstructorTest(){
        BuyList.Item item = new BuyList.Item("마늘", 2);

        Assertions.assertEquals(item.getAmount(),2);
        Assertions.assertEquals(item.getName(), "마늘");
    }


}