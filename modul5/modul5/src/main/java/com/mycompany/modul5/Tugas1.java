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
public class Tugas1 extends JPanel {
    private int x = 0;
    private int y = 0;
    private int xSpeed = 2;
    private int ySpeed = 2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bola Memantul");
        Tugas1 movingBall = new Tugas1();

        frame.add(movingBall);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(16, e -> {
            movingBall.moveBall();
            movingBall.repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int ballSize = 30;
        g.setColor(Color.RED);
        g.fillOval(x, y, ballSize, ballSize);
    }

    private void moveBall() {
        x += xSpeed;
        y += ySpeed;

        if (x <= 0 || x + 30 >= getWidth()) {
            xSpeed = -xSpeed;
        }

        if (y <= 0 || y + 30 >= getHeight()) {
            ySpeed = -ySpeed;
        }
    }
}
