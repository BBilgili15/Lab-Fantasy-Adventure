package com.codeclan.example.room;

import com.codeclan.example.enemy.Enemy;

import java.util.ArrayList;

public class RewardRoom extends Room {
    private int roomReward;


    public RewardRoom(ArrayList<Character> characters, int roomReward) {
        super(characters);
        this.roomReward = roomReward;
    }

    public int getRoomReward() {
        return roomReward;
    }

//    public String openChest() {
//        int rewardPerCharacter = getRoomReward() / getCharacters().size();
//        for (Character character: this.getCharacters()) {
//            character.bag.add(rewardPerCharacter);
//        }
//        return "All characters received " + rewardPerCharacter + " gems.";
//    }

}
