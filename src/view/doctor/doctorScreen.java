/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akshb
 */
public class doctorScreen extends javax.swing.JPanel {

    /**
     * Creates new form doctorScreen
     */
    private JPanel bottomPanel;

    public doctorScreen(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        subTitleLabel1 = new javax.swing.JLabel();
        doctorIdTextField = new javax.swing.JTextField();
        nextScreenButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("WELCOME DOCTORS");

        subTitleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitleLabel1.setText("Please Enter your Doctor ID Number below to begin patient treatment");

        doctorIdTextField.setText("Doctor ID");
        doctorIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIdTextFieldActionPerformed(evt);
            }
        });

        nextScreenButton.setText("GO");
        nextScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextScreenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(doctorIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextScreenButton)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextScreenButton))
                .addContainerGap(348, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIdTextFieldActionPerformed

    private void nextScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextScreenButtonActionPerformed
        // TODO add your handling code here:
        PatientRegisterScreen patientRegister = new PatientRegisterScreen(bottomPanel);
        bottomPanel.add("patientScreen", patientRegister);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);

    }//GEN-LAST:event_nextScreenButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doctorIdTextField;
    private javax.swing.JButton nextScreenButton;
    private javax.swing.JLabel subTitleLabel1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
