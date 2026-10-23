package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        manager.addCharacter(new Character("Aragorn", CharacterType.WARRIOR, 6, 160, 45, 30));
        manager.addCharacter(new Character("Gandalf", CharacterType.MAGE, 7, 110, 65, 120));
        manager.addCharacter(new Character("Legolas", CharacterType.ARCHER, 4, 120, 50, 60));
        manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 2, 90, 40, 100));
        manager.addCharacter(new Character("Dara", CharacterType.HEALER, 5, 130, 30, 150));
        manager.addCharacter(new Character("Gorn", CharacterType.WARRIOR, 3, 140, 35, 25));

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true);
        });
    }
}