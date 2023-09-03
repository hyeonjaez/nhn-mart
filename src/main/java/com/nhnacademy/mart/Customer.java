package com.nhnacademy.mart;

import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private final static Logger logger = LoggerFactory.getLogger(Customer.class);
    private final BuyList buyList;
    private final int money;
    private Basket basket;

    public BuyList getBuyList() {
        return buyList;
    }

    public int getMoney() {
        return money;
    }

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
                        foods.remove();
                    }
                }
            }
        }
    }

    public void payTox(Counter counter) {
        printMsg(money - counter.pay(basket));
    }

    private void printMsg(int remainMoney) {
        logger.info("고객님 결제 후 잔액 : " + remainMoney);
    }


}