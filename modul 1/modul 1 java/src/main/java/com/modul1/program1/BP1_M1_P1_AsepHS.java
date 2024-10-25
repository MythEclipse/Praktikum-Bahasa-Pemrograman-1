/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.modul1.program1;

/**
 *
 * @author asephs
 */

import java.awt.*;

public class BP1_M1_P1_AsepHS extends Frame {
    public static void main(String[] args) {
        new BP1_M1_P1_AsepHS();
    }
    public BP1_M1_P1_AsepHS() {
        super("Mavenproject2");
        setSize(300,100);
        Panel panelTombol=new Panel();
        panelTombol.add(new Button("mulai"));
        panelTombol.add(new Button("selesai"));
        add("South",panelTombol);
        setVisible(true);
    }
}
