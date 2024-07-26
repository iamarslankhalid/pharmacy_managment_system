package com.raven.form;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.raven.card.ModelCard;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Reports extends javax.swing.JPanel {

    public Reports() {
        initComponents();
        init();
    }

    private void init() {
        table.fixTable(jScrollPane1);
        String outofstock = "0";
        String totalUsers = "0";
        String reportProfit = "0";
        List<String[]> filteredMedicines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("medicine.txt"))) {
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 8) {
                    int stock = Integer.parseInt(parts[3].trim());

                    if (stock < 10) {
                        Object[] rowData = new Object[8];

                        for (int i = 0; i < parts.length; i++) {
                            rowData[i] = parts[i].trim();
                        }

                        table.addRow(rowData);
                        filteredMedicines.add(parts);
                        count++;
                    }
                }
            }
            outofstock = Integer.toString(count);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("user.txt"))) {
            int userCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    userCount++;
                }
            }
            totalUsers = Integer.toString(userCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String totalValue = readTotalValueFromFile("total.txt");
        if (totalValue != null) {
            reportProfit = totalValue;
        }

        card1.setData(new ModelCard(null, null, null, outofstock, "Out of Stock"));
        card2.setData(new ModelCard(null, null, null, totalUsers, "Total Users"));
        card3.setData(new ModelCard(null, null, null, reportProfit, "Balance"));
    }

    private String readTotalValueFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                return line.trim();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new com.raven.card.Card();
        card2 = new com.raven.card.Card();
        card3 = new com.raven.card.Card();
        roundPanel1 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        print = new com.raven.swing.Button();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(870, 670));

        card1.setDescription("Out of Stock");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.LOCAL_PHARMACY);
        card1.setValues("0");

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDescription("Total Users");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.PERSON);
        card2.setValues("0");

        card3.setColor1(new java.awt.Color(95, 243, 140));
        card3.setColor2(new java.awt.Color(3, 157, 27));
        card3.setDescription("Balance");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.ACCOUNT_BALANCE);
        card3.setValues("PKR 0.00");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setRound(20);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Manufacturer", "Stock", "Category", "Price", "MFG", "Expiry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        print.setBackground(new java.awt.Color(157, 153, 255));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.setEffectColor(new java.awt.Color(199, 196, 255));
        print.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        Document document = new Document(PageSize.A4);

        try {
            String filename = "report.pdf";
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.open();

            addInvoiceDetails(document);
            document.close();
            displayMessage("Invoice printed successfully. Filename: " + filename);

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            displayError("Error printing the invoice.");
        }
    }//GEN-LAST:event_printActionPerformed

    private void addInvoiceDetails(Document document) throws DocumentException {
        Font detailsFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
        Paragraph detailsParagraph = new Paragraph();
        detailsParagraph.setFont(detailsFont);

        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String Date = null;
        String Time = null;
        try {
            Date date = new SimpleDateFormat("yyyyMMddHHmmss").parse(timestamp);
            Date = new SimpleDateFormat("dd-MM-yyyy").format(date);
            Time = new SimpleDateFormat("hh:mm:ss").format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        detailsParagraph.add("Date: " + Date + "\n");
        detailsParagraph.add("Time: " + Time + "\n\n");

        document.add(detailsParagraph);
        addInvoiceTable(document);

        detailsParagraph = new Paragraph();
        detailsParagraph.setFont(detailsFont);
        document.add(detailsParagraph);
    }

    private void addInvoiceTable(Document document) throws DocumentException {
        Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
        PdfPTable pdfTable = new PdfPTable(8);

        pdfTable.setWidthPercentage(100);
        pdfTable.addCell(createHeaderCell("No.", headerFont));
        pdfTable.addCell(createHeaderCell("Name", headerFont));
        pdfTable.addCell(createHeaderCell("Manufacturer", headerFont));
        pdfTable.addCell(createHeaderCell("Stock", headerFont));
        pdfTable.addCell(createHeaderCell("Category", headerFont));
        pdfTable.addCell(createHeaderCell("Price", headerFont));
        pdfTable.addCell(createHeaderCell("MFG", headerFont));
        pdfTable.addCell(createHeaderCell("Expiry", headerFont));

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 0)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 1)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 2)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 3)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 4)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 5)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 6)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 7)));
        }

        document.add(pdfTable);
    }

    private PdfPCell createHeaderCell(String text, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(text, font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        return cell;
    }

    private void displayError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.card.Card card1;
    private com.raven.card.Card card2;
    private com.raven.card.Card card3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.Button print;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
