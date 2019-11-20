/***********************************************************************
 * Module:  Dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 65586a11-5c88-472f-b9c0-a86bcfc4de58 */
public class Dosen extends Manusia {
   /** @pdOid 9dbd67bd-fee0-42ae-b5e7-d98646de300d */
   private int idDosen;
   /** @pdOid 81c95d7c-80ab-4f90-9a92-4ca7dc7a84f8 */
   private String npp;
   /** @pdOid 5e83841d-fc3b-4a54-94db-38c4303562b9 */
   private String dosenPassword;
   
   /** @pdRoleInfo migr=no name=Revisi assc=dosenMenuliskanRevisi coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<Revisi> revisi;
   /** @pdRoleInfo migr=no name=Kelayakan assc=dosenMenentukanKelayakan coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<Kelayakan> kelayakan;
   /** @pdRoleInfo migr=no name=Prodi assc=dosenBagianProdi coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<Prodi> prodi;
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=dosenMelihatJadwal coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<JadwalSeminar> jadwalSeminar;
   
   /** @pdOid 23d034f8-d545-4f3e-8b7d-07560dfc23b0 */
   public void dosen() {
      // TODO: implement
   }
   
   /** @pdOid 0a0b882f-d978-4bca-9ccc-47cd5e0b81d3 */
   public int getidDosen() {
      return idDosen;
   }
   
   /** @param newIdDosen
    * @pdOid 7fec9339-952f-4d1c-8d17-8cad37fb3093 */
   public void setidDosen(int newIdDosen) {
      idDosen = newIdDosen;
   }
   
   /** @pdOid 538d0d0e-a4e8-4a55-ba3c-fde7574f6fe5 */
   public String getnpp() {
      return npp;
   }
   
   /** @param newNpp
    * @pdOid 88186162-1086-45ab-8d22-76dc39d3dd3d */
   public void setnpp(String newNpp) {
      npp = newNpp;
   }
   
   /** @pdOid 8973d4fb-d395-478e-98d4-dde8a3951f4b */
   public String getdosenPassword() {
      return dosenPassword;
   }
   
   /** @param newDosenPassword
    * @pdOid 9fcc4a38-b787-4001-a89f-b6289c5810a1 */
   public void setdosenPassword(String newDosenPassword) {
      dosenPassword = newDosenPassword;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Revisi> getRevisi() {
      if (revisi == null)
         revisi = new java.util.ArrayList<Revisi>();
      return revisi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRevisi() {
      if (revisi == null)
         revisi = new java.util.ArrayList<Revisi>();
      return revisi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRevisi */
   public void setRevisi(java.util.Collection<Revisi> newRevisi) {
      removeAllRevisi();
      for (java.util.Iterator iter = newRevisi.iterator(); iter.hasNext();)
         addRevisi((Revisi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRevisi */
   public void addRevisi(Revisi newRevisi) {
      if (newRevisi == null)
         return;
      if (this.revisi == null)
         this.revisi = new java.util.ArrayList<Revisi>();
      if (!this.revisi.contains(newRevisi))
         this.revisi.add(newRevisi);
   }
   
   /** @pdGenerated default remove
     * @param oldRevisi */
   public void removeRevisi(Revisi oldRevisi) {
      if (oldRevisi == null)
         return;
      if (this.revisi != null)
         if (this.revisi.contains(oldRevisi))
            this.revisi.remove(oldRevisi);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRevisi() {
      if (revisi != null)
         revisi.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Kelayakan> getKelayakan() {
      if (kelayakan == null)
         kelayakan = new java.util.ArrayList<Kelayakan>();
      return kelayakan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKelayakan() {
      if (kelayakan == null)
         kelayakan = new java.util.ArrayList<Kelayakan>();
      return kelayakan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKelayakan */
   public void setKelayakan(java.util.Collection<Kelayakan> newKelayakan) {
      removeAllKelayakan();
      for (java.util.Iterator iter = newKelayakan.iterator(); iter.hasNext();)
         addKelayakan((Kelayakan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKelayakan */
   public void addKelayakan(Kelayakan newKelayakan) {
      if (newKelayakan == null)
         return;
      if (this.kelayakan == null)
         this.kelayakan = new java.util.ArrayList<Kelayakan>();
      if (!this.kelayakan.contains(newKelayakan))
         this.kelayakan.add(newKelayakan);
   }
   
   /** @pdGenerated default remove
     * @param oldKelayakan */
   public void removeKelayakan(Kelayakan oldKelayakan) {
      if (oldKelayakan == null)
         return;
      if (this.kelayakan != null)
         if (this.kelayakan.contains(oldKelayakan))
            this.kelayakan.remove(oldKelayakan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKelayakan() {
      if (kelayakan != null)
         kelayakan.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.ArrayList<Prodi>();
      return prodi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (prodi == null)
         prodi = new java.util.ArrayList<Prodi>();
      return prodi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProdi */
   public void setProdi(java.util.Collection<Prodi> newProdi) {
      removeAllProdi();
      for (java.util.Iterator iter = newProdi.iterator(); iter.hasNext();)
         addProdi((Prodi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProdi */
   public void addProdi(Prodi newProdi) {
      if (newProdi == null)
         return;
      if (this.prodi == null)
         this.prodi = new java.util.ArrayList<Prodi>();
      if (!this.prodi.contains(newProdi))
         this.prodi.add(newProdi);
   }
   
   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdi(Prodi oldProdi) {
      if (oldProdi == null)
         return;
      if (this.prodi != null)
         if (this.prodi.contains(oldProdi))
            this.prodi.remove(oldProdi);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProdi() {
      if (prodi != null)
         prodi.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<JadwalSeminar> getJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.ArrayList<JadwalSeminar>();
      return jadwalSeminar;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.ArrayList<JadwalSeminar>();
      return jadwalSeminar.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJadwalSeminar */
   public void setJadwalSeminar(java.util.Collection<JadwalSeminar> newJadwalSeminar) {
      removeAllJadwalSeminar();
      for (java.util.Iterator iter = newJadwalSeminar.iterator(); iter.hasNext();)
         addJadwalSeminar((JadwalSeminar)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJadwalSeminar */
   public void addJadwalSeminar(JadwalSeminar newJadwalSeminar) {
      if (newJadwalSeminar == null)
         return;
      if (this.jadwalSeminar == null)
         this.jadwalSeminar = new java.util.ArrayList<JadwalSeminar>();
      if (!this.jadwalSeminar.contains(newJadwalSeminar))
         this.jadwalSeminar.add(newJadwalSeminar);
   }
   
   /** @pdGenerated default remove
     * @param oldJadwalSeminar */
   public void removeJadwalSeminar(JadwalSeminar oldJadwalSeminar) {
      if (oldJadwalSeminar == null)
         return;
      if (this.jadwalSeminar != null)
         if (this.jadwalSeminar.contains(oldJadwalSeminar))
            this.jadwalSeminar.remove(oldJadwalSeminar);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJadwalSeminar() {
      if (jadwalSeminar != null)
         jadwalSeminar.clear();
   }

}