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
public class addMaha extends javax.swing.JFrame {
    String DataTransfer;
    /**
     * Creates new form addMaha
     */
    public addMaha() {
        initComponents();
    }
    
    public addMaha(String DataTransfer) {
        this.DataTransfer = DataTransfer;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        nim = new javax.swing.JTextField();
        nppMaha = new javax.swing.JTextField();
        namaMaha = new javax.swing.JTextField();
        passMaha = new javax.swing.JTextField();
        LMaha = new javax.swing.JRadioButton();
        PMaha = new javax.swing.JRadioButton();
        alamatMaha = new javax.swing.JTextField();
        emailMaha = new javax.swing.JTextField();
        agamaMaha = new javax.swing.JComboBox<>();
        buatMaha = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(530, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nim.setText("NIM");
        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });
        getContentPane().add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 180, -1));

        nppMaha.setText("NPP");
        getContentPane().add(nppMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 180, -1));

        namaMaha.setText("Nama Mahasiswa");
        getContentPane().add(namaMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 180, 30));

        passMaha.setText("Kata Sandi");
        getContentPane().add(passMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 180, -1));

        LMaha.setText("L");
        LMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMahaActionPerformed(evt);
            }
        });
        getContentPane().add(LMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        PMaha.setText("P");
        getContentPane().add(PMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        alamatMaha.setText("Alamat");
        getContentPane().add(alamatMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 180, 50));

        emailMaha.setText("e-mail");
        getContentPane().add(emailMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 180, -1));

        agamaMaha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISLAM", "KRISTEN", "KATOLIK", "HINDU", "BUDHA", "KONGHUCU" }));
        agamaMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agamaMahaActionPerformed(evt);
            }
        });
        getContentPane().add(agamaMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 120, -1));

        buatMaha.setText("BUAT");
        getContentPane().add(buatMaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kembaliButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/form-Mahasiswa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 450, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/addProdi2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LMahaActionPerformed

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    private void agamaMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agamaMahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agamaMahaActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        new IsiAdmin(DataTransfer).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kembaliButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addMaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMaha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LMaha;
    private javax.swing.JRadioButton PMaha;
    private javax.swing.JComboBox<String> agamaMaha;
    private javax.swing.JTextField alamatMaha;
    private javax.swing.JButton buatMaha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailMaha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JTextField namaMaha;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField nppMaha;
    private javax.swing.JTextField passMaha;
    // End of variables declaration//GEN-END:variables
}
