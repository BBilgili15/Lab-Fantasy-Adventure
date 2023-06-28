package com.codeclan.example.weapons;

public class Potion implements IBaggable {
    private String name;
    private int value;
    private int sellPrice;

    public Potion(String name, int value, int sellPrice) {
        this.name = name;
        this.value = value;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
