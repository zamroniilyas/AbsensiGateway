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
public class Inbox {    
    private String idInbox;
    private Admin admin;
    private Wali wali;
    private String nopeInbox;
    private String pesanInbox;
    private Date tglInbox;
    private String waktuInbox;

    public String getIdInbox() {
        return idInbox;
    }

    public void setIdInbox(String idInbox) {
        this.idInbox = idInbox;
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

//    public String getNopeInbox() {
//        return nopeInbox;
//    }
//
//    public void setNopeInbox(String nopeInbox) {
//        this.nopeInbox = nopeInbox;
//    }

    public String getPesanInbox() {
        return pesanInbox;
    }

    public void setPesanInbox(String pesanInbox) {
        this.pesanInbox = pesanInbox;
    }

    public Date getTglInbox() {
        return tglInbox;
    }

    public void setTglInbox(Date tglInbox) {
        this.tglInbox = tglInbox;
    }

    public String getWaktuInbox() {
        return waktuInbox;
    }

    public void setWaktuInbox(String waktuInbox) {
        this.waktuInbox = waktuInbox;
    }

    public String getNopeInbox() {
        return nopeInbox;
    }

    public void setNopeInbox(String nopeInbox) {
        this.nopeInbox = nopeInbox;
    }   
}
