package com.codeclan.example.character;

public class Wizard extends Character{

    private Spells selectedSpell;
    private Creature selectedCreature;

    public Wizard(String name, int health, int mana, int attackPower, int spellPower) {
        super(name, health, mana, attackPower, spellPower);
    }

    public void setSelectedSpell(Spells selectedSpell) {
        this.selectedSpell = selectedSpell;
    }

    public void setSelectedCreature(Creature selectedCreature) {
        this.selectedCreature = selectedCreature;
    }

    public Creature getSelectedCreature() {
        return selectedCreature;
    }
    public void castSpell(ITargetable target){
        int damage = getSpellPower() + selectedSpell.getValue();
        target.recieveDamage(damage);
    }
    public void recieveDamage(int damage){
        setHealth(getHealth() - damage);
        if (getHealth() < 1) {
            setAlive(false);
        }
    }
}
