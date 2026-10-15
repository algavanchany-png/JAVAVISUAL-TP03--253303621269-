package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO CHARACTER MANAGER SPRINT #1 ===");

        // Membuat objek karakter
        Character char1 = new Character("Arthur", CharacterType.WARRIOR);
        Character char2 = new Character("Merlin", CharacterType.MAGE, 5, 120, 45, 150);
        Character char3 = new Character("Sylvanas", CharacterType.ARCHER);

        // Mengatur mana dan level
        char1.setMana(80);
        char3.setMana(60);

        System.out.println("\n--- Status Awal Karakter ---");
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);

        // Demo Level Up
        System.out.println("\n--- Demo Level Up (Arthur naik ke Level 3) ---");
        char1.setLevel(3);
        System.out.println(char1);

        // Demo Karakter Baru & isAlive() (Bagian B)
        System.out.println("\n--- Test isAlive() dan Ekstensi Mandiri ---");
        Character char4 = new Character("Shadow", CharacterType.ROGUE);
        char4.setMana(40);
        char4.setHitPoints(0); // Simulasi mati
        System.out.println(char4);
        System.out.println("Apakah " + char4.getName() + " masih hidup? " + char4.isAlive());

        // Pengujian exception validasi mana negatif
        try {
            char4.setMana(-20);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi Berhasil: " + e.getMessage());
        }
    }
}