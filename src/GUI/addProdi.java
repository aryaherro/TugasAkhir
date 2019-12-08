/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modultugasakhir.Prodi;

/**
 *
 * @author CQ42
 */
public class addProdi extends javax.swing.JFrame {

    /**
     * Creates new form addProdi
     */
    public addProdi() {
        initComponents();
        //this.setBackground (new Color(0,0,0,0)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kembaliButton = new javax.swing.JButton();
        namaProdi = new javax.swing.JTextField();
        idProdi = new javax.swing.JTextField();
        passProdi = new javax.swing.JTextField();
        buatProdi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(528, 660));
        setSize(new java.awt.Dimension(528, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kembaliButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        namaProdi.setText("nama prodi");
        namaProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaProdiActionPerformed(evt);
            }
        });
        getContentPane().add(namaProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 140, -1));

        idProdi.setText("username");
        getContentPane().add(idProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 140, -1));

        passProdi.setText("kata sandi");
        getContentPane().add(passProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 140, -1));

        buatProdi.setText("BUAT");
        buatProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatProdiActionPerformed(evt);
            }
        });
        getContentPane().add(buatProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/form-prodi.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 450, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/addProdi2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 530, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        IsiAdmin d = new IsiAdmin();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void namaProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaProdiActionPerformed

    private void buatProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatProdiActionPerformed
        // TODO add your handling code here:
        Prodi pro = new Prodi();
        try {
            pro.setIdProdi(idProdi.getText());
            pro.setNamaProdi(namaProdi.getText());
        
            pro.insertToUser(passProdi.getText());
            pro.insertToDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(addProdi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buatProdiActionPerformed

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
            java.util.logging.Logger.getLogger(addProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buatProdi;
    private javax.swing.JTextField idProdi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JTextField namaProdi;
    private javax.swing.JTextField passProdi;
    // End of variables declaration//GEN-END:variables
}
