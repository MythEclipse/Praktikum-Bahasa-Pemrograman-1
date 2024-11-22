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
public class Pretest extends JPanel {
    private int x = 0;
    private boolean movingRight = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Horizontal Moving Box");
        Pretest movingBox = new Pretest();

        frame.add(movingBox);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(16, e -> {
            movingBox.moveBox();
            movingBox.repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int boxSize = 50;
        int y = getHeight() / 2 - boxSize / 2;

        g.setColor(Color.BLUE);
        g.fillRect(x, y, boxSize, boxSize);
    }

    private void moveBox() {
        if (movingRight) {
            x += 2;
            if (x + 50 >= getWidth()) {
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
