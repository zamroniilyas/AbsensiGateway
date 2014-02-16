/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.entity;

import java.io.FileInputStream;
import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Chromatics
 */
public class Admin {
    private String idAdmin;
    private String namaAdmin;
    private String jkAdmin;
    private String alamatAdmin;
    private String tempatLahirAdmin;
    private Date tglLahirAdmin;
    private String nopeAdmin;
    private Blob fotoAdmin;
    private FileInputStream uploadFotoAdmin;
    private String passwordAdmin;

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getJkAdmin() {
        return jkAdmin;
    }

    public void setJkAdmin(String jkAdmin) {
        this.jkAdmin = jkAdmin;
    }

    public String getAlamatAdmin() {
        return alamatAdmin;
    }

    public void setAlamatAdmin(String alamatAdmin) {
        this.alamatAdmin = alamatAdmin;
    }

    public String getNopeAdmin() {
        return nopeAdmin;
    }

    public void setNopeAdmin(String nopeAdmin) {
        this.nopeAdmin = nopeAdmin;
    }

    public Blob getFotoAdmin() {
        return fotoAdmin;
    }

    public void setFotoAdmin(Blob fotoAdmin) {
        this.fotoAdmin = fotoAdmin;
    }

    public FileInputStream getUploadFotoAdmin() {
        return uploadFotoAdmin;
    }

    public void setUploadFotoAdmin(FileInputStream uploadFotoAdmin) {
        this.uploadFotoAdmin = uploadFotoAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }    

    public String getTempatLahirAdmin() {
        return tempatLahirAdmin;
    }

    public void setTempatLahirAdmin(String tempatLahirAdmin) {
        this.tempatLahirAdmin = tempatLahirAdmin;
    }

    public Date getTglLahirAdmin() {
        return tglLahirAdmin;
    }

    public void setTglLahirAdmin(Date tglLahirAdmin) {
        this.tglLahirAdmin = tglLahirAdmin;
    }
    
    
}