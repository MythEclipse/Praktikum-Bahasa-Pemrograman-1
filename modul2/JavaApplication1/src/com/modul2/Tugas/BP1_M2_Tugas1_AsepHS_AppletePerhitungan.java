/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.Tugas;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author asephs
 */
public class BP1_M2_Tugas1_AsepHS_AppletePerhitungan extends Applet implements ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;

    @Override
    public void init() {
        setLayout(new GridLayout(5, 2));

        add(new Label("Number 1:"));
        num1 = new TextField();
        add(num1);

        add(new Label("Number 2:"));
        num2 = new TextField();
        add(num2);

        add = new Button("Tambah");
        add.addActionListener(this);
        add(add);

        subtract = new Button("Kurang");
        subtract.addActionListener(this);
        add(subtract);

        multiply = new Button("Kali");
        multiply.addActionListener(this);
        add(multiply);

        divide = new Button("Bagi");
        divide.addActionListener(this);
        add(divide);

        add(new Label("Hasil:"));
        result = new TextField();
        result.setEditable(false);
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = n1 + n2;
            } else if (e.getSource() == subtract) {
                res = n1 - n2;
            } else if (e.getSource() == multiply) {
                res = n1 * n2;
            } else if (e.getSource() == divide) {
                res = n1 / n2;
            }
            
            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Error");
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
