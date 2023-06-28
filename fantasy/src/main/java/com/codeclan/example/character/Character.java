package com.codeclan.example.character;

import java.util.ArrayList;

public abstract class Character {
    private  String name;
    private    int health;
    private  int mana;
    private int attackPower;
    private  int spellPower;
    private  Boolean alive;
    private ArrayList<IBaggable>  bag;

    public Character(String name, int health, int mana, int attackPower, int spellPower){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attackPower = attackPower;
        this.spellPower = spellPower;
        this.bag = new ArrayList<IBaggable>();
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public String getHealthString(){
        return health + "hp";
    }
    public String getManaString(){
        return mana + "mp";
    }
    public String getAttackPowerString(){
        return attackPower + "AP";
    }
    public String getSpellPowerString(){
        return spellPower + "SP";
    }
    public void addItemInBag(IBaggable item){
        bag.add(item);
    }

    public IBaggable removeItemFromBag(IBaggable item){
        return bag.remove(bag.indexOf(item));
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
