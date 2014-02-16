/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.entity;

import java.util.Date;

/**
 *
 * @author Chromatics
 */
public class Siswa {
    private String nis;//
    private Admin admin;//
    private Wali wali;//
    private String namaSiswa;    //
    private String tempatLahirSiswa;//
    private Date tglLahirSiswa;//
    private String jkSiswa;    //
    private String kelasSiswa;//
    private String alamatSiswa;//
    private String jurusanSiswa;//    

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
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

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public String getJkSiswa() {
        return jkSiswa;
    }

    public void setJkSiswa(String jkSiswa) {
        this.jkSiswa = jkSiswa;
    }

    public String getTempatLahirSiswa() {
        return tempatLahirSiswa;
    }

    public void setTempatLahirSiswa(String tempatLahirSiswa) {
        this.tempatLahirSiswa = tempatLahirSiswa;
    }

    public Date getTglLahirSiswa() {
        return tglLahirSiswa;
    }

    public void setTglLahirSiswa(Date tglLahirSiswa) {
        this.tglLahirSiswa = tglLahirSiswa;
    }

    public String getKelasSiswa() {
        return kelasSiswa;
    }

    public void setKelasSiswa(String kelasSiswa) {
        this.kelasSiswa = kelasSiswa;
    }

    public String getAlamatSiswa() {
        return alamatSiswa;
    }

    public void setAlamatSiswa(String alamatSiswa) {
        this.alamatSiswa = alamatSiswa;
    }    

    public String getJurusanSiswa() {
        return jurusanSiswa;
    }

    public void setJurusanSiswa(String jurusanSiswa) {
        this.jurusanSiswa = jurusanSiswa;
    }                
}