package GuiBeta;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modultugasakhir.*;

public class LoginFrame extends javax.swing.JFrame {
    private User u = new User();
    public LoginFrame() {
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

        jLabel6 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        kataSandi = new javax.swing.JTextField();
        masukButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setText("Username");
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 120, 30));

        kataSandi.setText("Kata sandi");
        kataSandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kataSandiActionPerformed(evt);
            }
        });
        getContentPane().add(kataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 30));

        masukButton.setText("MASUK");
        masukButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masukButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_pckg/Close32.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/LoginBy.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 459));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void kataSandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kataSandiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kataSandiActionPerformed

    private void masukButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukButtonActionPerformed
        // TODO add your handling code here:
        if ((getU().cekLogin(Username.getText(), kataSandi.getText())) && (getU().getTypeUser() != null)) {
            switch (getU().getTypeUser())
            {
                case "Admin" :
                {
                    new AdminFrame(getU()).setVisible(true);
                    break;
                }
                
                case "Prodi" :
                {
                    //                      new IsiProdi(u.getUsername()).setVisible(true);
                    break;
                }
                
                case "Dosen" :
                {
                    new isi_dos(getU()).setVisible(true);
                    break;
                }

                case "Mahasiswa" :
                {
                    new MahasiswaFrame(getU()).setVisible(true);
                    break;
                }
                
                default :
                {
                    JOptionPane.showMessageDialog(null, "Data login tidak ditemukan!");
                }
            }
            setVisible(false);
        }
    }//GEN-LAST:event_masukButtonActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kataSandi;
    private javax.swing.JButton masukButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the u
     */
    public User getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(User u) {
        this.u = u;
    }
}
