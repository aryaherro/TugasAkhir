/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Toshiba
 */
public class isiFrom extends javax.swing.JFrame {

    /**
     * Creates new form isiFrom
     */
    public isiFrom() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cariButton = new javax.swing.JButton();
        opsiComboBox = new javax.swing.JComboBox<>();
        idTextField = new javax.swing.JTextField();
        idProdiLabel = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        nppLabel = new javax.swing.JLabel();
        namaProdiLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        kataSandiLabel = new javax.swing.JLabel();
        nikLabel = new javax.swing.JLabel();
        tglLahirLabel = new javax.swing.JLabel();
        jKLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        agamaLabel = new javax.swing.JLabel();
        prodiLabel1 = new javax.swing.JLabel();
        dsnPembLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        namaTextField = new javax.swing.JTextField();
        kataSandiTextField = new javax.swing.JTextField();
        nikTextField = new javax.swing.JTextField();
        LRadioButton = new javax.swing.JRadioButton();
        PRadioButton = new javax.swing.JRadioButton();
        alamatTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        agamaComboBox = new javax.swing.JComboBox<>();
        prodiTextField = new javax.swing.JTextField();
        dsnPembTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cariButton.setText("Cari");
        jPanel1.add(cariButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        opsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prodi", "Dosen", "Mahasiswa", "Tambah Baru" }));
        opsiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsiComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(opsiComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 230, -1));

        idTextField.setText("id");
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 30));

        idProdiLabel.setText("ID Prodi");
        jPanel1.add(idProdiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        nimLabel.setText("NIM");
        jPanel1.add(nimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        nppLabel.setText("NPP");
        jPanel1.add(nppLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        namaProdiLabel.setText("Nama Prodi");
        jPanel1.add(namaProdiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        namaLabel.setText("Nama");
        jPanel1.add(namaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        kataSandiLabel.setText("Kata Sandi");
        jPanel1.add(kataSandiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        nikLabel.setText("NIK");
        jPanel1.add(nikLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        tglLahirLabel.setText("Tanggal Lahir");
        jPanel1.add(tglLahirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jKLabel.setText("Jenis Kelamin");
        jPanel1.add(jKLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        alamatLabel.setText("Alamat");
        jPanel1.add(alamatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        emailLabel.setText("E-Mail");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        agamaLabel.setText("Agama");
        jPanel1.add(agamaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        prodiLabel1.setText("Prodi");
        jPanel1.add(prodiLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, -1));

        dsnPembLabel.setText("Dosen Pembimbing");
        jPanel1.add(dsnPembLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, -1, -1));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 750, -1, -1));

        tambahButton.setText("Tambah");
        jPanel1.add(tambahButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 750, -1, -1));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        namaTextField.setText("nama");
        jPanel1.add(namaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 180, 30));

        kataSandiTextField.setText("kata sandi");
        kataSandiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kataSandiTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(kataSandiTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 180, 30));

        nikTextField.setText("nik");
        jPanel1.add(nikTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 180, 30));

        LRadioButton.setText("L");
        jPanel1.add(LRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        PRadioButton.setText("P");
        jPanel1.add(PRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        alamatTextField.setText("alamat");
        jPanel1.add(alamatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 180, 50));

        emailTextField.setText("email");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 180, 30));

        agamaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISLAM", "KRISTEN", "KATOLIK", "HINDU", "BUDHA", "KONGHUCU" }));
        agamaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agamaComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(agamaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 160, -1));

        prodiTextField.setText("prodi");
        jPanel1.add(prodiTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 180, -1));

        dsnPembTextField.setText("dosen pembimbing");
        jPanel1.add(dsnPembTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 690, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/isiForm.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 840));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agamaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agamaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agamaComboBoxActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void kataSandiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kataSandiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kataSandiTextFieldActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void opsiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opsiComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(isiFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(isiFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(isiFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(isiFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new isiFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LRadioButton;
    private javax.swing.JRadioButton PRadioButton;
    private javax.swing.JComboBox<String> agamaComboBox;
    private javax.swing.JLabel agamaLabel;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JButton cariButton;
    private javax.swing.JLabel dsnPembLabel;
    private javax.swing.JTextField dsnPembTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel idProdiLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jKLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kataSandiLabel;
    private javax.swing.JTextField kataSandiTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaProdiLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel nikLabel;
    private javax.swing.JTextField nikTextField;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JLabel nppLabel;
    private javax.swing.JComboBox<String> opsiComboBox;
    private javax.swing.JLabel prodiLabel1;
    private javax.swing.JTextField prodiTextField;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel tglLahirLabel;
    // End of variables declaration//GEN-END:variables
}
