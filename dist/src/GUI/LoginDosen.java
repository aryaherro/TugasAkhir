package GUI;


import java.awt.Color;
import javax.swing.JFrame;

public class LoginDosen extends javax.swing.JFrame {

    /**
     * Creates new form LoginDosen
     */
    public LoginDosen() {
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

        jLabel2 = new javax.swing.JLabel();
        UserDos = new javax.swing.JTextField();
        PasDos = new javax.swing.JPasswordField();
        Masuk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(591, 473));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_pckg/BackLogo.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        UserDos.setText("Username");
        UserDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserDosActionPerformed(evt);
            }
        });
        getContentPane().add(UserDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 170, 30));

        PasDos.setText("PasMaha");
        PasDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasDosActionPerformed(evt);
            }
        });
        getContentPane().add(PasDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 170, 30));

        Masuk.setBackground(new java.awt.Color(255, 204, 102));
        Masuk.setText("MASUK");
        Masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasukMouseClicked(evt);
            }
        });
        getContentPane().add(Masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_pckg/LoginDosen.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        LoginBy b = new LoginBy();
        b.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void UserDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDosActionPerformed
        String NIk = UserDos.getText();
    }//GEN-LAST:event_UserDosActionPerformed

    private void PasDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasDosActionPerformed
        String Pasdos = PasDos.getText();

    }//GEN-LAST:event_PasDosActionPerformed

    private void MasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasukMouseClicked
        IsiDosen Dos = new IsiDosen();
        Dos.setVisible(true);
        Dos.pack();
        Dos.setLocationRelativeTo(null);
        Dos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_MasukMouseClicked

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
            java.util.logging.Logger.getLogger(LoginDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Masuk;
    private javax.swing.JPasswordField PasDos;
    private javax.swing.JTextField UserDos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
