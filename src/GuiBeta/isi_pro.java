/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiBeta;

import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modultugasakhir.*;

/**
 *
 * @author Jempol
 */
public class isi_pro extends javax.swing.JFrame {
    private User user = new User();
    private Prodi prodi = new Prodi();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private Judul judul = new Judul();
    private JadwalSeminar jadwalSeminar = new JadwalSeminar();
    private Kelayakan kelayakan = new Kelayakan();

    /**
     * Creates new form isi_pro
     */
    public isi_pro() {
        initComponents();
    }

    public isi_pro(User user) {
        initComponents();
        setUser(user);
        setProdi(new Prodi().getSingleDatabase(getUser().getUsername()));
        hideAll(false);
        getJudulKelayakanFromDatabase();
        seminarDateChooser.setDateFormatString("dd-MM-yyyy");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        seminarTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        seminarJadwalButton = new javax.swing.JButton();
        seminarDateChooser = new com.toedter.calendar.JDateChooser();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LIST MAHASISWA");

        seminarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "JUDUL", "DOSEN PEMBIMBING", "TANGGAL SEMINAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        seminarTable.setColumnSelectionAllowed(true);
        seminarTable.getTableHeader().setReorderingAllowed(false);
        seminarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seminarTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(seminarTable);
        seminarTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRODI");

        seminarJadwalButton.setText("Masukkan Jadwal");
        seminarJadwalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seminarJadwalButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 313, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(seminarDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seminarJadwalButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(logoutButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seminarJadwalButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(seminarDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(337, 337, 337))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seminarJadwalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seminarJadwalButtonActionPerformed
        // TODO add your handling code here:
        Date jadwal = seminarDateChooser.getDate();
        setJadwalSeminar(new JadwalSeminar(getProdi().getIdProdi(), getMahasiswa().getNim(), jadwal));
        getJadwalSeminar().insertToDatabase();
        JOptionPane.showMessageDialog(null, "Data Tersimpan");
        hideAll(false);
        getJudulKelayakanFromDatabase();
    }//GEN-LAST:event_seminarJadwalButtonActionPerformed

    private void seminarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seminarTableMouseClicked
        // TODO add your handling code here:
        String nim = (String) seminarTable.getValueAt(seminarTable.getSelectedRow(), 0);
        setMahasiswa(new Mahasiswa().getSingleDatabase(nim));
        Date jadwal = (Date) seminarTable.getValueAt(seminarTable.getSelectedRow(), 3);
        if (jadwal == null)
            hideAll(true);
    }//GEN-LAST:event_seminarTableMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(isi_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(isi_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(isi_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(isi_pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new isi_pro().setVisible(true);
            }
        });
    }

    public void getJudulKelayakanFromDatabase(){
        DefaultTableModel modelTableJudul = (DefaultTableModel) seminarTable.getModel();
        modelTableJudul.setRowCount(0);
        Object[] atributKelayakan = new Object[4];
        try {
            ArrayList<Kelayakan> KelayakanAll = new Kelayakan().getAllDatabase("");
            Iterator listKelayakan = KelayakanAll.iterator();
            while(listKelayakan.hasNext()){
                Kelayakan eachKelayakan = (Kelayakan) listKelayakan.next();
                if(eachKelayakan.getStatusLayak() == true){
                    String nim = eachKelayakan.JudulDalamKelayakan.MahasiswaDalamJudul.getNim();
                    atributKelayakan[0] = nim;
                    atributKelayakan[1] = eachKelayakan.JudulDalamKelayakan.getNamaJudul();
                    atributKelayakan[2] = eachKelayakan.JudulDalamKelayakan.MahasiswaDalamJudul.DosenPembimbingMahasiswa.getNama();

                    atributKelayakan[3] = new JadwalSeminar().getSingleNimDatabase(nim).getJadwal();

                    modelTableJudul.addRow(atributKelayakan);
                }
            }
            seminarTable.setModel(modelTableJudul);
        } catch (HeadlessException ex) {
            
        }
    }
    
    public void hideAll(boolean bool){
        seminarDateChooser.setVisible(bool);
        seminarJadwalButton.setVisible(bool);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutButton;
    private com.toedter.calendar.JDateChooser seminarDateChooser;
    private javax.swing.JButton seminarJadwalButton;
    private javax.swing.JTable seminarTable;
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
     * @return the prodi
     */
    public Prodi getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
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
     * @return the judul
     */
    public Judul getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(Judul judul) {
        this.judul = judul;
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

    /**
     * @return the kelayakan
     */
    public Kelayakan getKelayakan() {
        return kelayakan;
    }

    /**
     * @param kelayakan the kelayakan to set
     */
    public void setKelayakan(Kelayakan kelayakan) {
        this.kelayakan = kelayakan;
    }
}
