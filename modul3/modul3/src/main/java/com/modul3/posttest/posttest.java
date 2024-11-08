package com.modul3.posttest;

/**
 *
 * @author asephs
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class posttest extends javax.swing.JFrame {

    public posttest() {
        initComponents();
    }

    private void initComponents() {
        jMenuBar1 = new JMenuBar();
        jMenuFile = new JMenu("File");
        jMenuDataMahasiswa = new JMenu("Data Mahasiswa");
        jMenuMK = new JMenu("Data MK");
        jMenuNilai = new JMenu("Data Nilai");

        // Menu Items for "File"
        jMenuItemOpen = new JMenuItem("Open");
        jMenuItemSave = new JMenuItem("Save");

        jMenuItemOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Open clicked");
            }
        });

        jMenuItemSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Save clicked");
            }
        });

        jMenuFile.add(jMenuItemOpen);
        jMenuFile.add(jMenuItemSave);

        // Menu Items for "Data Mahasiswa"
        jMenuItemViewData = new JMenuItem("View Data");
        jMenuItemAddData = new JMenuItem("Add Data");

        jMenuItemViewData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "View Data Mahasiswa clicked");
            }
        });

        jMenuItemAddData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Add Data Mahasiswa clicked");
            }
        });

        jMenuDataMahasiswa.add(jMenuItemViewData);
        jMenuDataMahasiswa.add(jMenuItemAddData);

        // Menu Items for "Data MK"
        jMenuItemViewMK = new JMenuItem("View MK");
        jMenuItemAddMK = new JMenuItem("Add MK");

        jMenuItemViewMK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "View Data MK clicked");
            }
        });

        jMenuItemAddMK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Add Data MK clicked");
            }
        });

        jMenuMK.add(jMenuItemViewMK);
        jMenuMK.add(jMenuItemAddMK);

        // Menu Items for "Data Nilai"
        jMenuItemViewNilai = new JMenuItem("View Nilai");
        jMenuItemAddNilai = new JMenuItem("Add Nilai");

        jMenuItemViewNilai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "View Data Nilai clicked");
            }
        });

        jMenuItemAddNilai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Add Data Nilai clicked");
            }
        });

        jMenuNilai.add(jMenuItemViewNilai);
        jMenuNilai.add(jMenuItemAddNilai);

        // Add Menus to MenuBar
        jMenuBar1.add(jMenuFile);
        jMenuBar1.add(jMenuDataMahasiswa);
        jMenuBar1.add(jMenuMK);
        jMenuBar1.add(jMenuNilai);

        // Set MenuBar
        setJMenuBar(jMenuBar1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Form Menu Data Nilai Mahasiswa");
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new posttest().setVisible(true);
        });
    }

    private JMenuBar jMenuBar1;
    private JMenu jMenuFile;
    private JMenu jMenuDataMahasiswa;
    private JMenu jMenuMK;
    private JMenu jMenuNilai;
    private JMenuItem jMenuItemOpen;
    private JMenuItem jMenuItemSave;
    private JMenuItem jMenuItemViewData;
    private JMenuItem jMenuItemAddData;
    private JMenuItem jMenuItemViewMK;
    private JMenuItem jMenuItemAddMK;
    private JMenuItem jMenuItemViewNilai;
    private JMenuItem jMenuItemAddNilai;
}
