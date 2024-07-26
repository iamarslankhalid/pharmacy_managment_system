package com.raven.form;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.raven.card.ModelCard;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Modify_Medicine extends javax.swing.JPanel {

    private boolean fieldsEnabled = false;

    public Modify_Medicine() {
        initComponents();
        init();
    }

    private void init() {
        id.setEditable(false);
        company.setEditable(false);
        category.setEditable(false);
        stock.setEditable(false);
        price.setEditable(false);
        mfg.setEditable(false);
        expiry.setEditable(false);

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
        update = new com.raven.swing.Button();
        search = new com.raven.swing.Button();
        card1 = new com.raven.card.Card();
        card2 = new com.raven.card.Card();
        card3 = new com.raven.card.Card();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        company.setLabelText("Manufacturer");
        company.setLineColor(new java.awt.Color(157, 153, 255));
        company.setSelectionColor(new java.awt.Color(157, 153, 255));

        price.setLabelText("Price");
        price.setLineColor(new java.awt.Color(157, 153, 255));
        price.setSelectionColor(new java.awt.Color(157, 153, 255));

        update.setBackground(new java.awt.Color(200, 200, 200));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setEffectColor(new java.awt.Color(220, 220, 220));
        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
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
                    .addComponent(expiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (!fieldsEnabled) {
            displayError("Please search and select a medicine first.");
            return;
        }
        String medicineID = id.getText();
        String medicineName = name.getText();
        String medicineCompany = company.getText();
        String medicineCategory = category.getText();
        String medicineStock = stock.getText();
        String medicinePrice = price.getText();
        String medicineMfg = mfg.getText();
        String medicineExpiry = expiry.getText();

        if (medicineID.isEmpty() || medicineName.isEmpty() || medicineCompany.isEmpty() || medicineCategory.isEmpty()
                || medicineStock.isEmpty() || medicinePrice.isEmpty() || medicineMfg.isEmpty()
                || medicineExpiry.isEmpty()) {
            displayError("Please fill in all the fields.");
            return;
        }

        updateMedicine(medicineID, medicineName, medicineCompany, medicineCategory, medicineStock, medicinePrice,
                medicineMfg, medicineExpiry);

        displayMessage("Medicine updated successfully.");

        disableFields();
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String medicineName = name.getText();

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

    private void updateMedicine(String medicineID, String medicineName, String medicineCompany, String medicineCategory,
            String medicineStock, String medicinePrice, String medicineMfg, String medicineExpiry) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("medicine.txt"));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\|");
                if (fields[1].equals(medicineName)) {
                    fields[0] = medicineID;
                    fields[2] = medicineCompany;
                    fields[3] = medicineStock;
                    fields[4] = medicineCategory;
                    fields[5] = medicinePrice;
                    fields[6] = medicineMfg;
                    fields[7] = medicineExpiry;
                }
                String updatedLine = String.join("|", fields);
                content.append(updatedLine).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("medicine.txt"));
            writer.write(content.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    private void enableFields() {
        fieldsEnabled = true;
        company.setEditable(true);
        category.setEditable(true);
        stock.setEditable(true);
        price.setEditable(true);
        mfg.setEditable(true);
        expiry.setEditable(true);
    }

    private void disableFields() {
        fieldsEnabled = false;
        company.setEditable(false);
        category.setEditable(false);
        stock.setEditable(false);
        price.setEditable(false);
        mfg.setEditable(false);
        expiry.setEditable(false);

        id.setText("");
        name.setText("");
        company.setText("");
        category.setText("");
        stock.setText("");
        price.setText("");
        mfg.setText("");
        expiry.setText("");
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
        id.setText(medicineDetails[0]);
        name.setText(medicineDetails[1]);
        company.setText(medicineDetails[2]);
        stock.setText(medicineDetails[3]);
        category.setText(medicineDetails[4]);
        price.setText(medicineDetails[5]);
        mfg.setText(medicineDetails[6]);
        expiry.setText(medicineDetails[7]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private com.raven.swing.Button search;
    private com.raven.textfield.TextField stock;
    private com.raven.swing.Button update;
    // End of variables declaration//GEN-END:variables
}
