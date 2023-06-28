package com.codeclan.example.room;

import com.codeclan.example.character.Character;
import com.codeclan.example.enemy.Enemy;

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

    public void fight() {

    }
}
