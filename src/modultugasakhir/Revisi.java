/***********************************************************************
 * Module:  Revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Revisi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 59b4f08f-f7e0-41ba-80a9-b92ddfb10497 */
public class Revisi {
   /** @pdOid 4c9d5cdb-40e7-4019-b692-3db478033817 */
   private String idRevisi;
   /** @pdOid f5000b06-f483-4b1b-acdd-a48be9f46ad4 */
   private String isiRevisi;
   /** @pdOid 6a55977a-c384-41d5-81e3-d37b6c14b220 */
   private Date tanggalRevisi;
   
   /** @pdRoleInfo migr=no name=Judul assc=association5 mult=1..1 side=A */
   public Judul JudulDalamRevisi;
   
   /** @pdOid c43d82aa-321b-4a6f-9d09-7f283a1ce4fa */
   public Revisi() {
      // TODO: implement
   }
   
   /** @pdOid da845d89-d27d-4c6e-bf5a-8b6908581f60 */
   public String getIdRevisi() {
      return idRevisi;
   }
   
   /** @param newIdRevisi
    * @pdOid 8898237f-839c-4960-9069-91c3eb250e84 */
   public void setIdRevisi(String newIdRevisi) {
      idRevisi = newIdRevisi;
   }
   
   /** @pdOid 16cc6c59-b8a8-4217-97e5-5efeb2dd002d */
   public String getIsiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid 9f685e27-fc9c-4da9-b2cb-d327a5056495 */
   public void setIsiRevisi(String newIsiRevisi) {
      isiRevisi = newIsiRevisi;
   }
   
   /** @pdOid 402ef44c-a387-4baf-9113-12401137d57e */
   public Date getTanggalRevisi() {
      return tanggalRevisi;
   }
   
   /** @param newTanggalRevisi
    * @pdOid 20ef835c-0d66-4910-9a5b-2075ee4d0405 */
   public void setTanggalRevisi(Date newTanggalRevisi) {
      tanggalRevisi = newTanggalRevisi;
   }

}