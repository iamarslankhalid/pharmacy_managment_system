package com.raven.form;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.raven.card.ModelCard;

public class User_Details extends javax.swing.JPanel {

    public User_Details() {
        initComponents();
        init();
    }

    private void init() {
        table.fixTable(jScrollPane1);
        String totalUsers = "0";
        String totalMedicines = "0";
        String reportProfit = "0";

        try (BufferedReader reader = new BufferedReader(new FileReader("user.txt"))) {
            int userCount = 0;
            int counter = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 2) {
                    Object[] rowData = new Object[3];
                    rowData[0] = counter;
                    rowData[1] = parts[0].trim();
                    rowData[2] = parts[1].trim();

                    table.addRow(rowData);
                    userCount++;
                    counter++;
                }
            }
            totalUsers = Integer.toString(userCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

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

        card1 = new com.raven.card.Card();
        card2 = new com.raven.card.Card();
        card3 = new com.raven.card.Card();
        roundPanel1 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();

        setOpaque(false);

        card1.setColor2(new java.awt.Color(78, 84, 200));
        card1.setDescription("Total Medicine");
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
                "#", "Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

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
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
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
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.card.Card card1;
    private com.raven.card.Card card2;
    private com.raven.card.Card card3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
