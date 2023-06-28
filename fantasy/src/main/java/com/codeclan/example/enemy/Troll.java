package com.codeclan.example.enemy;

public class Troll extends Enemy{
    private final EnemyReward enemyReward;
    public Troll(int attack, int health, boolean alive, EnemyReward enemyReward) {
        super(attack, health, alive);
        this.enemyReward = EnemyReward.MP;
    }

    public EnemyReward getReward() {
        return enemyReward;
    }

    public void giveReward(Character character) {
        // character.mp += enemy.reward.value
    }


}
