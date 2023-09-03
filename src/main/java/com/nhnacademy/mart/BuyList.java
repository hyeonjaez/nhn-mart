package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(String buy) {
        String[] buyList = buy.split(" ");
        for (int i = 1; i < buyList.length; i += 2) {
            items.add(new Item(buyList[i - 1], Integer.parseInt(buyList[i])));
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }


}
