package com.codeclan.example.character;

import com.codeclan.example.IHealable;
import com.codeclan.example.ITargetable;
import com.codeclan.example.mythical_creature.MythicalCreature;

public class Wizard extends Character implements IHealable {

    private Spells selectedSpell;
    private MythicalCreature selectedCreature;

    public Wizard(String name, int health, int mana, int attackPower, int spellPower) {
        super(name, health, mana, attackPower, spellPower);
    }

    public void setSelectedSpell(Spells selectedSpell) {
        this.selectedSpell = selectedSpell;
    }

    public void setSelectedCreature(MythicalCreature selectedCreature) {
        this.selectedCreature = selectedCreature;
    }

    public MythicalCreature getSelectedCreature() {
        return selectedCreature;
    }
    public void castSpell(ITargetable target){
        int damage = getSpellPower() + selectedSpell.getDamage();
        selectedCreature.attack(target);
        target.receiveDamage(damage);
    }
    public void receiveDamage(int damage){
        setHealth(getHealth() - damage);
        if (getHealth() < 1) {
            setAlive(false);
        }
    }
    public int getSelectedSpellValue(){
        return selectedSpell.getDamage();
    }



}
