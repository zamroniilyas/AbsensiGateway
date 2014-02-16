/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.entity;

import java.util.Date;

/**
 *
 * @author oke
 */
public class Outbox {    
    private String idOutbox;
    private Wali wali;
    private Admin admin;    
//    private String nopeOutbox;
    private String psnOutbox;
    private Date tglOutbox;
    private String waktuOutbox;

    public String getIdOutbox() {
        return idOutbox;
    }

    public void setIdOutbox(String idOutbox) {
        this.idOutbox = idOutbox;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Wali getWali() {
        return wali;
    }

    public void setWali(Wali wali) {
        this.wali = wali;
    }

//    public String getNopeOutbox() {
//        return nopeOutbox;
//    }
//
//    public void setNopeOutbox(String nopeOutbox) {
//        this.nopeOutbox = nopeOutbox;
//    }

    public String getPsnOutbox() {
        return psnOutbox;
    }

    public void setPsnOutbox(String psnOutbox) {
        this.psnOutbox = psnOutbox;
    }

    public Date getTglOutbox() {
        return tglOutbox;
    }

    public void setTglOutbox(Date tglOutbox) {
        this.tglOutbox = tglOutbox;
    }

    public String getWaktuOutbox() {
        return waktuOutbox;
    }

    public void setWaktuOutbox(String waktuOutbox) {
        this.waktuOutbox = waktuOutbox;
    }
    
}