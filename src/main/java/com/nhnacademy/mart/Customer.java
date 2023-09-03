package com.nhnacademy.mart;

import java.util.Iterator;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;
    private final int money;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList, int money) {
        this.buyList = buyList;
        this.money = money;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : buyList.getItems()) {
            int itemCount = 0;

            for (Iterator<Food> foods = foodStand.getFoods().iterator(); foods.hasNext(); ) {
                Food food = foods.next();

                if (item.getName().equals(food.getName())) {
                    if (itemCount == item.getAmount()) {
                        break;

                    } else {
                        basket.add(food);
                        itemCount++;
                        foodStand.delete(food);
                    }
                }
            }
        }
    }

    public void payTox(Counter counter) {
        System.out.println("고객님 결제 후 잔액 : " + (money - counter.pay(basket)));
    }


}