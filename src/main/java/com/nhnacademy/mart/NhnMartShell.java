package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");
        BuyList buyList = inputBuyListFromShell();

        Customer jaehyeon = new Customer(buyList, 20000);

        // 장바구니를 챙긴다.
        jaehyeon.bring(mart.provideBasket());

        // 식품을 담는다.
        jaehyeon.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        jaehyeon.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {

        Scanner scanner = new Scanner(System.in);
        String buyLists = scanner.nextLine();
        BuyList buyList = new BuyList();

        buyList.add(buyLists);
        scanner.close();

        return buyList;
    }
}

