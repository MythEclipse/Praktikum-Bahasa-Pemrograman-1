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
public class Pretest extends JPanel{
    private double angle = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Ball (Loading)");
        Pretest rotatingBall = new Pretest();

        frame.add(rotatingBall);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(16, e -> {
            rotatingBall.rotateBall();
            rotatingBall.repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int radius = 100;

        int ballX = (int) (centerX + radius * Math.cos(angle));
        int ballY = (int) (centerY + radius * Math.sin(angle));

        g.setColor(Color.LIGHT_GRAY);
        g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        g.setColor(Color.BLUE);
        g.fillOval(ballX - 15, ballY - 15, 30, 30);
    }

    private void rotateBall() {
        angle += 0.05;
        if (angle >= 2 * Math.PI) {
            angle -= 2 * Math.PI;
        }
    }
}
