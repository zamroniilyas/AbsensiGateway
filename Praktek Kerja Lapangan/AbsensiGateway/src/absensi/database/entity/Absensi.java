/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity;

import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Absensi {
    private int idAbsensi;
    private Siswa siswa;
    private Admin admin;
    private Date tglAbsensi;
    private String waktuAbsensi;
    private String ketAbsensi;

    public int getIdAbsensi() {
        return idAbsensi;
    }

    public void setIdAbsensi(int idAbsensi) {
        this.idAbsensi = idAbsensi;
    }

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Date getTglAbsensi() {
        return tglAbsensi;
    }

    public void setTglAbsensi(Date tglAbsensi) {
        this.tglAbsensi = tglAbsensi;
    }

    public String getWaktuAbsensi() {
        return waktuAbsensi;
    }

    public void setWaktuAbsensi(String waktuAbsensi) {
        this.waktuAbsensi = waktuAbsensi;
    }

    public String getKetAbsensi() {
        return ketAbsensi;
    }

    public void setKetAbsensi(String ketAbsensi) {
        this.ketAbsensi = ketAbsensi;
    }  
}