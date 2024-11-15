/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.homepagesandfca1;

/**
 *
 * @author liamf
 */
import com.mycompany.client1.Client1GUI;
import com.mycompany.client2.Client2GUI;
import com.mycompany.server.Server;
import com.mycompany.securedocument.SecureDocument;
import com.mycompany.securepasswordmanager.PasswordManagerGUI;
import com.mycompany.securemedicalrecords.SMRGUI;

public class HomePageGUI extends javax.swing.JFrame {

    /**
     * Creates new form HomePageGUI
     */
    public HomePageGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        TitleLBL = new javax.swing.JLabel();
        PasswordManagerGUI = new javax.swing.JButton();
        MessagingGUI = new javax.swing.JButton();
        SecureMedicalGUI = new javax.swing.JButton();
        DocumentSigningGUI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TitleLBL.setText("  Home Page ");
        TitleLBL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PasswordManagerGUI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordManagerGUI.setText(" Secure Password Manager & Verifier ");
        PasswordManagerGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordManagerGUIActionPerformed(evt);
            }
        });

        MessagingGUI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MessagingGUI.setText("End-to-End Message Encryption");
        MessagingGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagingGUIActionPerformed(evt);
            }
        });

        SecureMedicalGUI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SecureMedicalGUI.setText("Secure Medical Records");
        SecureMedicalGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecureMedicalGUIActionPerformed(evt);
            }
        });

        DocumentSigningGUI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DocumentSigningGUI.setText(" Secure Document Signing");
        DocumentSigningGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentSigningGUIActionPerformed(evt);
            }
        });

        jLabel1.setText("Security Fendamentals & Development");

        jLabel2.setText("Group G");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(TitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MessagingGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordManagerGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SecureMedicalGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DocumentSigningGUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(262, 262, 262))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(PasswordManagerGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DocumentSigningGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SecureMedicalGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MessagingGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MessagingGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagingGUIActionPerformed
        // TODO add your handling code here:                                        
       // Run the server in a new thread
        new Thread(() -> {
            try {
                Server.main(null); // Start the server
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Open Client1 GUI
        Client1GUI client1GUI = new Client1GUI();
        client1GUI.setVisible(true);

        // Open Client2 GUI
        Client2GUI client2GUI = new Client2GUI();
        client2GUI.setVisible(true);

        

    }//GEN-LAST:event_MessagingGUIActionPerformed

    private void DocumentSigningGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentSigningGUIActionPerformed
        // TODO add your handling code here:
        SecureDocument secureDocument = new  SecureDocument();
        secureDocument.setVisible(true);
    }//GEN-LAST:event_DocumentSigningGUIActionPerformed

    private void PasswordManagerGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordManagerGUIActionPerformed
        // TODO add your handling code here:
        PasswordManagerGUI passwordManager = new PasswordManagerGUI();
        passwordManager.setVisible(true);
    }//GEN-LAST:event_PasswordManagerGUIActionPerformed

    private void SecureMedicalGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecureMedicalGUIActionPerformed
        // TODO add your handling code here:
        SMRGUI smr = new SMRGUI();
        smr.setVisible(true);
    }//GEN-LAST:event_SecureMedicalGUIActionPerformed

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
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocumentSigningGUI;
    private javax.swing.JButton MessagingGUI;
    private javax.swing.JButton PasswordManagerGUI;
    private javax.swing.JButton SecureMedicalGUI;
    private javax.swing.JLabel TitleLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
