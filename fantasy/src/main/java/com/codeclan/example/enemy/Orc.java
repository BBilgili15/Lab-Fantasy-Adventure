package com.codeclan.example.enemy;

import com.codeclan.example.ITargetable;
import com.codeclan.example.character.Character;

public class Orc extends Enemy {
    private final EnemyReward enemyReward;
    public Orc(int attack, int health, boolean alive, EnemyReward enemyReward) {
        super(attack, health, alive);
        this.enemyReward = EnemyReward.HP;
    }

    public int getReward() {
        return enemyReward.getValue();
    }
}
