/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiBeta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modultugasakhir.*;

/**
 *
 * @author Jempol
 */
@SuppressWarnings("serial")
public class DosenFrame extends javax.swing.JFrame {
    private User user = new User();
    private Dosen dosen = new Dosen();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private Judul judul = new Judul();
    private Revisi revisi = new Revisi();
    private Kelayakan kelayakan = new Kelayakan();
    
    /**
     * Creates new form isi_dos
     */
    public DosenFrame() {
        initComponents();
        hideShowAll(false);
        getAllMahasiswaBimbingan();
        
    }
    
    public DosenFrame(User user) {
        setUser(user);
        setDosen(new Dosen().getSingleDatabase(user.getUsername()));
        initComponents();
        hideShowAll(false);
        getAllMahasiswaBimbingan();
        nidnLabel.setText("NIDN                            : " + getDosen().getNpp());
        namaDosenLabel.setText("Nama Dosen                : " + getDosen().getNama());
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
        revisiTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        revisiButton = new javax.swing.JButton();
        jadwalSeminarTaButton = new javax.swing.JButton();
        revisiLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        nimNamaComboBox = new javax.swing.JComboBox<>();
        layakCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        nidnLabel = new javax.swing.JLabel();
        namaDosenLabel = new javax.swing.JLabel();
        mahasiswaLabel = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        revisiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID - Revisi", "Tanggal Revisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(revisiTable);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOSEN");

        revisiButton.setText("TAMBAH");
        revisiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisiButtonActionPerformed(evt);
            }
        });

        jadwalSeminarTaButton.setText("LIHAT JADWAL SEMINAR");
        jadwalSeminarTaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalSeminarTaButtonActionPerformed(evt);
            }
        });

        revisiLabel.setText("LIST REVISI");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        nimNamaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimNamaComboBoxActionPerformed(evt);
            }
        });

        layakCheckBox.setText("Sudah layak maju?");
        layakCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layakCheckBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nidnLabel.setText("NIDN                            : ");

        namaDosenLabel.setText("Nama Dosen                : ");

        mahasiswaLabel.setText("Mahasiswa Bimbingan : ");

        judulLabel.setText("Judul ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 587, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(revisiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(layakCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jadwalSeminarTaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 354, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(namaDosenLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mahasiswaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nimNamaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nidnLabel)
                            .addComponent(judulLabel)
                            .addComponent(revisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(nidnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaDosenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mahasiswaLabel)
                    .addComponent(nimNamaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revisiButton)
                    .addComponent(layakCheckBox)
                    .addComponent(jadwalSeminarTaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(logoutButton))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void revisiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisiButtonActionPerformed
        // TODO add your handling code here:
        setRevisi(new Revisi(getJudul().getIdJudul(), getDosen().getNpp(), JOptionPane.showInputDialog(null, "Masukkan Revisi"), new java.util.Date()));
        getRevisi().insertToDatabase();
        getRevisiFromDatabase(getJudul().getIdJudul());
        JOptionPane.showMessageDialog(null, "Data Tersimpan");
    }//GEN-LAST:event_revisiButtonActionPerformed

    private void layakCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layakCheckBoxActionPerformed
        // TODO add your handling code here:
        if(layakCheckBox.isSelected()){
            Kelayakan kel = new Kelayakan(true, getJudul().getIdJudul());
            kel.insertToDatabase();
            hideRevisi(false);
            if(getJudul().getTipeJudul().equals("Proposal")){
                String nim = getJudul().MahasiswaDalamJudul.getNim(),
                        namaJudul = getJudul().getNamaJudul(),
                        deskripsi = getJudul().getDeskripsi();
                setJudul(new Judul(nim, namaJudul, 
                         deskripsi, "Tugas Akhir"));
                getJudul().insertToDatabase();
            }
            getJudulDb();
        }
        else{
            new Kelayakan().deleteSingleDatabase(getJudul().getIdJudul());
            if(getJudul().getTipeJudul().equals("Tugas Akhir")){
                new Judul().deleteSingleDatabase(getJudul().getIdJudul());
                
            }
            getJudulDb();
            new Kelayakan().deleteSingleDatabase(getJudul().getIdJudul());
            hideRevisi(true);
        }
    }//GEN-LAST:event_layakCheckBoxActionPerformed

    private void nimNamaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimNamaComboBoxActionPerformed
        // TODO add your handling code here:
        getJudulDb();
    }//GEN-LAST:event_nimNamaComboBoxActionPerformed

    private void jadwalSeminarTaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalSeminarTaButtonActionPerformed
        // TODO add your handling code here:
        JadwalSeminar jad = new JadwalSeminar().getSingleIdJudulDatabase(getJudul().getIdJudul());
        JOptionPane.showMessageDialog(null, new SimpleDateFormat("dd-MM-yyyy").format(jad.getJadwal()));
    }//GEN-LAST:event_jadwalSeminarTaButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"data di simpan");
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
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DosenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DosenFrame().setVisible(true);
            }
        });
    }

    public void hideShowAll(boolean bool){
        jadwalSeminarTaButton.setVisible(bool);
        revisiLabel.setVisible(bool);
        hideRevisi(true);
    }
    
    public void hideRevisi(boolean bool){
        revisiButton.setVisible(bool);
    }

    public void getRevisiFromDatabase(String idJudul){
        DefaultTableModel modelTableRevisi = (DefaultTableModel) revisiTable.getModel();
        modelTableRevisi.setRowCount(0);
        Object[] atributRevisi = new Object[2];
        try {
            ArrayList RevisiAll = new Revisi().getAllIdJudulDatabase(idJudul);
            Iterator listRevisi = RevisiAll.iterator();
            while(listRevisi.hasNext()){
                Revisi eachRevisi;
                eachRevisi = (Revisi) listRevisi.next();
                atributRevisi[0] = eachRevisi.getIdRevisi() + " | " + eachRevisi.getIsiRevisi();
                atributRevisi[1] = new SimpleDateFormat("dd-MM-yyyy").format(eachRevisi.getTanggalRevisi());
        
                modelTableRevisi.addRow(atributRevisi);
            }
            revisiTable.setModel(modelTableRevisi);
        } catch (Exception ex) {
            Logger.getLogger(DosenFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getAllMahasiswaBimbingan(){
        ArrayList<Mahasiswa> allMahasiswa = new Mahasiswa().getAllDatabase("");
        Iterator listMahasiswa = allMahasiswa.iterator();
        while(listMahasiswa.hasNext()){
            Mahasiswa maha = (Mahasiswa) listMahasiswa.next();
            if(maha.DosenPembimbingMahasiswa.getNpp().equals(getDosen().getNpp())){
                nimNamaComboBox.addItem(maha.getNim() + " | " + maha.getNama());
            }
        }
    }
    
    public String getSelectedCombo(){
        String pilih = nimNamaComboBox.getSelectedItem().toString();
        StringTokenizer token = new StringTokenizer(pilih," | ");
        return token.nextToken();
    }
    
    public void getJudulDb(){
        setJudul(new Judul());
        getJudul().setIdJudul("");
        getJudul().setNamaJudul("");
        getJudul().setDeskripsi("");
        getJudul().setTipeJudul("");
        
        setKelayakan(new Kelayakan());
        ArrayList<Judul> allJudulTugasAkhir = new Judul().getAllTipeDatabase("Tugas Akhir");
        Iterator<Judul> listJudulTugasAkhir = allJudulTugasAkhir.iterator();
        while(listJudulTugasAkhir.hasNext()){
            Judul tempJudul = listJudulTugasAkhir.next();
            if(tempJudul.MahasiswaDalamJudul.getNim().equals(getSelectedCombo())){
                setJudul(tempJudul);
            }
        }
        if(getJudul().getNamaJudul().equals("")){
            ArrayList<Judul> allJudulProposal = new Judul().getAllTipeDatabase("Proposal");
            Iterator<Judul> listJudulProposal = allJudulProposal.iterator();
            while(listJudulProposal.hasNext()){
                Judul tempJudul = listJudulProposal.next();
                if(tempJudul.MahasiswaDalamJudul.getNim().equals(getSelectedCombo())){
                    setJudul(tempJudul);
                }
            }
        }
        if(getJudul().getNamaJudul().equals("")){
            JOptionPane.showMessageDialog(null, "Mahasiswa belum mengajukan judul");
            judulLabel.setVisible(false);
        }else
        {
            judulLabel.setVisible(true);
            judulLabel.setText("Judul " + getJudul().getTipeJudul() + " : " + getJudul().getNamaJudul());
            getRevisiFromDatabase(getJudul().getIdJudul());
            setKelayakan(new Kelayakan().getSingleFromJudulDatabase(getJudul().getIdJudul()));
            boolean bool = false;
            if(getKelayakan().getStatusLayak() != null)
                bool = getKelayakan().getStatusLayak();
            layakCheckBox.setSelected(bool);
            hideRevisi(!bool);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jadwalSeminarTaButton;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JCheckBox layakCheckBox;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel mahasiswaLabel;
    private javax.swing.JLabel namaDosenLabel;
    private javax.swing.JLabel nidnLabel;
    private javax.swing.JComboBox<String> nimNamaComboBox;
    private javax.swing.JButton revisiButton;
    private javax.swing.JLabel revisiLabel;
    private javax.swing.JTable revisiTable;
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
     * @return the dosen
     */
    public Dosen getDosen() {
        return dosen;
    }

    /**
     * @param dosen the dosen to set
     */
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
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
     * @return the revisi
     */
    public Revisi getRevisi() {
        return revisi;
    }

    /**
     * @param revisi the revisi to set
     */
    public void setRevisi(Revisi revisi) {
        this.revisi = revisi;
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
