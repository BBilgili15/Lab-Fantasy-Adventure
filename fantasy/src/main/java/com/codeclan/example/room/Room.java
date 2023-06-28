package com.codeclan.example.room;

import com.codeclan.example.character.Character;

import java.util.ArrayList;

public class Room {
    private ArrayList<Character> characters;

    public Room(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
}
