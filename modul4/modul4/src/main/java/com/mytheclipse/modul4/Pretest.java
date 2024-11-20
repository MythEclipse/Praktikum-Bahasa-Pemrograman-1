/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytheclipse.modul4;

import javax.swing.*;

/**
 *
 * @author asephs
 */
public class Pretest {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Pretest1");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat panel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Menampilkan frame
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Membuat label
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Membuat text field
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Membuat button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        // Membuat action pada button
        loginButton.addActionListener(e -> {
            String username = userText.getText();
            JOptionPane.showMessageDialog(panel, "Hello, " + username + "!");
        });
    }
}
