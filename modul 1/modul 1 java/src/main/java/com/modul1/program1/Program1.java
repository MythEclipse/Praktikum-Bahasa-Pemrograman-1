/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.modul1.program1;

/**
 *
 * @author asephs
 */

import java.awt.*;

public class Program1 extends Frame {
    public static void main(String[] args) {
        new Program1();
    }
    public Program1() {
        super("Mavenproject2");
        setSize(300,100);
        Panel panelTombol=new Panel();
        panelTombol.add(new Button("mulai"));
        panelTombol.add(new Button("selesai"));
        add("South",panelTombol);
        setVisible(true);
    }
}
