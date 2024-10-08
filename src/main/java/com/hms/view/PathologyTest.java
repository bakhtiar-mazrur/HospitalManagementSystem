/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms.view;

import com.hms.model.*;
import com.hms.controller.SaveData;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class PathologyTest extends javax.swing.JFrame {

    /**
     * Creates new form PathologyTest
     */
    public PathologyTest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultPopup = new javax.swing.JPopupMenu();
        testName = new javax.swing.JLabel();
        testPrice = new javax.swing.JLabel();
        pathologyTestName = new javax.swing.JTextField();
        pathologyTestCost = new javax.swing.JTextField();
        isTestAvailability = new javax.swing.JCheckBox();
        btnPathologyDataSubmission = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        testInfo = new javax.swing.JLabel();
        lblTestType = new javax.swing.JLabel();
        drpdnTestType = new javax.swing.JComboBox<>();
        lblReagent = new javax.swing.JLabel();
        inputReagentName = new javax.swing.JTextField();

        resultPopup.setMaximumSize(new java.awt.Dimension(854, 480));
        resultPopup.setMinimumSize(new java.awt.Dimension(320, 240));
        resultPopup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                resultPopupPopupMenuWillBecomeVisible(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        testName.setText("Test Name:");

        testPrice.setText("Price:");

        pathologyTestName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pathologyTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathologyTestNameActionPerformed(evt);
            }
        });

        pathologyTestCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathologyTestCostActionPerformed(evt);
            }
        });

        isTestAvailability.setText("Available");
        isTestAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isTestAvailabilityActionPerformed(evt);
            }
        });

        btnPathologyDataSubmission.setText("Submit");
        btnPathologyDataSubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathologyDataSubmissionActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        testInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        testInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTestType.setText("Test Type: ");

        drpdnTestType.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "CBC", "RBS", "NS1", "Creatinine" }));
        drpdnTestType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpdnTestTypeActionPerformed(evt);
            }
        });

        lblReagent.setText("Reagent:");

        inputReagentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputReagentNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(testInfo, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(testPrice, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(testName, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblTestType, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblReagent, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        103, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(isTestAvailability,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(btnPathologyDataSubmission,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(btCancel,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addComponent(pathologyTestName,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 321,
                                                                Short.MAX_VALUE)
                                                        .addComponent(pathologyTestCost,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 321,
                                                                Short.MAX_VALUE)
                                                        .addComponent(drpdnTestType, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(inputReagentName))))
                                .addGap(171, 171, 171)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(testName)
                                        .addComponent(pathologyTestName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTestType)
                                        .addComponent(drpdnTestType, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblReagent)
                                        .addComponent(inputReagentName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(testPrice)
                                        .addComponent(pathologyTestCost, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(isTestAvailability)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPathologyDataSubmission)
                                        .addComponent(btCancel))
                                .addGap(18, 18, 18)
                                .addComponent(testInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathologyTestCostActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pathologyTestCostActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pathologyTestCostActionPerformed

    private void btnPathologyDataSubmissionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPathologyDataSubmissionActionPerformed
        String testName = pathologyTestName.getText();
        String testType = (String) drpdnTestType.getSelectedItem();
        String reagentName = (String) inputReagentName.getText();
        double cost = Double.parseDouble(pathologyTestCost.getText());
        boolean availability = isTestAvailability.isSelected();

        PathologicalTest pTest = new PathologicalTest(testName, testType, reagentName, cost, availability);
        // SaveData resultSaver = new SaveData(pTest.returnLabTestInfo());
        new SaveData(pTest.returnLabTestInfo());

        testInfo.setText(pTest.returnLabTestInfo());
        // resultSaver.write(pTest.returnLabTestInfo());
    }// GEN-LAST:event_btnPathologyDataSubmissionActionPerformed

    private void pathologyTestNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pathologyTestNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pathologyTestNameActionPerformed

    private void isTestAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_isTestAvailabilityActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_isTestAvailabilityActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btCancelActionPerformed

    private void resultPopupPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {// GEN-FIRST:event_resultPopupPopupMenuWillBecomeVisible
        // TODO add your handling code here:

    }// GEN-LAST:event_resultPopupPopupMenuWillBecomeVisible

    private void drpdnTestTypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_drpdnTestTypeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_drpdnTestTypeActionPerformed

    private void inputReagentNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputReagentNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputReagentNameActionPerformed

    // /**
    // * @param args the command line arguments
    // */
    // public static void main(String args[]) {
    // /* Set the Nimbus look and feel */
    // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    // /* If Nimbus (introduced in Java SE 6) is not available, stay with the
    // default look and feel.
    // * For details see
    // http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    // */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    // javax.swing.UIManager.getInstalledLookAndFeels()) {
    // if ("Nimbus".equals(info.getName())) {
    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
    // break;
    // }
    // }
    // } catch (ClassNotFoundException ex) {
    // java.util.logging.Logger.getLogger(PathologyTest.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(PathologyTest.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(PathologyTest.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(PathologyTest.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // }
    // //</editor-fold>
    //
    // /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // new PathologyTest().setVisible(true);
    // }
    // });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btnPathologyDataSubmission;
    private javax.swing.JComboBox<String> drpdnTestType;
    private javax.swing.JTextField inputReagentName;
    private javax.swing.JCheckBox isTestAvailability;
    private javax.swing.JLabel lblReagent;
    private javax.swing.JLabel lblTestType;
    private javax.swing.JTextField pathologyTestCost;
    private javax.swing.JTextField pathologyTestName;
    private javax.swing.JPopupMenu resultPopup;
    private javax.swing.JLabel testInfo;
    private javax.swing.JLabel testName;
    private javax.swing.JLabel testPrice;
    // End of variables declaration//GEN-END:variables
}
