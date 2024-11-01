/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.posttest;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author asephs
 */
public class BP1_M2_PostTest1_AsepHS_AppletMouse extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private int mouseX = 0;
    private int mouseY = 0;
    private String message = "";

    @Override
    public void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                message = "Mouse clicked at (" + mouseX + ", " + mouseY + ")";
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
