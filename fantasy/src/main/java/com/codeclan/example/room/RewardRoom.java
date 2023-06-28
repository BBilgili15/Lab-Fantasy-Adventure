package com.codeclan.example.room;

import com.codeclan.example.enemy.Enemy;

import java.util.ArrayList;

public class RewardRoom extends Room {
    private RoomReward roomReward;


    public RewardRoom(ArrayList<Character> characters, RoomReward roomReward) {
        super(characters);
        this.roomReward = roomReward;
    }

    public RoomReward getRoomReward() {
        return roomReward;
    }

    public String openChest() {
        int rewardPerCharacter = getRoomReward().getValue() / getCharacters().size();
        for (Character character: this.getCharacters()) {
            character.bag.add(rewardPerCharacter);
        }
        return "All characters received " + rewardPerCharacter + " gems.";
    }

}
