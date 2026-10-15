package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attack;
    private int mana; // Ekstensi Fitur Mandiri (Bagian B)

    // Constructor 1: Default / Dasar
    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.hitPoints = 100;
        this.attack = 20;
        this.mana = 50;
    }

    // Constructor 2: Full Parameter
    public Character(String name, CharacterType type, int level, int hitPoints, int attack, int mana) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attack = attack;
        setMana(mana); // Menggunakan setter agar tervalidasi
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        // Enkapsulasi: kalkulasi ulang HP & attack di dalam class
        this.hitPoints = 100 + (level - 1) * 20;
        this.attack = 20 + (level - 1) * 5;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // Bagian B: Getter & Setter Mana dengan Validasi
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh bernilai negatif!");
        }
        this.mana = mana;
    }

    // Bagian B: Method isAlive()
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // toString() diperbarui menampilkan mana & status hidup
    @Override
    public String toString() {
        return "Character [Name=" + name + ", Type=" + type + ", Level=" + level + 
               ", HP=" + hitPoints + ", Attack=" + attack + ", Mana=" + mana + 
               ", IsAlive=" + isAlive() + "]";
    }
}