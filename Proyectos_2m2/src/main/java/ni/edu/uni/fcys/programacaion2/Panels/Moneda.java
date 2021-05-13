/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacaion2.Panels;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO 17
 */
public class Moneda extends javax.swing.JPanel {

    /**
     * Creates new form Moneda
     */
    public Moneda() {
        initComponents();
    }

    public JLabel getLblResult() {
        return LblResult;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public JButton getBtnCalc() {
        return btnCalc;
    }

    public JComboBox<String> getCmbFrom() {
        return cmbFrom;
    }

    public JComboBox<String> getCmbTo() {
        return cmbTo;
    }

    public JTextField getTxtValue() {
        return txtValue;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnCalc = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbTo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        LblResult = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        btnCalc.setText("Calcular");
        jPanel1.add(btnCalc);

        btnBorrar.setText("Borrar");
        jPanel1.add(btnBorrar);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("De:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 16, 6);
        jPanel2.add(cmbFrom, gridBagConstraints);

        jLabel2.setText("A:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 18, 6);
        jPanel2.add(cmbTo, gridBagConstraints);

        jLabel3.setText("Valor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 16, 6);
        jPanel2.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 16, 6);
        jPanel2.add(txtValue, gridBagConstraints);

        LblResult.setText("Resultado: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 6, 6);
        jPanel2.add(LblResult, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblResult;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalc;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
