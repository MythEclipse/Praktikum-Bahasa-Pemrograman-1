/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.Tugas;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author aseph
 */
public class BP1_M2_Tugas2_AsepHS_AppleteAnimasi extends Applet implements Runnable {

    int radius, centerX, centerY, angle;
    int numBalls = 4; 
    int ballRadius = 20;
    Thread animator;

    public void init() {
        radius = 50;
        centerX = 200; 
        centerY = 100; 
        angle = 0;
        setSize(400, 200);
    }

    public void start() {
        animator = new Thread(this);
        animator.start();
    }

    public void stop() {
        animator = null;
    }

    public void run() {
        while (Thread.currentThread() == animator) {
            angle += 5;
            if (angle >= 360) angle = 0;

            repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);

        for (int i = 0; i < numBalls; i++) {
            double rad = Math.toRadians(angle + (i * 90)); 
            int x = (int) (centerX + radius * Math.cos(rad)) - ballRadius;
            int y = (int) (centerY + radius * Math.sin(rad)) - ballRadius;
            g.fillOval(x, y, ballRadius * 2, ballRadius * 2);
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
