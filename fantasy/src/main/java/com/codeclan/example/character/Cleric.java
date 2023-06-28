package com.codeclan.example.character;

import com.codeclan.example.IHealable;
import com.codeclan.example.weapons.Potion;

import java.util.ArrayList;

public class Cleric extends Character{
    private Potion selectedPotion;
    private ArrayList<Potion> potions;
    public Cleric(String name, int health, int mana, int attackPower, int spellPower) {
        super(name, health, mana, attackPower, spellPower);
        potions = new ArrayList<Potion>();
    }

    public void addPotion(Potion potion){
        potions.add(potion);
    }

    public void setSelectedPotion(Potion selectedPotion) {
        this.selectedPotion = selectedPotion;
    }
    public void usePotion(IHealable target){
        int healValue = selectedPotion.getValue();
        target.getHealed(healValue);
    }
    public void receiveDamage(int damage){
        setHealth(getHealth()-damage);
        if (getHealth() < 1) {
            setAlive(false);
        }
    }
}
