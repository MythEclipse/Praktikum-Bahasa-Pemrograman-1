/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author asephs
 */
public class Posttest1 extends JPanel {
    private int x = 0;
    private boolean movingRight = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Kapal");
        Posttest1 movingShip = new Posttest1();

        frame.add(movingShip);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(16, e -> {
            movingShip.moveShip();
            movingShip.repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int y = getHeight() - 100;

        g.setColor(Color.GRAY);
        g.fillRect(x, y, 100, 30);

        g.setColor(Color.BLUE);
        g.fillRect(x + 20, y - 20, 60, 20);

        g.setColor(Color.RED);
        g.fillRect(x + 40, y - 40, 20, 20);

        g.setColor(Color.CYAN);
        g.fillRect(0, getHeight() - 70, getWidth(), 70);
    }

    private void moveShip() {
        if (movingRight) {
            x += 2;
            if (x + 100 >= getWidth()) {
                movingRight = false;
            }
        } else {
            x -= 2;
            if (x <= 0) {
                movingRight = true;
            }
        }
    }
}
