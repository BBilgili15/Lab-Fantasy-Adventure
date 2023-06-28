package com.codeclan.example.weapons;

public class Weapon implements IBaggable {
    private String name;
    private int damage;
    private int sellPrice;

    public Weapon(String name, int damage, int sellPrice) {
        this.name = name;
        this.damage = damage;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
