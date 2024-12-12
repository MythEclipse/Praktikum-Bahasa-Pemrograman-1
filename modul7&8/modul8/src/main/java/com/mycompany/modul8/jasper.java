package com.mycompany.modul8;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.engine.type.VerticalTextAlignEnum;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.Statement;

public class jasper {

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

            // Detail Band
            JRDesignBand detailBand = new JRDesignBand();
            detailBand.setHeight(20);
            int y = 0;
            for (String field : fields) {
                JRDesignTextField textField = new JRDesignTextField();
                textField.setX(y);
                textField.setY(0);
                textField.setWidth(90);
                textField.setHeight(20);
                textField.setVerticalTextAlign(VerticalTextAlignEnum.MIDDLE);
                textField.setHorizontalTextAlign(HorizontalTextAlignEnum.CENTER);

                textField.setExpression(new JRDesignExpression("$F{" + field + "}"));
                detailBand.addElement(textField);
                y += 100;
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

            // Export to PDF
            String pdfFilePath = "DynamicReport.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, pdfFilePath);

            // Open the PDF
            File pdfFile = new File(pdfFilePath);
            if (pdfFile.exists() && Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        jasper reportGenerator = new jasper();
        List<Map<String, ?>> data = fetchDataFromDatabase();
        reportGenerator.generateReport(data);
    }

    private static List<Map<String, ?>> fetchDataFromDatabase() {
        List<Map<String, ?>> data = new ArrayList<>();
        Koneksi koneksi = new Koneksi();
        String sql = "SELECT nim, nama, jk, prodi, kelas, nilai FROM nilai";
        try (Statement st = koneksi.con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
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
