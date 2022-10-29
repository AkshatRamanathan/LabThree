/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterDirectory;
import model.Hospital;
import model.MainSystem;

/**
 *
 * @author akshb
 */
public class ExistingPatientScreen extends javax.swing.JPanel {

    /**
     * @param bottomPanel the value of bottomPanel
     */
    private JPanel bottomPanel;
    private MainSystem rootDataObj;
    private Doctor doctorLogin;
    Hospital selectedHospital;

    public ExistingPatientScreen(JPanel bottomPanel, Doctor doctorLogin, Hospital selectedHospital, MainSystem rootDataObj) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.rootDataObj = rootDataObj;
        this.doctorLogin = doctorLogin;
        this.selectedHospital = selectedHospital;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        patientSearchField = new javax.swing.JTextField();
        patientSearchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        selectPatientButton = new javax.swing.JButton();

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Email", "Phone Number", "Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setResizable(false);
            patientTable.getColumnModel().getColumn(1).setResizable(false);
            patientTable.getColumnModel().getColumn(2).setResizable(false);
            patientTable.getColumnModel().getColumn(3).setResizable(false);
            patientTable.getColumnModel().getColumn(4).setResizable(false);
        }

        patientSearchField.setText("Search Patient");
        patientSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchFieldActionPerformed(evt);
            }
        });

        patientSearchButton.setText("GO");
        patientSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        selectPatientButton.setText("Choose selected Patient");
        selectPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patientSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientSearchButton)
                        .addGap(192, 192, 192))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patientSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(patientSearchField)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectPatientButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientSearchFieldActionPerformed

    private void patientSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_patientSearchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        PatientRegisterScreen patientRegister = new PatientRegisterScreen(bottomPanel, doctorLogin, null, rootDataObj); //add hospital
        bottomPanel.add("patientScreen", patientRegister);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);

    }//GEN-LAST:event_backButtonActionPerformed

    private void selectPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPatientButtonActionPerformed
        // TODO add your handling code here:
//        int selectedIndex = patientTable.getSelectedRow();
//        if (selectedIndex < 0) {
//            JOptionPane.showMessageDialog(this, "Please select a patient", "Error - No selection", JOptionPane.WARNING_MESSAGE);
//        } else {
//            DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
//            Employee selectedEmployee = (Employee) model.getValueAt(selectedIndex, 0);
//            displayDetails(selectedEmployee);
//        }
    }//GEN-LAST:event_selectPatientButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton patientSearchButton;
    private javax.swing.JTextField patientSearchField;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton selectPatientButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        EncounterDirectory currentEncounters = selectedHospital.getEncounters();
        for (Encounter enc : currentEncounters.getEncounter()) {
            Object[] row = new Object[5];
//            row[1] = enc.getPatient().getPersonId();
            row[1] = enc.getPatient();
            row[1] = enc.getPatient().getName();
            row[2] = enc.getPatient().getEmailId();
            row[3] = Long.toString(enc.getPatient().getPhoneNumber());
            row[4] = enc.getDoctor().getName();

            model.addRow(row);
        }
    }
}
