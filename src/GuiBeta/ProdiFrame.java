/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiBeta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modultugasakhir.*;

/**
 *
 * @author Jempol
 */
public class ProdiFrame extends javax.swing.JFrame {
    private User user = new User();
    private Prodi prodi = new Prodi();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private Judul judul = new Judul();
    private JadwalSeminar jadwalSeminar = new JadwalSeminar();
    private Kelayakan kelayakan = new Kelayakan();

    /**
     * Creates new form isi_pro
     */
    public ProdiFrame() {
        initComponents();
        hideAll(false);
        getAllMahasiswaLayak();
        seminarDateChooser.setDateFormatString("dd-MM-yyyy");
    }

    public ProdiFrame(User user) {
        initComponents();
        setUser(user);
        setProdi(new Prodi().getSingleDatabase(getUser().getUsername()));
        hideAll(false);
        getAllMahasiswaLayak();
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
        seminarJadwalButton = new javax.swing.JButton();
        seminarDateChooser = new com.toedter.calendar.JDateChooser();
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("LIST MAHASISWA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 125, 30));

        seminarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipe Judul", "NIM - Nama", "ID - Judul", "Npp - Dosen Pembimbing", "Tanggal Seminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 680, 123));

        seminarJadwalButton.setText("Masukkan Jadwal");
        seminarJadwalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seminarJadwalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seminarJadwalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));
        getContentPane().add(seminarDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 124, -1));

        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/PRODI.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seminarJadwalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seminarJadwalButtonActionPerformed
        // TODO add your handling code here:
        Date jadwal = seminarDateChooser.getDate();
        setJadwalSeminar(new JadwalSeminar(getProdi().getIdProdi(), getJudul().getIdJudul(), jadwal));
        getJadwalSeminar().insertToDatabase();
        JOptionPane.showMessageDialog(null, "Data Tersimpan");
        hideAll(false);
        getAllMahasiswaLayak();
    }//GEN-LAST:event_seminarJadwalButtonActionPerformed

    private void seminarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seminarTableMouseClicked
        // TODO add your handling code here:
        hideAll(false);
        String idNamaJudul = (String) seminarTable.getValueAt(seminarTable.getSelectedRow(), 2);
        StringTokenizer token = new StringTokenizer(idNamaJudul);
        String idJudul = token.nextToken(" - ");
        setJudul(new Judul().getSingleDatabase(idJudul));
        if (seminarTable.getValueAt(seminarTable.getSelectedRow(), 4) == null)
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
            java.util.logging.Logger.getLogger(ProdiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdiFrame().setVisible(true);
            }
        });
    }
    
    public void getAllMahasiswaLayak(){
        DefaultTableModel modelTableJudul = (DefaultTableModel) seminarTable.getModel();
        modelTableJudul.setRowCount(0);
        Object[] atributKelayakan = new Object[5];
        
        ArrayList<Kelayakan> allKelayakan = new Kelayakan().getAllDatabase("");
        Iterator<Kelayakan> listKelayakan = allKelayakan.iterator();
        while(listKelayakan.hasNext()){
            Kelayakan kelayakan = listKelayakan.next();
            
            atributKelayakan[0] = kelayakan.JudulDalamKelayakan.getTipeJudul();
            atributKelayakan[1] = kelayakan.JudulDalamKelayakan.MahasiswaDalamJudul.getNim() + "-" +
                                  kelayakan.JudulDalamKelayakan.MahasiswaDalamJudul.getNama();
            atributKelayakan[2] = kelayakan.JudulDalamKelayakan.getIdJudul() + " - " +
                                  kelayakan.JudulDalamKelayakan.getNamaJudul();
            atributKelayakan[3] = kelayakan.JudulDalamKelayakan.MahasiswaDalamJudul.DosenPembimbingMahasiswa.getNpp() + "-" +
                                  kelayakan.JudulDalamKelayakan.MahasiswaDalamJudul.DosenPembimbingMahasiswa.getNama();
            Date tgl = new JadwalSeminar().getSingleIdJudulDatabase(kelayakan.JudulDalamKelayakan.getIdJudul()).getJadwal();
            if(tgl != null)
                atributKelayakan[4] = new SimpleDateFormat("dd-MM-yyyy").format(tgl);
            else
                atributKelayakan[4] = null;
            modelTableJudul.addRow(atributKelayakan);
        }
        seminarTable.setModel(modelTableJudul);
    }
    
    public void hideAll(boolean bool){
        seminarDateChooser.setVisible(bool);
        seminarJadwalButton.setVisible(bool);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
