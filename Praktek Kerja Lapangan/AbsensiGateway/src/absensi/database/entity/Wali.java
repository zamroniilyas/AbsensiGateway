/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.entity;

/**
 *
 * @author oke
 */
public class Wali {
    private String idWali;
    private Admin admin;
    private String namaWali;
    private String alamatWali;
    private String nopeWali;

    public String getIdWali() {
        return idWali;
    }

    public void setIdWali(String idWali) {
        this.idWali = idWali;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getNamaWali() {
        return namaWali;
    }

    public void setNamaWali(String namaWali) {
        this.namaWali = namaWali;
    }

    public String getAlamatWali() {
        return alamatWali;
    }

    public void setAlamatWali(String alamatWali) {
        this.alamatWali = alamatWali;
    }

    public String getNopeWali() {
        return nopeWali;
    }

    public void setNopeWali(String nopeWali) {
        this.nopeWali = nopeWali;
    }    
}