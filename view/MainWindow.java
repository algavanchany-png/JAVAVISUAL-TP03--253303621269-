package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow extends JFrame {

    private final CharacterManager manager;
    private final JPanel characterPanel;
    private final JLabel averageLevelLabel;

    public MainWindow(CharacterManager manager) {
        this.manager = manager;

        setTitle("Character Manager - Sprint #3");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel titleLabel = new JLabel(
                "DAFTAR KARAKTER", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        characterPanel = new JPanel();
        characterPanel.setLayout(new BoxLayout(
                characterPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(characterPanel);

        averageLevelLabel = new JLabel();
        averageLevelLabel.setFont(new Font("Arial", Font.BOLD, 14));

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(averageLevelLabel, BorderLayout.SOUTH);

        add(mainPanel);

        refreshCharacterList();
    }

    public void refreshCharacterList() {
        characterPanel.removeAll();

        ArrayList<Character> characters = manager.getAllCharacters();

        for (Character c : characters) {
            JLabel characterLabel = new JLabel(
                    c.getName() + " | " + c.getType()
                    + " | Level " + c.getLevel());

            characterLabel.setBorder(
                    BorderFactory.createEmptyBorder(8, 5, 8, 5));

            characterPanel.add(characterLabel);
        }

        averageLevelLabel.setText(String.format(
                "Rata-rata Level: %.2f", manager.getAverageLevel()));

        characterPanel.revalidate();
        characterPanel.repaint();
    }
}