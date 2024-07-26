package com.raven.form;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.raven.card.ModelCard;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Add_Medicine extends javax.swing.JPanel {

    public Add_Medicine() {
        initComponents();
        init();
    }

    private void init() {
        String totalMedicines = "0";
        String totalUsers = "0";
        String reportProfit = "0";

        try (BufferedReader reader = new BufferedReader(new FileReader("medicine.txt"))) {
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 8) {
                    count++;
                }
            }
            totalMedicines = Integer.toString(count);
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

        card1.setData(new ModelCard(null, null, null, totalMedicines, "Total Medicines"));
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

        roundPanel1 = new com.raven.swing.RoundPanel();
        id = new com.raven.textfield.TextField();
        stock = new com.raven.textfield.TextField();
        mfg = new com.raven.textfield.TextField();
        name = new com.raven.textfield.TextField();
        category = new com.raven.textfield.TextField();
        expiry = new com.raven.textfield.TextField();
        company = new com.raven.textfield.TextField();
        price = new com.raven.textfield.TextField();
        add = new com.raven.swing.Button();
        card1 = new com.raven.card.Card();
        card2 = new com.raven.card.Card();
        card3 = new com.raven.card.Card();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setPreferredSize(new java.awt.Dimension(480, 381));
        roundPanel1.setRound(20);

        id.setLabelText("ID");
        id.setLineColor(new java.awt.Color(157, 153, 255));
        id.setSelectionColor(new java.awt.Color(157, 153, 255));

        stock.setLabelText("Stock");
        stock.setLineColor(new java.awt.Color(157, 153, 255));
        stock.setSelectionColor(new java.awt.Color(157, 153, 255));

        mfg.setLabelText("MFG");
        mfg.setLineColor(new java.awt.Color(157, 153, 255));
        mfg.setSelectionColor(new java.awt.Color(157, 153, 255));

        name.setLabelText("Name");
        name.setLineColor(new java.awt.Color(157, 153, 255));
        name.setSelectionColor(new java.awt.Color(157, 153, 255));

        category.setLabelText("Category");
        category.setLineColor(new java.awt.Color(157, 153, 255));
        category.setSelectionColor(new java.awt.Color(157, 153, 255));

        expiry.setLabelText("Expiry");
        expiry.setLineColor(new java.awt.Color(157, 153, 255));
        expiry.setSelectionColor(new java.awt.Color(157, 153, 255));
        expiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiryActionPerformed(evt);
            }
        });

        company.setLabelText("Manufacturer");
        company.setLineColor(new java.awt.Color(157, 153, 255));
        company.setSelectionColor(new java.awt.Color(157, 153, 255));

        price.setLabelText("Price");
        price.setLineColor(new java.awt.Color(157, 153, 255));
        price.setSelectionColor(new java.awt.Color(157, 153, 255));

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

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(company, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mfg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        card1.setDescription("Total Medicine");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.LOCAL_PHARMACY);
        card1.setValues("0");

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        card2.setDescription("Total Users");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.PERSON);
        card2.setValues("0");

        card3.setColor1(new java.awt.Color(95, 243, 140));
        card3.setColor2(new java.awt.Color(3, 157, 27));
        card3.setDescription("Balance");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.ACCOUNT_BALANCE);
        card3.setValues("PKR 0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String medicineId = id.getText();
        String medicineName = name.getText();
        String manufacturer = company.getText();
        String stockValue = stock.getText();
        String categoryValue = category.getText();
        String priceValue = price.getText();
        String mfgDate = mfg.getText();
        String expiryDate = expiry.getText();
        String filePath = "medicine.txt";

        if (medicineId.isBlank() || medicineName.isBlank() || manufacturer.isBlank() || stockValue.isBlank()
                || categoryValue.isBlank() || priceValue.isBlank() || mfgDate.isBlank() || expiryDate.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill all the required fields!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean medicineExists = false;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] details = line.split("\\|");
                    if (details.length >= 2 && details[1].equals(medicineName)) {
                        medicineExists = true;
                        break;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error occurred while reading the file!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (medicineExists) {
                JOptionPane.showMessageDialog(this, "Medicine with the same name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String medicineDetails = String.format("%s|%s|%s|%s|%s|%s|%s|%s",
                        medicineId, medicineName, manufacturer, stockValue, categoryValue, priceValue, mfgDate, expiryDate);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                    writer.write(medicineDetails);
                    writer.newLine();
                    writer.close();

                    JOptionPane.showMessageDialog(this, "Medicine details added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                    id.setText("");
                    name.setText("");
                    company.setText("");
                    stock.setText("");
                    category.setText("");
                    price.setText("");
                    mfg.setText("");
                    expiry.setText("");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error occurred while writing to the file!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void expiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button add;
    private com.raven.card.Card card1;
    private com.raven.card.Card card2;
    private com.raven.card.Card card3;
    private com.raven.textfield.TextField category;
    private com.raven.textfield.TextField company;
    private com.raven.textfield.TextField expiry;
    private com.raven.textfield.TextField id;
    private com.raven.textfield.TextField mfg;
    private com.raven.textfield.TextField name;
    private com.raven.textfield.TextField price;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.textfield.TextField stock;
    // End of variables declaration//GEN-END:variables
}
