/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.program1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author asephs
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
public void paint(Graphics g) {
        Font font = new Font("Comic Sans MS", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.RED);

        int xCenter = this.getSize().width / 2;
        int yCenter = this.getSize().height / 2;
        String message = "Ayooo Belajar Java Applet !!!!";

        FontMetrics fm = g.getFontMetrics(font);
        int textPosX = xCenter - (fm.stringWidth(message) / 2);

        g.drawString(message, textPosX, yCenter);
    }

    @Override
    public void start() {
        // Method ini dipanggil saat Applet dimulai - tambahkan fungsionalitas jika diperlukan
    }

    @Override
    public void stop() {
        // Method ini dipanggil saat Applet dihentikan - tambahkan fungsionalitas jika diperlukan
    }

    @Override
    public void destroy() {
        // Method ini dipanggil saat Applet di-destroy - tambahkan fungsionalitas jika diperlukan
    }
    // TODO overwrite start(), stop() and destroy() methods
}
