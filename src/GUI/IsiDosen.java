/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import javax.swing.JOptionPane;
//import javax.swing.JFrame;
//import java.awt.Color;
/**
 *
 * @author Jempol
 */
public class IsiDosen extends javax.swing.JFrame {

    /** Creates new form IsiDosen */
    public IsiDosen() {
        initComponents();
//        this.setBackground (new Color(0,0,0,0));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNIM = new javax.swing.JTextField();
        jBtnGO = new javax.swing.JButton();
        jBtnProposal = new javax.swing.JRadioButton();
        jBtnTA = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtRevisi = new javax.swing.JTextField();
        jBeritaAcara1 = new javax.swing.JButton();
        jSeminarTA2 = new javax.swing.JButton();
        jSeminarProposal = new javax.swing.JButton();
        jSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 542));
        setSize(new java.awt.Dimension(540, 542));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("FAKULTAS TEKNIK INFORMATIKA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 30));

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/BackLogo.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 60, 50));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("==============================================");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("NIM MAHASISWA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 30));

        jtxtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNIMActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 310, 50));

        jBtnGO.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jBtnGO.setText("GO");
        jBtnGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGOMouseClicked(evt);
            }
        });
        getContentPane().add(jBtnGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 80, -1));

        jBtnProposal.setBackground(new java.awt.Color(0, 0, 0));
        jBtnProposal.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jBtnProposal.setForeground(new java.awt.Color(255, 255, 255));
        jBtnProposal.setText("PROPOSAL TA");
        jBtnProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProposalActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnProposal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, -1));

        jBtnTA.setBackground(new java.awt.Color(0, 0, 0));
        jBtnTA.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jBtnTA.setForeground(new java.awt.Color(255, 255, 255));
        jBtnTA.setText("TA");
        jBtnTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTAActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 70, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("MASUKKAN REVISI / CATATAN :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 30));

        jtxtRevisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRevisiActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtRevisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 480, 150));

        jBeritaAcara1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jBeritaAcara1.setText("LIHAT BERITA ACARA");
        jBeritaAcara1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeritaAcara1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBeritaAcara1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 240, 20));

        jSeminarTA2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jSeminarTA2.setText("JADWAL SEMINAR TA");
        getContentPane().add(jSeminarTA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 240, 20));

        jSeminarProposal.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jSeminarProposal.setText("JADWAL SEMINAR PROPOSAL");
        getContentPane().add(jSeminarProposal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 280, 20));

        jSimpan.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jSimpan.setText("SIMPAN");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/maha.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 542));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        LoginDosen d = new LoginDosen();
        d.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jtxtRevisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRevisiActionPerformed
        String revisi = jtxtRevisi.getText();

    }//GEN-LAST:event_jtxtRevisiActionPerformed

    private void jtxtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNIMActionPerformed
     String nim = jtxtNIM.getText();
    }//GEN-LAST:event_jtxtNIMActionPerformed

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
        JOptionPane.showMessageDialog(jSimpan, "data telah disimpan");
    }//GEN-LAST:event_jSimpanActionPerformed

    private void jBeritaAcara1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeritaAcara1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeritaAcara1ActionPerformed

    private void jBtnGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGOMouseClicked

    private void jBtnProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProposalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnProposalActionPerformed

    private void jBtnTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnTAActionPerformed

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
            java.util.logging.Logger.getLogger(IsiDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IsiDosen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeritaAcara1;
    private javax.swing.JButton jBtnGO;
    private javax.swing.JRadioButton jBtnProposal;
    private javax.swing.JRadioButton jBtnTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jSeminarProposal;
    private javax.swing.JButton jSeminarTA2;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTextField jtxtNIM;
    private javax.swing.JTextField jtxtRevisi;
    // End of variables declaration//GEN-END:variables

}
