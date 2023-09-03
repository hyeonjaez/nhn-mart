package com.nhnacademy.mart;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : buyList.getItems()) {
            int itemCount = 0;

            for (Food food : foodStand.getFoods()) {
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


    // TODO payTox 메서드 구현


}