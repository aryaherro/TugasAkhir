package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LoginMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form LoginMahasiswa
     */
    public LoginMahasiswa() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PasMaha = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        MASUK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("Username");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(591, 472));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_pckg/BackLogo.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 50));

        PasMaha.setText("PasMaha");
        PasMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasMahaActionPerformed(evt);
            }
        });
        getContentPane().add(PasMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        Username.setText("Username");
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, -1));

        MASUK.setBackground(new java.awt.Color(255, 204, 102));
        MASUK.setText("MASUK");
        MASUK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MASUKMouseClicked(evt);
            }
        });
        getContentPane().add(MASUK, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_pckg/LoginMahasiswa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasMahaActionPerformed
        String Pasmaha = PasMaha.getText();
        
    }//GEN-LAST:event_PasMahaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        LoginBy b = new LoginBy();
        b.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
            String NIM = Username.getText();
    }//GEN-LAST:event_UsernameActionPerformed

    private void MASUKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MASUKMouseClicked
       IsiMahasiswa LMhs = new IsiMahasiswa();
        LMhs.setVisible(true);
        LMhs.pack();
        LMhs.setLocationRelativeTo(null);
        LMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_MASUKMouseClicked

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
            java.util.logging.Logger.getLogger(LoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MASUK;
    private javax.swing.JPasswordField PasMaha;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
