/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author asephs
 */

import java.awt.*;

public class Mavenproject2 extends Frame {
    public static void main(String[] args) {
        new Mavenproject2();
    }
    public Mavenproject2() {
        super("Mavenproject2");
        setSize(300,100);
        Panel panelTombol=new Panel();
        panelTombol.add(new Button("mulai"));
        panelTombol.add(new Button("selesai"));
        add("South",panelTombol);
        setVisible(true);
    }
}
