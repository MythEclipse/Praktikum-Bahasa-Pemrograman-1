package com.mycompany.modul8;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.type.*;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class jasper {

    private Koneksi koneksi;

    public jasper() {
        koneksi = new Koneksi();
    }

    public void generateReport(List<Map<String, ?>> data) {
        try {
            // Create JasperDesign
            JasperDesign jasperDesign = new JasperDesign();
            jasperDesign.setName("DynamicReport");
            jasperDesign.setPageWidth(595);
            jasperDesign.setPageHeight(842);
            jasperDesign.setColumnWidth(555);
            jasperDesign.setLeftMargin(20);
            jasperDesign.setRightMargin(20);
            jasperDesign.setTopMargin(20);
            jasperDesign.setBottomMargin(20);
            jasperDesign.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);

            // Add Fields
            String[] fields = { "nim", "nama", "jk", "prodi", "kelas", "nilai" };
            for (String field : fields) {
                JRDesignField jrField = new JRDesignField();
                jrField.setName(field);
                jrField.setValueClass(String.class);
                jasperDesign.addField(jrField);
            }

            // Title Band
            JRDesignBand titleBand = new JRDesignBand();
            titleBand.setHeight(50);
            JRDesignStaticText titleText = new JRDesignStaticText();
            titleText.setText("Laporan Nilai Mahasiswa");
            titleText.setX(0);
            titleText.setY(10);
            titleText.setWidth(555);
            titleText.setHeight(30);
            titleText.setVerticalTextAlign(VerticalTextAlignEnum.MIDDLE);
            titleText.setHorizontalTextAlign(HorizontalTextAlignEnum.CENTER);
            titleBand.addElement(titleText);
            jasperDesign.setTitle(titleBand);

            // Header Band
            JRDesignBand headerBand = new JRDesignBand();
            headerBand.setHeight(30);
            int x = 0;

            String[] headers = { "NIM", "Nama", "Jenis Kelamin", "Program Studi", "Kelas", "Nilai" };
            for (int i = 0; i < headers.length; i++) {
                JRDesignStaticText headerText = new JRDesignStaticText();
                headerText.setText(headers[i]);
                headerText.setX(x);
                headerText.setY(0);
                headerText.setWidth(90);
                headerText.setHeight(30);
                headerText.setHorizontalTextAlign(HorizontalTextAlignEnum.CENTER);
                headerText.setVerticalTextAlign(VerticalTextAlignEnum.MIDDLE);
                headerText.setBackcolor(Color.BLUE);
                headerText.setForecolor(Color.WHITE);
                headerText.setMode(ModeEnum.OPAQUE);

                headerText.getLineBox().getPen().setLineWidth(0.5f);

                headerBand.addElement(headerText);
                x += 90; // Adjust width for each column
            }
            jasperDesign.setColumnHeader(headerBand);

            // Detail Band
            JRDesignBand detailBand = new JRDesignBand();
            detailBand.setHeight(20);
            x = 0;

            for (String field : fields) {
                JRDesignTextField textField = new JRDesignTextField();
                textField.setX(x);
                textField.setY(0);
                textField.setWidth(90);
                textField.setHeight(20);
                textField.setHorizontalTextAlign(HorizontalTextAlignEnum.CENTER);
                textField.setVerticalTextAlign(VerticalTextAlignEnum.MIDDLE);
                textField.setStretchType(StretchTypeEnum.NO_STRETCH); // Use StretchTypeEnum instead

                textField.setExpression(new JRDesignExpression("$F{" + field + "}"));
                textField.getLineBox().getPen().setLineWidth(0.5f);

                detailBand.addElement(textField);
                x += 90; // Adjust width for each column
            }
            ((JRDesignSection) jasperDesign.getDetailSection()).addBand(detailBand);

            // Compile the report
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // Data source
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(data);

            // Parameters
            Map<String, Object> parameters = new HashMap<>();

            // Fill the report
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

            // Display report in JasperViewer
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        jasper reportGenerator = new jasper();
        List<Map<String, ?>> data = reportGenerator.fetchData();
        reportGenerator.generateReport(data);
    }

    private List<Map<String, ?>> fetchData() {
        List<Map<String, ?>> data = new ArrayList<>();
        String sql = "SELECT nim, nama, jk, prodi, kelas, nilai FROM nilai";

        try (Connection con = koneksi.con;
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("nim", rs.getString("nim"));
                row.put("nama", rs.getString("nama"));
                row.put("jk", rs.getString("jk"));
                row.put("prodi", rs.getString("prodi"));
                row.put("kelas", rs.getString("kelas"));
                row.put("nilai", rs.getString("nilai"));
                data.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
