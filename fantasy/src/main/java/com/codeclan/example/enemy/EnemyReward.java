package com.codeclan.example.enemy;

public enum EnemyReward {
    MP(50),
    HP(50);

    private final int value;

    EnemyReward(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
