package com.codeclan.example.enemy;

import com.codeclan.example.ITargetable;

public abstract class Enemy implements ITargetable {
    private int attack;
    private int health;
    private boolean alive;

    public Enemy(int attack, int health, boolean alive) {
        this.attack = attack;
        this.health = health;
        this.alive = true;

    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void giveReward(Character character);

    public void receiveDamage(int damage) {
        setHealth(health -= damage);
        if (health > 1) {
            setAlive(false);
        }
    }
    public void attack(ITargetable target){
        int damage = getAttack();
        target.receiveDamage(damage);
    }

}
