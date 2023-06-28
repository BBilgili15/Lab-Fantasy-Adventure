package com.codeclan.example.character;

public enum Spells {
    FIREBALL(50),
    LIGHTNING_STRIKE(60);
    private int damage;

    Spells (int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
