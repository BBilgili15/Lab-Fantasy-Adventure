package com.codeclan.example.enemy;

public class Orc extends Enemy{
    private final EnemyReward enemyReward;
    public Orc(int attack, int health, boolean alive, EnemyReward enemyReward) {
        super(attack, health, alive);
        this.enemyReward = EnemyReward.HP;
    }

    public EnemyReward getReward() {
        return enemyReward;
    }

    public void giveReward(Character character) {
        // character.mp += enemy.reward.value
    }



}
