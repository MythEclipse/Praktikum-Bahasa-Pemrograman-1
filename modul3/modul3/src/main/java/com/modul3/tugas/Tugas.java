/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.modul3.tugas;

import com.modul3.posttest.*;
import javax.swing.JOptionPane;

/**
 *
 * @author asephs
 */
public class Tugas extends javax.swing.JFrame {

    /**
     * Creates new form posttest2
     */
    public Tugas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuDataMahasiswa = new javax.swing.JMenu();
        jMenuItemViewData = new javax.swing.JMenuItem();
        jMenuItemAddData = new javax.swing.JMenuItem();
        jMenuMK = new javax.swing.JMenu();
        jMenuItemViewMK = new javax.swing.JMenuItem();
        jMenuItemAddMK = new javax.swing.JMenuItem();
        jMenuNilai = new javax.swing.JMenu();
        jMenuItemViewNilai = new javax.swing.JMenuItem();
        jMenuItemAddNilai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuFile.setText("File");

        jMenuItemOpen.setText("Open");
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemOpen);

        jMenuItemSave.setText("Save");
        jMenuFile.add(jMenuItemSave);

        jMenuBar1.add(jMenuFile);

        jMenuDataMahasiswa.setText("Data Mahasiswa");

        jMenuItemViewData.setText("View Data");
        jMenuDataMahasiswa.add(jMenuItemViewData);

        jMenuItemAddData.setText("Add Data");
        jMenuDataMahasiswa.add(jMenuItemAddData);

        jMenuBar1.add(jMenuDataMahasiswa);

        jMenuMK.setText("Data MK");

        jMenuItemViewMK.setText("View MK");
        jMenuMK.add(jMenuItemViewMK);

        jMenuItemAddMK.setText("Add MK");
        jMenuMK.add(jMenuItemAddMK);

        jMenuBar1.add(jMenuMK);

        jMenuNilai.setText("Data Nilai");

        jMenuItemViewNilai.setText("View Nilai");
        jMenuNilai.add(jMenuItemViewNilai);

        jMenuItemAddNilai.setText("Add Nilai");
        jMenuNilai.add(jMenuItemAddNilai);

        jMenuBar1.add(jMenuNilai);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(null, "Open menu item clicked");
    }//GEN-LAST:event_jMenuItemOpenActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Save menu item clicked");
    }

    private void jMenuItemViewDataActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "View Data Mahasiswa menu item clicked");
    }

    private void jMenuItemAddDataActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Add Data Mahasiswa menu item clicked");
    }

    private void jMenuItemViewMKActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "View Data MK menu item clicked");
    }

    private void jMenuItemAddMKActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Add Data MK menu item clicked");
    }

    private void jMenuItemViewNilaiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "View Data Nilai menu item clicked");
    }

    private void jMenuItemAddNilaiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Add Data Nilai menu item clicked");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDataMahasiswa;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemAddData;
    private javax.swing.JMenuItem jMenuItemAddMK;
    private javax.swing.JMenuItem jMenuItemAddNilai;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuItemViewData;
    private javax.swing.JMenuItem jMenuItemViewMK;
    private javax.swing.JMenuItem jMenuItemViewNilai;
    private javax.swing.JMenu jMenuMK;
    private javax.swing.JMenu jMenuNilai;
    // End of variables declaration//GEN-END:variables
}
