/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.posttest;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author asephs
 */
public class BP1_M2_PostTest2_Nama_Applet3D extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint(Graphics g) {
        // Persegi depan
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);

        // Persegi belakang untuk efek 3D
        g.setColor(Color.RED);
        g.fillRect(80, 80, 100, 100);

        // Garis-garis penghubung untuk membuat efek 3D
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 80, 80);
        g.drawLine(150, 50, 180, 80);
        g.drawLine(50, 150, 80, 180);
        g.drawLine(150, 150, 180, 180);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
