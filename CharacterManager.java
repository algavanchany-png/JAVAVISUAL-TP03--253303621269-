package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {
    private ArrayList<Character> characters;

    public CharacterManager() {
        this.characters = new ArrayList<>();
    }

    public boolean addCharacter(Character c) {
        for (Character existing : characters) {
            if (existing.equals(c)) {
                System.out.println("-> [DITOLAK] Karakter dengan nama '" + c.getName() + "' sudah terdaftar!");
                return false;
            }
        }
        characters.add(c);
        return true;
    }

    public Character findByName(String name) {
        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return new Character(c);
            }
        }
        return null;
    }

    public boolean removeCharacter(String name) {
        Character target = null;
        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                target = c;
                break;
            }
        }
        if (target != null) {
            characters.remove(target);
            return true;
        }
        return false;
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    public ArrayList<Character> getAllCharacters() {
        ArrayList<Character> copyList = new ArrayList<>();
        for (Character c : characters) {
            copyList.add(new Character(c));
        }
        return copyList;
    }

    public double getAverageLevel() {
        if (characters.isEmpty()) {
            return 0.0;
        }
        int totalLevel = 0;
        for (Character c : characters) {
            totalLevel += c.getLevel();
        }
        return (double) totalLevel / characters.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();
        for (Character c : characters) {
            if (c.getType() == type) {
                result.add(new Character(c));
            }
        }
        return result;
    }

    /**
     * Fitur Analitik Mandiri: Mencari karakter dengan Attack tertinggi.
     */
    public Character findStrongestCharacter() {
        if (characters.isEmpty()) {
            return null;
        }
        Character strongest = characters.get(0);
        for (Character c : characters) {
            if (c.getAttack() > strongest.getAttack()) {
                strongest = c;
            }
        }
        return new Character(strongest);
    }
}