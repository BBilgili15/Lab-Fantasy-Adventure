package com.codeclan.example.room.;

public enum RoomReward {
    GOLD(100),
    GEMS(50);

    private final int value;

    RoomReward(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}