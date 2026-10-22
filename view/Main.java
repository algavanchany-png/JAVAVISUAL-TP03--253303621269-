package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Data awal: 5 karakter
        manager.addCharacter(new Character(
                "Arthur", CharacterType.WARRIOR, 5, 150, 40, 30));

        manager.addCharacter(new Character(
                "Merlin", CharacterType.MAGE, 8, 100, 60, 120));

        manager.addCharacter(new Character(
                "Gandalf", CharacterType.MAGE, 3, 140, 35, 120));

        manager.addCharacter(new Character(
                "Lancelot", CharacterType.WARRIOR, 6, 180, 50, 40));

        manager.addCharacter(new Character(
                "Shadow", CharacterType.ROGUE, 4, 90, 55, 50));

        // Menjalankan GUI pada Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true);
        });
    }
}