package com.raven.signup;

import com.raven.login.login;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class signup extends javax.swing.JFrame {

    private Animator animatorLogin;
    private boolean signIn;

    public signup() {
        initComponents();
        getContentPane().setBackground(new Color(245, 245, 245));
        TimingTarget targetLogin = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    background1.setAnimate(fraction);
                } else {
                    background1.setAnimate(1f - fraction);
                }
            }
        };

        animatorLogin = new Animator(1500, targetLogin);
        animatorLogin.setResolution(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new com.raven.swing.Background();
        panelLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        signup = new com.raven.swing.Button();
        username = new com.raven.swing.TextField();
        password = new com.raven.swing.PasswordField();
        confirmpassword = new com.raven.swing.PasswordField();
        reset = new com.raven.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background1.setLayout(new java.awt.CardLayout());

        panelLogin.setOpaque(false);

        jPanel1.setOpaque(false);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/drugstore.png")));

        signup.setBackground(new java.awt.Color(157, 153, 255));
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up");
        signup.setEffectColor(new java.awt.Color(199, 196, 255));
        signup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(242, 242, 242));
        username.setLabelText("User Name");
        username.setLineColor(new java.awt.Color(131, 126, 253));
        username.setSelectionColor(new java.awt.Color(157, 153, 255));

        password.setBackground(new java.awt.Color(242, 242, 242));
        password.setLabelText("Password");
        password.setLineColor(new java.awt.Color(131, 126, 253));
        password.setSelectionColor(new java.awt.Color(157, 153, 255));

        confirmpassword.setBackground(new java.awt.Color(242, 242, 242));
        confirmpassword.setLabelText("Confirm Password");
        confirmpassword.setLineColor(new java.awt.Color(131, 126, 253));
        confirmpassword.setSelectionColor(new java.awt.Color(157, 153, 255));
        confirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(200, 200, 200));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setEffectColor(new java.awt.Color(220, 220, 220));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(confirmpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo)
                .addGap(20, 20, 20)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        background1.add(panelLogin, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        if (!animatorLogin.isRunning()) {
            signIn = true;
            String user = username.getText().trim();
            String pass = String.valueOf(password.getPassword());
            String cpass = String.valueOf(confirmpassword.getPassword());
            boolean action = true;
            if (user.equals("")) {
                username.setHelperText("Please input user name");
                username.grabFocus();
                action = false;
            }

            if (pass.equals("")) {
                password.setHelperText("Please input password");
                if (action) {
                    password.grabFocus();
                }
                action = false;
            }

            if (cpass.equals("")) {
                confirmpassword.setHelperText("Please input confirm password");
                if (action) {
                    confirmpassword.grabFocus();
                }
                action = false;
            }

            if (action && pass.equals(cpass)) {
                boolean success = storeUserDetails(user, pass);
                if (success) {
                    JOptionPane.showMessageDialog(this, "User registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearLogin();
                    dispose();
                    login log = new login();
                    log.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error storing user details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (action) {
                confirmpassword.setHelperText("Passwords don't match");
                confirmpassword.setText("");
            }
        }
    }//GEN-LAST:event_signupActionPerformed

    private void confirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpasswordActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        clearLogin();
    }//GEN-LAST:event_resetActionPerformed

    private void enableLogin(boolean action) {
        username.setEditable(action);
        password.setEditable(action);
        confirmpassword.setEditable(action);
        signup.setEnabled(action);
    }

    public void clearLogin() {
        username.setText("");
        password.setText("");
        confirmpassword.setText("");
        username.setHelperText("");
        password.setHelperText("");
        confirmpassword.setHelperText("");
    }

    private boolean storeUserDetails(String user, String pass) {
        try {
            FileWriter fileWriter = new FileWriter("user.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String userEntry = String.format("%s|%s", user, pass);
            printWriter.println(userEntry);
            printWriter.println();
            printWriter.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Background background1;
    private com.raven.swing.PasswordField confirmpassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelLogin;
    private com.raven.swing.PasswordField password;
    private com.raven.swing.Button reset;
    private com.raven.swing.Button signup;
    private com.raven.swing.TextField username;
    // End of variables declaration//GEN-END:variables
}
