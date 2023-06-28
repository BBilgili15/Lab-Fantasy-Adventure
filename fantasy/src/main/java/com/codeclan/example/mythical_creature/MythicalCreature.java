package com.codeclan.example.mythical_creature;

public abstract class MythicalCreature {
    private String name;
    private int attackPower;
    private int health;
    private Boolean alive;

    public MythicalCreature(String name, int attackPower, int health){
        this.name= name;
        this.attackPower = attackPower;
        this.health = health;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attackPower;
    }

    public int getHealth() {
        return health;
    }
    public String getHealthString(){
        return health + "hp";
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAttackPowerString(){
        return attackPower + "AP";
    }
    public void attack(ITargetable target){
        int damage = getAttack();
        target.recieveDamage(damage);
    }
    public void recieveDamage(int damage){
        setHealth(getHealth() - damage);
        if (getHealth() < 1) {
            setAlive(false);
        }
    }
}
