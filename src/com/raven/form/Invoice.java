package com.raven.form;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice extends javax.swing.JPanel {

    private int invoiceCount = 1;
    private boolean fieldsEnabled = false;
    private double totalAmount = 0.0;
    private double cashReceived = 0.0;
    private double changeReturn = 0.0;

    public Invoice() {

        initComponents();
        init();
    }

    private void init() {
        price.setEditable(false);
        quantity.setEditable(false);
        total.setEditable(false);
        change.setEditable(false);
        table.fixTable(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        name = new com.raven.textfield.TextField();
        phone = new com.raven.textfield.TextField();
        address = new com.raven.textfield.TextField();
        searchField = new com.raven.textfield.TextField();
        price = new com.raven.textfield.TextField();
        quantity = new com.raven.textfield.TextField();
        print = new com.raven.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        add = new com.raven.swing.Button();
        search = new com.raven.swing.Button();
        total = new com.raven.textfield.TextField();
        cash = new com.raven.textfield.TextField();
        change = new com.raven.textfield.TextField();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setRound(20);

        name.setLabelText("Name");
        name.setLineColor(new java.awt.Color(157, 153, 255));
        name.setSelectionColor(new java.awt.Color(157, 153, 255));

        phone.setLabelText("Phone");
        phone.setLineColor(new java.awt.Color(157, 153, 255));
        phone.setSelectionColor(new java.awt.Color(157, 153, 255));

        address.setLabelText("Address");
        address.setLineColor(new java.awt.Color(157, 153, 255));
        address.setSelectionColor(new java.awt.Color(157, 153, 255));

        searchField.setLabelText("Search");
        searchField.setLineColor(new java.awt.Color(157, 153, 255));
        searchField.setSelectionColor(new java.awt.Color(157, 153, 255));

        price.setLabelText("Price");
        price.setLineColor(new java.awt.Color(157, 153, 255));
        price.setSelectionColor(new java.awt.Color(157, 153, 255));

        quantity.setLabelText("Quantity");
        quantity.setLineColor(new java.awt.Color(157, 153, 255));
        quantity.setSelectionColor(new java.awt.Color(157, 153, 255));

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        add.setBackground(new java.awt.Color(157, 153, 255));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setEffectColor(new java.awt.Color(199, 196, 255));
        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(157, 153, 255));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setEffectColor(new java.awt.Color(199, 196, 255));
        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        total.setLabelText("Total");
        total.setLineColor(new java.awt.Color(157, 153, 255));
        total.setSelectionColor(new java.awt.Color(157, 153, 255));

        cash.setLabelText("Cash");
        cash.setLineColor(new java.awt.Color(157, 153, 255));
        cash.setSelectionColor(new java.awt.Color(157, 153, 255));
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });

        change.setLabelText("Change");
        change.setLineColor(new java.awt.Color(157, 153, 255));
        change.setSelectionColor(new java.awt.Color(157, 153, 255));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72)
                                .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72)
                                .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        Document document = new Document(PageSize.A4);

        try {
            String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            String filename = "invoice_" + timestamp + "_" + invoiceCount + ".pdf";
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.open();

            addInvoiceDetails(document);
            document.close();
            displayMessage("Invoice printed successfully. Filename: " + filename);

            clearFields();
            clearTable();

            invoiceCount++;
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            displayError("Error printing the invoice.");
        }
    }//GEN-LAST:event_printActionPerformed

    private void clearFields() {
        name.setText("");
        phone.setText("");
        address.setText("");
        total.setText("");
        cash.setText("");
        change.setText("");
    }

    private void clearTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

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

        String invoiceNumber = "Invoice Number: " + invoiceCount;
        String value = total.getText();

        Paragraph headerParagraph = new Paragraph();
        headerParagraph.setAlignment(Element.ALIGN_CENTER);
        headerParagraph.setFont(detailsFont);
        headerParagraph.add("Pharmalink\n");
        headerParagraph.add("Wah Cantt\n");
        headerParagraph.add("Phone: 0336-9815769\n\n");
        document.add(headerParagraph);

        detailsParagraph.add(invoiceNumber + "\n");
        detailsParagraph.add("Date: " + Date + "\n");
        detailsParagraph.add("Time: " + Time + "\n\n");
        detailsParagraph.add("Name: " + name.getText() + "\n");
        detailsParagraph.add("Phone: " + phone.getText() + "\n");
        detailsParagraph.add("Address: " + address.getText() + "\n\n");

        document.add(detailsParagraph);
        addInvoiceTable(document);

        Paragraph additionalParagraph = new Paragraph();
        additionalParagraph.setFont(detailsFont);
        additionalParagraph.setAlignment(Element.ALIGN_RIGHT);
        additionalParagraph.add("Total: " + total.getText() + "\n");
        additionalParagraph.add("Cash: " + cash.getText() + "\n");
        additionalParagraph.add("Balance: " + change.getText() + "\n\n");
        document.add(additionalParagraph);

        Paragraph footerParagraph = new Paragraph();
        footerParagraph.setAlignment(Element.ALIGN_CENTER);
        footerParagraph.setFont(detailsFont);
        footerParagraph.add("Thank you for shopping!");
        document.add(footerParagraph);

        double previousTotal = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("total.txt"));
            String previousTotalStr = reader.readLine();
            if (previousTotalStr != null) {
                previousTotal = Double.parseDouble(previousTotalStr);
            }
            reader.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        double currentTotal = Double.parseDouble(total.getText());
        double updatedTotal = previousTotal + currentTotal;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("total.txt"));
            writer.write(String.valueOf(updatedTotal));
            writer.close();
            System.out.println("Updated total stored successfully: " + updatedTotal);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private void addInvoiceTable(Document document) throws DocumentException {
        Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
        PdfPTable pdfTable = new PdfPTable(5);

        pdfTable.setWidthPercentage(100);
        pdfTable.addCell(createHeaderCell("No.", headerFont));
        pdfTable.addCell(createHeaderCell("Medicine Name", headerFont));
        pdfTable.addCell(createHeaderCell("Price Per Unit", headerFont));
        pdfTable.addCell(createHeaderCell("Quantity", headerFont));
        pdfTable.addCell(createHeaderCell("Amount", headerFont));

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 0)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 1)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 2)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 3)));
            pdfTable.addCell(String.valueOf(model.getValueAt(i, 4)));
        }

        document.add(pdfTable);
    }

    private PdfPCell createHeaderCell(String text, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(text, font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        return cell;
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (!fieldsEnabled) {
            displayError("Please search for a medicine first.");
            return;
        }

        String medicineName = searchField.getText();
        int availableStock = getStockFromMedicineFile(medicineName);
        int requestedUnits = Integer.parseInt(quantity.getText());

        if (requestedUnits > availableStock) {
            JOptionPane.showMessageDialog(null, "Only " + availableStock + " medicines are available in stock.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        updateStockQuantity(medicineName, requestedUnits);

        double pricePerUnit = Double.parseDouble(price.getText());
        double amount = pricePerUnit * requestedUnits;
        totalAmount += amount;
        total.setText(String.valueOf(totalAmount));

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int num = rowCount + 1;
        Object[] rowData = new Object[]{num, medicineName, pricePerUnit, requestedUnits, amount};
        model.addRow(rowData);

        searchField.setText("");
        price.setText("");
        quantity.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void updateStockQuantity(String medicineName, int requestedUnits) {
        try {
            File inputFile = new File("medicine.txt");
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 8 && parts[1].trim().equalsIgnoreCase(medicineName.trim())) {
                    int currentStock = Integer.parseInt(parts[3].trim());
                    int updatedStock = currentStock - requestedUnits;
                    parts[3] = String.valueOf(updatedStock);
                    line = String.join("|", parts);
                }
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            if (inputFile.delete()) {
                tempFile.renameTo(inputFile);
            } else {
                throw new IOException("Failed to update stock quantity.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            displayError("Error updating stock quantity.");
        }
    }

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String medicineName = searchField.getText();

        if (medicineName.isEmpty()) {
            displayError("Please enter a medicine name.");
            return;
        }

        String[] medicineDetails = getMedicineDetails(medicineName);

        if (medicineDetails != null) {
            displayMedicineDetails(medicineDetails);
            enableFields();
        } else {
            displayError("Medicine not found.");
            disableFields();
        }
    }//GEN-LAST:event_searchActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        calculateChange();
    }//GEN-LAST:event_cashActionPerformed

    private int getStockFromMedicineFile(String medicineName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("medicine.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 8 && parts[1].trim().equalsIgnoreCase(medicineName.trim())) {
                    return Integer.parseInt(parts[3].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private boolean checkMedicineExists(String medicineName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("medicine.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\|");
                if (fields.length >= 2 && fields[1].trim().equalsIgnoreCase(medicineName.trim())) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void displayError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    private void enableFields() {
        fieldsEnabled = true;
        quantity.setEditable(true);
    }

    private void disableFields() {
        fieldsEnabled = false;
        quantity.setEditable(false);
        price.setEditable(false);
        total.setEditable(false);
        change.setEditable(false);
    }

    private String[] getMedicineDetails(String medicineName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("medicine.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\|");
                if (fields.length >= 2 && fields[1].trim().equalsIgnoreCase(medicineName.trim())) {
                    reader.close();
                    return fields;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void displayMedicineDetails(String[] medicineDetails) {
        //units.setText(medicineDetails[3]);
        price.setText(medicineDetails[5]);
    }

    private void calculateChange() {
        try {
            cashReceived = Double.parseDouble(cash.getText());
        } catch (NumberFormatException e) {
            displayError("Invalid cash amount");
            return;
        }

        changeReturn = cashReceived - totalAmount;
        change.setText(String.valueOf(changeReturn));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button add;
    private com.raven.textfield.TextField address;
    private com.raven.textfield.TextField cash;
    private com.raven.textfield.TextField change;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.textfield.TextField name;
    private com.raven.textfield.TextField phone;
    private com.raven.textfield.TextField price;
    private com.raven.swing.Button print;
    private com.raven.textfield.TextField quantity;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.Button search;
    private com.raven.textfield.TextField searchField;
    private com.raven.swing.Table table;
    private com.raven.textfield.TextField total;
    // End of variables declaration//GEN-END:variables
}
