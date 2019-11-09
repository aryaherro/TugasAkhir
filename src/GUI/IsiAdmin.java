/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author Jempol
 */
public class IsiAdmin extends javax.swing.JFrame {

    /**
     * Creates new form IsiAdmin
     */
    public IsiAdmin() {
        initComponents();
        this.setBackground (new Color(0,0,0,0)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupButton = new javax.swing.ButtonGroup();
        jTmbMaha = new javax.swing.JRadioButton();
        jTmbDosen = new javax.swing.JRadioButton();
        jTmbPro = new javax.swing.JRadioButton();
        jBtnGO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 528));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(660, 528));
        setSize(new java.awt.Dimension(660, 528));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTmbMaha.setBackground(new java.awt.Color(255, 255, 255));
        GroupButton.add(jTmbMaha);
        jTmbMaha.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jTmbMaha.setText("TAMBAH MAHASISWA");
        jTmbMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmbMahaActionPerformed(evt);
            }
        });
        getContentPane().add(jTmbMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 190, 30));

        jTmbDosen.setBackground(new java.awt.Color(255, 255, 255));
        GroupButton.add(jTmbDosen);
        jTmbDosen.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jTmbDosen.setText("TAMBAH DOSEN");
        jTmbDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmbDosenActionPerformed(evt);
            }
        });
        getContentPane().add(jTmbDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 30));

        jTmbPro.setBackground(new java.awt.Color(255, 255, 255));
        GroupButton.add(jTmbPro);
        jTmbPro.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jTmbPro.setText("TAMBAH PRODI");
        jTmbPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmbProActionPerformed(evt);
            }
        });
        getContentPane().add(jTmbPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 190, 30));

        jBtnGO.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jBtnGO.setText("GO");
        jBtnGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGOMouseClicked(evt);
            }
        });
        jBtnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGOActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/BackLogo.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/IsiAdmin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 660, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGOMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        LoginAdmin d = new LoginAdmin();
        d.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jBtnGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGOActionPerformed

    private void jTmbProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmbProActionPerformed
        // TODO add your handling code here:
        addProdi d = new addProdi();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTmbProActionPerformed

    private void jTmbDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmbDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmbDosenActionPerformed

    private void jTmbMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmbMahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmbMahaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IsiAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupButton;
    private javax.swing.JButton jBtnGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jTmbDosen;
    private javax.swing.JRadioButton jTmbMaha;
    private javax.swing.JRadioButton jTmbPro;
    // End of variables declaration//GEN-END:variables
}
