package GUI;

import javax.swing.JOptionPane;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jempol
 */
public class IsiMahasiswa extends javax.swing.JFrame {

    private Object txtProposal;
    private Object jtxtProposal;

    /**
     * Creates new form IsiMahasiswa
     */
    public IsiMahasiswa() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeminarProposal = new javax.swing.JButton();
        jBeritaAcara1 = new javax.swing.JButton();
        jSimpan = new javax.swing.JButton();
        jSeminarTA2 = new javax.swing.JButton();
        txtTA = new javax.swing.JTextField();
        jtxtProposal1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("FAKULTAS TEKNIK INFORMATIKA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 440, 30);

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\DIAGRAM OOP\\GUI\\src\\Image_pckg\\BackLogo.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 0, 60, 50);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("JUDUL PROPOSAL");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 90, 170, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("JUDUL TA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 160, 170, 30);

        jSeminarProposal.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jSeminarProposal.setText("JADWAL SEMINAR PROPOSAL");
        jPanel1.add(jSeminarProposal);
        jSeminarProposal.setBounds(20, 340, 320, 30);

        jBeritaAcara1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jBeritaAcara1.setText("LIHAT BERITA ACARA");
        jPanel1.add(jBeritaAcara1);
        jBeritaAcara1.setBounds(20, 240, 260, 30);

        jSimpan.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jSimpan.setText("SIMPAN");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(jSimpan);
        jSimpan.setBounds(410, 500, 120, 30);

        jSeminarTA2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jSeminarTA2.setText("JADWAL SEMINAR TA");
        jPanel1.add(jSeminarTA2);
        jSeminarTA2.setBounds(20, 290, 260, 30);

        txtTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTAActionPerformed(evt);
            }
        });
        jPanel1.add(txtTA);
        txtTA.setBounds(210, 150, 310, 50);

        jtxtProposal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtProposal1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtProposal1);
        jtxtProposal1.setBounds(210, 80, 310, 50);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("==============================================");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 50, 530, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jempol\\Downloads\\maha.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 542);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        LoginMahasiswa c = new LoginMahasiswa();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jtxtProposal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtProposal1ActionPerformed
        String judulPro = jtxtProposal1.getText();
        
    }//GEN-LAST:event_jtxtProposal1ActionPerformed

    private void txtTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTAActionPerformed
         String judulTA = txtTA.getText();
    }//GEN-LAST:event_txtTAActionPerformed

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
        JOptionPane.showMessageDialog(jSimpan, "data telah disimpan");
    }//GEN-LAST:event_jSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(IsiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeritaAcara1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSeminarProposal;
    private javax.swing.JButton jSeminarTA2;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTextField jtxtProposal1;
    private javax.swing.JTextField txtTA;
    // End of variables declaration//GEN-END:variables
}
