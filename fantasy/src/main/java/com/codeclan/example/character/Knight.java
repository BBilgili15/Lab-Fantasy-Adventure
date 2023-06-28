package com.codeclan.example.character;

import com.codeclan.example.ITargetable;
import com.codeclan.example.weapons.Weapon;


import java.util.ArrayList;


public class Knight extends Character{

    private Weapon selected;
    public  int armor;
    private ArrayList<Weapon> weapons;

    public Knight(String name, int health, int mana, int attackPower, int spellPower, int armor) {
        super(name, health, mana, attackPower, spellPower);
        this.armor = armor;
        weapons = new ArrayList<Weapon>();
    }
    public void setSelected(Weapon item){
        selected = removeWeapon((Weapon) item);
    }

    public Weapon removeWeapon(Weapon weapon) {
        if (weapons.contains(weapon)){
            return weapons.remove(weapons.indexOf(weapon));
        } else {
            return null;
        }
    }

    public Weapon getSelected() {
        return selected;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public int getArmor() {
        return armor;
    }

    public String getArmorString(){
        return armor + "DP";
    }
    public void attack(ITargetable target){
        int damage = getAttackPower() + selected.getDamage();
        target.receiveDamage(damage);
    }
    public void receiveDamage(int damage){
        setHealth(getHealth()-(damage - armor));
        if (getHealth() < 1) {
            setAlive(false);
        }
    }


}
