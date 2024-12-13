/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul8;

/**
 *
 * @author asephs
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public Connection con;

    public Koneksi() {
        String id = "asephs";
        String pass = "hunterz";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://217.15.165.147:3306/db_mhs";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {

        String id = "asephs";
        String pass = "hunterz";
        String url = "jdbc:mysql://217.15.165.147:3306/db_mhs";
        return DriverManager.getConnection(url, id, pass);
    }
    public static void main(String[] args) {
        new Koneksi();
    }
}