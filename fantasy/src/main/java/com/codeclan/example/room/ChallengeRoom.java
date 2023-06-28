package com.codeclan.example.room;

import com.codeclan.example.character.*;
import com.codeclan.example.character.Character;
import com.codeclan.example.enemy.Enemy;
import com.codeclan.example.enemy.Orc;
import com.codeclan.example.mythical_creature.MythicalCreature;
import com.codeclan.example.weapons.Axe;
import com.codeclan.example.weapons.Potion;
import com.codeclan.example.weapons.Sword;
import com.codeclan.example.weapons.Weapon;

import javax.security.auth.login.CredentialException;
import java.util.ArrayList;

public class ChallengeRoom extends Room {
    private Enemy enemy;

    public ChallengeRoom(ArrayList<Character> characters, Enemy enemy) {
        super(characters);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void giveReward() {
        for (Character character: this.getCharacters()) {
            int characterHealth = character.getHealth();
            if (enemy instanceof Orc) {
                character.setHealth(characterHealth += enemy.getReward());
            } else {
                character.setMana(characterHealth += enemy.getReward());
            }
        }
    }

    public void clearRoom() {
        if (enemy.isAlive() == false) {
            giveReward();
        }
    }


    public void prepForFight(Weapon weapon, Potion potion, Spells spell, MythicalCreature mythicalCreature) {
        for (Character character: this.getCharacters()) {
            if (character instanceof Wizard) {
                ((Wizard) character).setSelectedSpell(spell);
                ((Wizard) character).setSelectedCreature(mythicalCreature);
            } else if (character instanceof Knight) {
                ((Knight) character).setSelected(weapon);
            } else {
                ((Cleric) character).setSelectedPotion(potion);
            }
        }
    }
    public void fight() {

//        first phase preparation (set weapon/set spell/potion/creature
//        Turn based fight (check after every attack if enemy dies)
//        clear room and pay reward
    }
}
