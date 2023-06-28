package com.codeclan.example.character;

import com.codeclan.example.IHealable;

public abstract class Character implements IHealable {
    private  String name;
    private  int health;
    private  int mana;
    private int attackPower;
    private  int spellPower;
    private  Boolean alive;
    private  int wallet;


    public Character(String name, int health, int mana, int attackPower, int spellPower){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attackPower = attackPower;
        this.spellPower = spellPower;
        this.alive = true;
        this.wallet = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Boolean getAlive() {
        return alive;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
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

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void getHealed(int value) {
        this.health += value;
    }

    public void collectReward(int reward) {
        wallet += reward;
    }
}
