package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attack;
    private int mana;
    
    private static int totalCharactersCreated = 0;

    // Constructor 1
    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.hitPoints = 100;
        this.attack = 20;
        this.mana = 50;
        totalCharactersCreated++;
    }

    // Constructor 2
    public Character(String name, CharacterType type, int level, int hitPoints, int attack, int mana) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attack = attack;
        setMana(mana);
        totalCharactersCreated++;
    }

    // Copy Constructor (Penting untuk Defensive Copy)
    public Character(Character other) {
        this.name = other.name;
        this.type = other.type;
        this.level = other.level;
        this.hitPoints = other.hitPoints;
        this.attack = other.attack;
        this.mana = other.mana;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public CharacterType getType() { return type; }
    public void setType(CharacterType type) { this.type = type; }

    public int getLevel() { return level; }
    public void setLevel(int level) {
        this.level = level;
        this.hitPoints = 100 + (level - 1) * 20;
        this.attack = 20 + (level - 1) * 5;
    }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }

    public int getMana() { return mana; }
    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh bernilai negatif!");
        }
        this.mana = mana;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public static int getTotalCharactersCreated() {
        return totalCharactersCreated;
    }

    // Override equals() berdasarkan nama
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Character [Name=" + name + ", Type=" + type + ", Level=" + level + 
               ", HP=" + hitPoints + ", Attack=" + attack + ", Mana=" + mana + 
               ", IsAlive=" + isAlive() + "]";
    }
}