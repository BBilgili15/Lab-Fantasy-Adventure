package com.codeclan.example.character;

import com.codeclan.example.ITargetable;
import com.codeclan.example.weapons.Weapon;

public class Knight extends Character{

    private IBagga selected;
    public  int armor;

    public Knight(String name, int health, int mana, int attackPower, int spellPower, int armor) {
        super(name, health, mana, attackPower, spellPower);
        this.armor = armor;

    }
    public void setSelected(Weapon item){
        selected = removeItemFromBag((Weapon) item);
    }

    public int getArmor() {
        return armor;
    }
    public String getArmorString(){
        return armor + "DP";
    }
    public void attack(ITargetable target){
        int damage = getAttackPower() + selected.getDamage();
        target.recieveDamage(damage);
    }
    public void recieveDamage(int damage){
        setHealth(getHealth()-(damage - armor));
        if (getHealth() < 1) {
            setAlive(false);
        }
    }


}
