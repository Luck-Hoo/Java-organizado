package com.example;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GridBagLayout1();
    }

    public static void GridBagLayout1() {
        JFrame meuFrame = new JFrame();
        meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meuFrame.setSize(400, 400);
         
        meuFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JLabel minLabel = new JLabel("Minha Label");
        minLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JTextArea meuTextoArea = new JTextArea(1, 1);
        meuTextoArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        meuFrame.add(minLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        meuFrame.add(meuTextoArea, gbc);

        
       

        meuFrame.setVisible(true);
    }
}