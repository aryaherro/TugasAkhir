/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiBeta;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import modultugasakhir.*;

/**
 *
 * @author Toshiba
 */
@SuppressWarnings("serial")
public class AdminFrame extends javax.swing.JFrame {
    private User user = new User();
    private User Admin = new User();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private Dosen dosen = new Dosen();
    private Prodi prodi = new Prodi();
   

    /**
     * Creates new form isiFrom
     */
    @SuppressWarnings("unchecked")
    public AdminFrame() {
        initComponents();
        hideShowId(false);
        hideShowAll(false);
        tglLahir.setDateFormatString("dd-MM-yyyy");
        setComboxAll();
    }
    
    public AdminFrame(User Admin) {
        setAdmin(Admin);
        initComponents();
        hideShowId(false);
        hideShowAll(false);
        tglLahir.setDateFormatString("dd-MM-yyyy");
        setComboxAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePickerSettings1 = new com.github.lgooddatepicker.components.DatePickerSettings();
        extraDateStrings1 = new com.github.lgooddatepicker.zinternaltools.ExtraDateStrings();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cariButton = new javax.swing.JButton();
        opsiComboBox = new javax.swing.JComboBox<>();
        idTextField = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
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
        updateButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        namaTextField = new javax.swing.JTextField();
        kataSandiTextField = new javax.swing.JTextField();
        nikTextField = new javax.swing.JTextField();
        LRadioButton = new javax.swing.JRadioButton();
        PRadioButton = new javax.swing.JRadioButton();
        alamatTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        agamaComboBox = new javax.swing.JComboBox<>();
        tglLahir = new com.toedter.calendar.JDateChooser();
        prodiComboBox = new javax.swing.JComboBox<>();
        dsnComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        datePickerSettings1.setTranslationArrayStandaloneLongMonthNames(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "December"});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cariButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        opsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tambah Baru-", "Prodi", "Dosen", "Mahasiswa" }));
        opsiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsiComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(opsiComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 230, -1));

        idTextField.setText("id");
        jPanel1.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 30));

        id.setText("ID Prodi");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        namaLabel.setText("Nama");
        jPanel1.add(namaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        kataSandiLabel.setText("Kata Sandi");
        jPanel1.add(kataSandiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        nikLabel.setText("NIK");
        jPanel1.add(nikLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        tglLahirLabel.setText("Tanggal Lahir");
        jPanel1.add(tglLahirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jKLabel.setText("Jenis Kelamin");
        jPanel1.add(jKLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        alamatLabel.setText("Alamat");
        jPanel1.add(alamatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        emailLabel.setText("E-Mail");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        agamaLabel.setText("Agama");
        jPanel1.add(agamaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        prodiLabel1.setText("Prodi");
        jPanel1.add(prodiLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, -1));

        dsnPembLabel.setText("Dosen Pembimbing");
        jPanel1.add(dsnPembLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, -1, -1));

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        jPanel1.add(simpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, -1, -1));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        namaTextField.setText("nama");
        jPanel1.add(namaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, 30));

        kataSandiTextField.setText("kata sandi");
        jPanel1.add(kataSandiTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 30));

        nikTextField.setText("nik");
        jPanel1.add(nikTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 30));

        buttonGroup1.add(LRadioButton);
        LRadioButton.setText("L");
        jPanel1.add(LRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        buttonGroup1.add(PRadioButton);
        PRadioButton.setText("P");
        jPanel1.add(PRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        alamatTextField.setText("alamat");
        jPanel1.add(alamatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 180, 50));

        emailTextField.setText("email");
        jPanel1.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 180, 30));

        agamaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISLAM", "KRISTEN", "KATOLIK", "HINDU", "BUDHA", "KONGHUCU" }));
        jPanel1.add(agamaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 130, 20));

        tglLahir.setToolTipText("dd-MM-YYYY");
        jPanel1.add(tglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 150, 30));

        prodiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Prodi-" }));
        jPanel1.add(prodiComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 110, -1));

        dsnComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Dosen Pembimbing-" }));
        dsnComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsnComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(dsnComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Image_pckg/isiForm.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 780));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        switch (opsiComboBox.getSelectedItem().toString()){
            case "Mahasiswa" :
            {
                getUser().setUsername(idTextField.getText());
                getUser().setPassword(kataSandiTextField.getText());
                getUser().setTypeUser(opsiComboBox.getSelectedItem().toString());
                getUser().insertToDatabase();
                
                getMahasiswa().setNim(idTextField.getText());
                
                getMahasiswa().DosenPembimbingMahasiswa = null;
                getMahasiswa().ProdiDalamMahasiswa = null;
                if(dsnComboBox.getSelectedIndex() != 0)
                {
                    Dosen dos = new Dosen();
                    dos.getSingleNamaDatabase(dsnComboBox.getSelectedItem().toString());
                    getMahasiswa().DosenPembimbingMahasiswa = dos;
                }
                
                if(prodiComboBox.getSelectedIndex() != 0)
                {
                    Prodi pro = new Prodi();
                    pro.getSingleNamaDatabase(prodiComboBox.getSelectedItem().toString());
                    getMahasiswa().ProdiDalamMahasiswa = pro;
                }
                
                getMahasiswa().setNama(namaTextField.getText());
                getMahasiswa().setNik(nikTextField.getText());
                getMahasiswa().setTanggalLahir(tglLahir.getDate());
                getMahasiswa().setJenisKelamin((LRadioButton.isSelected())? 'L' : 'P');
                getMahasiswa().setAlamat(alamatTextField.getText());
                getMahasiswa().setEmail(emailTextField.getText());
                getMahasiswa().setAgama(agamaComboBox.getSelectedItem().toString());
                
                getMahasiswa().updateDatabase();
                break;
            }
            
            case "Dosen" :
            {
                getUser().setUsername(idTextField.getText());
                getUser().setPassword(kataSandiTextField.getText());
                getUser().setTypeUser(opsiComboBox.getSelectedItem().toString());
                getUser().insertToDatabase();
                
                getDosen().setNpp(idTextField.getText());
                getDosen().setNama(namaTextField.getText());
                getDosen().setNik(nikTextField.getText());
                getDosen().setTanggalLahir(tglLahir.getDate());
                getDosen().setJenisKelamin((LRadioButton.isSelected())? 'L' : 'P');
                getDosen().setAlamat(alamatTextField.getText());
                getDosen().setEmail(emailTextField.getText());
                getDosen().setAgama(agamaComboBox.getSelectedItem().toString());
                
                getDosen().updateDatabase();
                break;
            }
            
            case "Prodi" :
            {
                getUser().setUsername(idTextField.getText());
                getUser().setPassword(kataSandiTextField.getText());
                getUser().setTypeUser(opsiComboBox.getSelectedItem().toString());
                getUser().insertToDatabase();
                
                getProdi().setIdProdi(idTextField.getText());
                getProdi().setNamaProdi(namaTextField.getText());
                
                getProdi().updateDatabase();
                break;
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void opsiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsiComboBoxActionPerformed
        // TODO add your handling code here:
        hideShowAll(false);
        setComboxAll();
        switch (opsiComboBox.getSelectedItem().toString()){
            case "-Tambah Baru-" :
            {
                hideShowId(false);
                break;
            }
            default :
            {
                hideShowId(true);
                id.setText("ID " + opsiComboBox.getSelectedItem());
                namaLabel.setText("Nama " + opsiComboBox.getSelectedItem());
            }
            setDefaultTeksField();
        }
    }//GEN-LAST:event_opsiComboBoxActionPerformed

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        // TODO add your handling code here:
        setComboxAll();
        setUser(new User());
        setMahasiswa(new Mahasiswa());
        setDosen(new Dosen());
        setProdi(new Prodi());
        setDefaultTeksField();
        switch (opsiComboBox.getSelectedItem().toString()){
            case "Mahasiswa" :
            {
                getUser().getSingleDatabase(idTextField.getText());
                getMahasiswa().getSingleDatabase(idTextField.getText());
                if ((getMahasiswa().getNama() == null) || (getMahasiswa().getNama() == "") || (getMahasiswa().getNama() == "id")){
                    hideShowAll(true);
                    updateButton.setVisible(false);
                }
                else
                {
                    hideShowAll(true);
                    simpanButton.setVisible(false);
                    kataSandiTextField.setText(getUser().getPassword());
                    namaTextField.setText(getMahasiswa().getNama());
                    nikTextField.setText(getMahasiswa().getNik());
                    tglLahir.setDate(getMahasiswa().getTanggalLahir());
                    if (getMahasiswa().getJenisKelamin() == 'L') {
                        LRadioButton.setSelected(true);
                    }
                    else
                    {
                        PRadioButton.setSelected(true);
                    }
                    alamatTextField.setText(getMahasiswa().getAlamat());
                    emailTextField.setText(getMahasiswa().getEmail());
                    agamaComboBox.setSelectedItem(getMahasiswa().getAgama());
                    if(getMahasiswa().DosenPembimbingMahasiswa != null){
                        Dosen DPM = getMahasiswa().DosenPembimbingMahasiswa;
                        dsnComboBox.setSelectedItem(DPM.getNama());
                    }
                    if(getMahasiswa().ProdiDalamMahasiswa != null){
                        Prodi PDM = getMahasiswa().ProdiDalamMahasiswa;
                        prodiComboBox.setSelectedItem(PDM.getNamaProdi());
                    }
                }
                break;
            }
            
            case "Dosen" :
            {
                getUser().getSingleDatabase(idTextField.getText());
                getDosen().getSingleDatabase(idTextField.getText());
                if ((getDosen().getNama() == null) || (getDosen().getNama() == "") || (getDosen().getNama() == "id")){
                    hideShowAll(true);
                    updateButton.setVisible(false);
                    dsnPembLabel.setVisible(false);
                    dsnComboBox.setVisible(false);
                }
                else
                {
                    hideShowAll(true);
                    dsnPembLabel.setVisible(false);
                    dsnComboBox.setVisible(false);
                    simpanButton.setVisible(false);
                    kataSandiTextField.setText(getUser().getPassword());
                    namaTextField.setText(getDosen().getNama());
                    nikTextField.setText(getDosen().getNik());
                    tglLahir.setDate(getDosen().getTanggalLahir());
                    if (getDosen().getJenisKelamin() == 'L') {
                        LRadioButton.setSelected(true);
                        }
                    else
                    {
                        PRadioButton.setSelected(true);
                    }
                    alamatTextField.setText(getDosen().getAlamat());
                    emailTextField.setText(getDosen().getEmail());
                    agamaComboBox.setSelectedItem(getDosen().getAgama());                    
                }
                break;
            }
            
            case "Prodi" :
            {
                getUser().getSingleDatabase(idTextField.getText());
                getProdi().getSingleDatabase(idTextField.getText());
                if ((getProdi().getNamaProdi() == null) || (getProdi().getNamaProdi() == "") || (getProdi().getNamaProdi() == "id")){
                    hideShowAll(false);
                    kataSandiLabel.setVisible(true);
                    kataSandiTextField.setVisible(true);
                    namaLabel.setVisible(true);
                    namaTextField.setVisible(true);
                    simpanButton.setVisible(true);
                }
                else
                {
                    hideShowAll(false);
                    kataSandiLabel.setVisible(true);
                    kataSandiTextField.setVisible(true);
                    namaLabel.setVisible(true);
                    namaTextField.setVisible(true);
                    kataSandiTextField.setText(getUser().getPassword());
                    namaTextField.setText(getProdi().getNamaProdi());
                    updateButton.setVisible(true);
                }
                break;
            }
        }
    }//GEN-LAST:event_cariButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        switch (opsiComboBox.getSelectedItem().toString()){
            case "Mahasiswa" :
            {
                getUser().setUsername(idTextField.getText());
                getUser().setPassword(kataSandiTextField.getText());
                getUser().setTypeUser(opsiComboBox.getSelectedItem().toString());
                getUser().insertToDatabase();
                
                getMahasiswa().setNim(idTextField.getText());
                
                if(dsnComboBox.getSelectedIndex() != 0)
                {
                    Dosen dos = new Dosen();
                    dos.getSingleNamaDatabase(dsnComboBox.getSelectedItem().toString());
                    getMahasiswa().DosenPembimbingMahasiswa = dos;
                }
                
                if(prodiComboBox.getSelectedIndex() != 0)
                {
                    Prodi pro = new Prodi();
                    pro.getSingleNamaDatabase(prodiComboBox.getSelectedItem().toString());
                    getMahasiswa().ProdiDalamMahasiswa = pro;
                }
                
                getMahasiswa().setNama(namaTextField.getText());
                getMahasiswa().setNik(nikTextField.getText());
                getMahasiswa().setTanggalLahir(tglLahir.getDate());
                getMahasiswa().setJenisKelamin((LRadioButton.isSelected())? 'L' : 'P');
                getMahasiswa().setAlamat(alamatTextField.getText());
                getMahasiswa().setEmail(emailTextField.getText());
                getMahasiswa().setAgama(agamaComboBox.getSelectedItem().toString());
                
                getMahasiswa().insertToDatabase();
                break;
            }
            
            case "Dosen" :
            {
                getUser().setUsername(idTextField.getText());
                getUser().setPassword(kataSandiTextField.getText());
                getUser().setTypeUser(opsiComboBox.getSelectedItem().toString());
                getUser().insertToDatabase();
                
                getDosen().setNpp(idTextField.getText());
                getDosen().setNama(namaTextField.getText());
                getDosen().setNik(nikTextField.getText());
                getDosen().setTanggalLahir(tglLahir.getDate());
                getDosen().setJenisKelamin((LRadioButton.isSelected())? 'L' : 'P');
                getDosen().setAlamat(alamatTextField.getText());
                getDosen().setEmail(emailTextField.getText());
                getDosen().setAgama(agamaComboBox.getSelectedItem().toString());
                
                getDosen().insertToDatabase();
                break;
            }
            
            case "Prodi" :
            {
                getUser().setUsername(idTextField.getText());
                getUser().setPassword(kataSandiTextField.getText());
                getUser().setTypeUser(opsiComboBox.getSelectedItem().toString());
                getUser().insertToDatabase();
                
                getProdi().setIdProdi(idTextField.getText());
                getProdi().setNamaProdi(namaTextField.getText());
                
                getProdi().insertToDatabase();
                break;
            }
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void dsnComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsnComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsnComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminFrame().setVisible(true);
            }
        });
    }
    
    public void hideShowAll(boolean bool){
        kataSandiLabel.setVisible(bool);
        kataSandiTextField.setVisible(bool);
        namaLabel.setVisible(bool);
        namaTextField.setVisible(bool);
        nikLabel.setVisible(bool);
        nikTextField.setVisible(bool);
        tglLahirLabel.setVisible(bool);
        tglLahir.setVisible(bool);
        jKLabel.setVisible(bool);
        LRadioButton.setVisible(bool);
        PRadioButton.setVisible(bool);
        alamatLabel.setVisible(bool);
        alamatTextField.setVisible(bool);
        emailLabel.setVisible(bool);
        emailTextField.setVisible(bool);
        agamaLabel.setVisible(bool);
        agamaComboBox.setVisible(bool);
        prodiLabel1.setVisible(bool);
        prodiComboBox.setVisible(bool);
        dsnPembLabel.setVisible(bool);
        dsnComboBox.setVisible(bool);
        updateButton.setVisible(bool);
        simpanButton.setVisible(bool);
    }
    
    public void hideShowId(boolean bool){
        id.setVisible(bool);
        idTextField.setVisible(bool);
        cariButton.setVisible(bool);
    }
    
    public void setDosenCombox(ArrayList<Dosen> list){
        Iterator<Dosen> tiapList = list.iterator();
        
        while(tiapList.hasNext()){
            Dosen d = tiapList.next();
            dsnComboBox.addItem(d.getNama());
        }  
    }
    
    public void setProdiCombox(ArrayList<Prodi> list){
        Iterator<Prodi> tiapList = list.iterator();
        
        while(tiapList.hasNext()){
            Prodi p = tiapList.next();
            prodiComboBox.addItem(p.getNamaProdi());
        }  
    }
    
    public void setComboxAll(){
        prodiComboBox.removeAllItems();
        prodiComboBox.addItem("-Jurusan-");
        dsnComboBox.removeAllItems();
        dsnComboBox.addItem("-Dosen Pembimbing-");
        setProdiCombox(getProdi().getAllDatabase(""));
        setDosenCombox(getDosen().getAllDatabase(""));
    }
    
    public void setDefaultTeksField(){
        kataSandiTextField.setText("Password " + opsiComboBox.getSelectedItem().toString());
        namaTextField.setText("Nama " + opsiComboBox.getSelectedItem().toString());
        nikTextField.setText("Nik " + opsiComboBox.getSelectedItem().toString());
        alamatTextField.setText("Alamat " + opsiComboBox.getSelectedItem().toString());
        emailTextField.setText("Email " + opsiComboBox.getSelectedItem().toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LRadioButton;
    private javax.swing.JRadioButton PRadioButton;
    private javax.swing.JComboBox<String> agamaComboBox;
    private javax.swing.JLabel agamaLabel;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JTextField alamatTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cariButton;
    private com.github.lgooddatepicker.components.DatePickerSettings datePickerSettings1;
    private javax.swing.JComboBox<String> dsnComboBox;
    private javax.swing.JLabel dsnPembLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private com.github.lgooddatepicker.zinternaltools.ExtraDateStrings extraDateStrings1;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jKLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kataSandiLabel;
    private javax.swing.JTextField kataSandiTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel nikLabel;
    private javax.swing.JTextField nikTextField;
    private javax.swing.JComboBox<String> opsiComboBox;
    private javax.swing.JComboBox<String> prodiComboBox;
    private javax.swing.JLabel prodiLabel1;
    private javax.swing.JButton simpanButton;
    private com.toedter.calendar.JDateChooser tglLahir;
    private javax.swing.JLabel tglLahirLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the userFrame
     */
    public User getUser() {
        return user;
    }

    /**
     * @param userFrame the userFrame to set
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

    public User getAdmin() {
        return Admin;
    }

    public void setAdmin(User Admin) {
        this.Admin = Admin;
    }
}
