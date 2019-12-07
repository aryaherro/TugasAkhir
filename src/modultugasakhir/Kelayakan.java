/***********************************************************************
 * Module:  Kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Kelayakan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 6ceddc8d-e6ee-411c-a051-d80033ebf740 */
public class Kelayakan {
   /** @pdOid 28198805-7718-491f-8f1a-7458f959ce88 */
   private String idLayak;
   /** @pdOid e9f50220-3f43-4a0b-a169-c09aa8b2b910 */
   private java.lang.Boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=Judul assc=association12 mult=1..1 side=A */
   public Judul JudulDalamKelayakan;
   
   /** @pdOid cf0ff2d4-4c29-404c-87a0-1ca2d6719f37 */
   public Kelayakan() {
      // TODO: implement
   }
   
   /** @pdOid 53443faf-0f30-40e5-8635-b0f723418a60 */
   public String getIdLayak() {
      return idLayak;
   }
   
   /** @param newIdLayak
    * @pdOid 3d1d2f77-cf43-43a5-a44a-bf97bd63034c */
   public void setIdLayak(String newIdLayak) {
      idLayak = newIdLayak;
   }
   
   /** @pdOid df49b37a-4c61-4ded-a8bd-bef7b3cf9663 */
   public java.lang.Boolean getStatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid 37c9ef11-a6e6-4eab-b39b-830f059796cb */
   public void setStatusLayak(java.lang.Boolean newStatusLayak) {
      statusLayak = newStatusLayak;
   }

}