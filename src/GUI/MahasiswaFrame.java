/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modultugasakhir.*;

/**
 *
 * @author Ajeng
 */
public class MahasiswaFrame extends javax.swing.JFrame {
    private User user = new User();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private JadwalSeminar jadwalSeminar = new JadwalSeminar();
    /**
     * Creates new form Mahasiswa
     */
    public MahasiswaFrame() {
        initComponents();
        hideAll(false);
    }

    
    public MahasiswaFrame(User user) {
        super("Mahasiswa : " + (new Mahasiswa().getSingleDatabase(user.getUsername())).getNama());
        setUser(user);
        setMahasiswa(new Mahasiswa().getSingleDatabase(user.getUsername()));
        initComponents();
        hideAll(false);
        namaMahasiswa.setText("Hai, " + getMahasiswa().getNama());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        namaMahasiswa = new javax.swing.JLabel();
        tambahJudul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RevisiTable = new javax.swing.JTable();
        jadwalButton = new javax.swing.JButton();
        tipeJudulComboBox = new javax.swing.JComboBox<>();
        judulLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 89, -1));

        namaMahasiswa.setText("Hai, ");
        getContentPane().add(namaMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        tambahJudul.setText("AJUKAN JUDUL");
        tambahJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahJudulActionPerformed(evt);
            }
        });
        getContentPane().add(tambahJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        RevisiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Revisi", "Tanggal Revisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RevisiTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(RevisiTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 114));

        jadwalButton.setText("LIHAT JADWAL SEMINAR");
        jadwalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jadwalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        tipeJudulComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Judul-", "Proposal", "Tugas Akhir" }));
        tipeJudulComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeJudulComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(tipeJudulComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        judulLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        judulLabel.setText("Judul : ");
        getContentPane().add(judulLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/MHS.psd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahJudulActionPerformed
        // TODO add your handling code here:
        Judul jud = new Judul(getMahasiswa().getNim(), JOptionPane.showInputDialog(null, "Masukkan Judul", "Judul", 3), JOptionPane.showInputDialog(null, "Masukkan Deskripsi", "Deskripsi", 3), tipeJudulComboBox.getSelectedItem().toString());
        jud.insertToDatabase();
        tipeJudulComboBoxActionPerformed(evt);
    }//GEN-LAST:event_tambahJudulActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void tipeJudulComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeJudulComboBoxActionPerformed
        // TODO add your handling code here:
        tambahJudul.setVisible(false);
        jadwalButton.setVisible(false);
        boolean cek = true;
        switch (tipeJudulComboBox.getSelectedItem().toString()){
            case "Proposal" :
            {
                ArrayList<Judul> AllJudul = new Judul().getAllTipeDatabase("Proposal");
                Iterator<Judul> listJudul = AllJudul.iterator();
        
                while(listJudul.hasNext()){
                    Judul judul = listJudul.next();
                    if(judul.MahasiswaDalamJudul.getNim().equals(getMahasiswa().getNim())){
                        tambahJudul.setVisible(false);
                        judulLabel.setVisible(true);
                        judulLabel.setText("Judul Proposal : " + judul.getNamaJudul());
                        getRevisiFromDatabase(judul.getIdJudul());
                        setJadwalSeminar(new JadwalSeminar().getSingleIdJudulDatabase(judul.getIdJudul()));
                        if(getJadwalSeminar().getJadwal() != null)
                            jadwalButton.setVisible(true);
                        cek = false;
                        break;
                    }
                    
                }
                if (cek){
                    JOptionPane.showMessageDialog(null, "Anda belum mengajukan Judul Proposal!");
                    tambahJudul.setVisible(true);
                    judulLabel.setVisible(false);
                }
                break;
            }
            case "Tugas Akhir" :
            {
                ArrayList<Judul> AllJudul = new Judul().getAllTipeDatabase("Tugas Akhir");
                Iterator<Judul> listJudul = AllJudul.iterator();
                
                while(listJudul.hasNext()){
                    Judul judul = listJudul.next();
                    if(judul.MahasiswaDalamJudul.getNim().equals(getMahasiswa().getNim())){
                        tambahJudul.setVisible(false);
                        judulLabel.setText("Judul Tugas Akhir : " + judul.getNamaJudul());
                        getRevisiFromDatabase(judul.getIdJudul());
                        setJadwalSeminar(new JadwalSeminar().getSingleIdJudulDatabase(judul.getIdJudul()));
                        if(getJadwalSeminar().getJadwal() != null)
                            jadwalButton.setVisible(true);
                        cek = false;
                        break;
                    }
                }
                if (cek){
                    JOptionPane.showMessageDialog(null, "Anda belum mengajukan Judul Tugas Akhir!");
                    tambahJudul.setVisible(true);
                    judulLabel.setVisible(false);
                }
                break;
            }
            default :
            {
                tambahJudul.setVisible(false);
                hideAll(false);
                JOptionPane.showMessageDialog(null, "Pilih tipe judul!");
                
            }
        }
        //JOptionPane.showMessageDialog(null, "Data Sudah di simpan");
        
    }//GEN-LAST:event_tipeJudulComboBoxActionPerformed

    private void jadwalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, new SimpleDateFormat("dd-MM-yyyy").format(getJadwalSeminar().getJadwal()));
    }//GEN-LAST:event_jadwalButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null, "data sudah di simpan");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaFrame().setVisible(true);
            }
        });
    }
    
    public void getRevisiFromDatabase(String idJudul){
        DefaultTableModel modelTableRevisi = (DefaultTableModel) RevisiTable.getModel();
        modelTableRevisi.setRowCount(0);
        Object[] atributRevisi = new Object[2];
        try {
            ArrayList RevisiAll = new Revisi().getAllIdJudulDatabase(idJudul);
            Iterator listRevisi = RevisiAll.iterator();
            while(listRevisi.hasNext()){
                Revisi eachRevisi;
                eachRevisi = (Revisi) listRevisi.next();
                atributRevisi[0] = eachRevisi.getIsiRevisi();
                atributRevisi[1] = new SimpleDateFormat("dd-MM-yyyy").format(eachRevisi.getTanggalRevisi());
        
                modelTableRevisi.addRow(atributRevisi);
            }
            RevisiTable.setModel(modelTableRevisi);
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hideAll(boolean bool){
        jadwalButton.setVisible(bool);
        judulLabel.setVisible(bool);
        tambahJudul.setVisible(bool);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RevisiTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jadwalButton;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel namaMahasiswa;
    private javax.swing.JButton tambahJudul;
    private javax.swing.JComboBox<String> tipeJudulComboBox;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the mahasiswa
     */
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    /**
     * @param mahasiswa the mahasiswa to set
     */
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    /**
     * @return the jadwalSeminar
     */
    public JadwalSeminar getJadwalSeminar() {
        return jadwalSeminar;
    }

    /**
     * @param jadwalSeminar the jadwalSeminar to set
     */
    public void setJadwalSeminar(JadwalSeminar jadwalSeminar) {
        this.jadwalSeminar = jadwalSeminar;
    }
}
