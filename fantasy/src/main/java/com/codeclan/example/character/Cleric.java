package com.codeclan.example.character;

public class Cleric extends Character{
    private Potion selectedPostion;
    public Cleric(String name, int health, int mana, int attackPower, int spellPower) {
        super(name, health, mana, attackPower, spellPower);
    }

    public void setSelectedPostion(Potion selectedPostion) {
        this.selectedPostion = selectedPostion;
    }
    public void castSpell(IHealable target){
        int damage = getSpellPower() + selectedSpell.getValue();
        target.recieveDamage(damage);
    }
    public void recieveDamage(int damage){
        setHealth(getHealth()-damage);
        if (getHealth() < 1) {
            setAlive(false);
        }
    }
}
