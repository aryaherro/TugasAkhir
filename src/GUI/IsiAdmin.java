/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTmbPro = new javax.swing.JRadioButton();
        jTmbMaha = new javax.swing.JRadioButton();
        jTmbDosen = new javax.swing.JRadioButton();
        jBtnGO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("FAKULTAS TEKNIK INFORMATIKA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("==============================================");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTmbPro.setBackground(new java.awt.Color(0, 0, 0));
        jTmbPro.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jTmbPro.setForeground(new java.awt.Color(255, 255, 255));
        jTmbPro.setText("TAMBAH PRODI");
        jTmbPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmbProActionPerformed(evt);
            }
        });
        getContentPane().add(jTmbPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 30));

        jTmbMaha.setBackground(new java.awt.Color(0, 0, 0));
        jTmbMaha.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jTmbMaha.setForeground(new java.awt.Color(255, 255, 255));
        jTmbMaha.setText("TAMBAH MAHASISWA");
        jTmbMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmbMahaActionPerformed(evt);
            }
        });
        getContentPane().add(jTmbMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 30));

        jTmbDosen.setBackground(new java.awt.Color(0, 0, 0));
        jTmbDosen.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jTmbDosen.setForeground(new java.awt.Color(255, 255, 255));
        jTmbDosen.setText("TAMBAH DOSEN");
        jTmbDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmbDosenActionPerformed(evt);
            }
        });
        getContentPane().add(jTmbDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));

        jBtnGO.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jBtnGO.setText("GO");
        jBtnGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGOMouseClicked(evt);
            }
        });
        getContentPane().add(jBtnGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/BackLogo.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jempol\\Documents\\GitHub\\TugasAkhir\\src\\GUI\\Image_pckg\\maha.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTmbProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmbProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmbProActionPerformed

    private void jTmbMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmbMahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmbMahaActionPerformed

    private void jTmbDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmbDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmbDosenActionPerformed

    private void jBtnGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnGOMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        LoginAdmin d = new LoginAdmin();
        d.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(IsiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jTmbDosen;
    private javax.swing.JRadioButton jTmbMaha;
    private javax.swing.JRadioButton jTmbPro;
    // End of variables declaration//GEN-END:variables
}
