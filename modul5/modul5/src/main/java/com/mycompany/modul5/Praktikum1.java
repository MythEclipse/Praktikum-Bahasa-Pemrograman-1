/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


/**
 *
 * @author asephs
 */
public class Praktikum1 extends JPanel {
    private static final int L = 400, T = 400;
    List<Mobil> mobil;

    public Praktikum1() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        mobil = new ArrayList();
        mobil.add(new Mobil(100, 200));

        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Mobil mobil : mobil) {
                    mobil.Bergerak();
                    repaint();
                }
            }
        });
    timer.start();
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mobil mobil : mobil) {
            mobil.GambarMobil(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    public class Mobil {
        private static final int INCREMENT = 5;
        int x, y;

        public Mobil(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void GambarMobil(Graphics g) {
            g.setColor(Color.BLUE); // atas mobil
            g.fillRect(x + 15, y - 20, 60, 35); // atas mobil
            g.setColor(Color.yellow); // badan mobil
            g.fillRect(x, y, 110, 30); // badan mobil
            g.setColor(Color.red); // roda
            g.fillOval(x + 15, y + 20, 20, 20); // roda
            g.fillOval(x + 60, y + 20, 20, 20); //  roda
        }
        public void Bergerak() {
            if (x >= L) { // arah bergerak
                x = 1;
            } else {
                x += INCREMENT;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new Praktikum1());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Mobil Bergerak");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}
