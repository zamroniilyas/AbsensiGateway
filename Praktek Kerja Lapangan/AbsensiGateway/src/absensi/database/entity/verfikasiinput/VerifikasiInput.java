/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.entity.verfikasiinput;


import absensi.database.entity.Admin;
import absensi.database.entity.Siswa;
import absensi.database.entity.Wali;
import javax.swing.JOptionPane;

/**
 *
 * @author Chromatics
 */
public class VerifikasiInput {

    public VerifikasiInput() {
    }
    
    public boolean isVerifikasiAdmin(Admin admin){
        boolean verifikasi = false;
        
        if (admin.getIdAdmin().isEmpty()) {
            JOptionPane.showMessageDialog(null,"ID Admin tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(admin.getNamaAdmin().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(admin.getTempatLahirAdmin().isEmpty()){
            JOptionPane.showMessageDialog(null,"Tempat lahir tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(admin.getTglLahirAdmin()==null){
            JOptionPane.showMessageDialog(null,"Tanggal lahir tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(admin.getJkAdmin().equals("-Jenis Kelamin-")){
            JOptionPane.showMessageDialog(null,"Jenis Kelamin tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(admin.getNopeAdmin().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nomor Handphone tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(admin.getPasswordAdmin().isEmpty()){
            JOptionPane.showMessageDialog(null,"Password tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            verifikasi = true;
        }
        return verifikasi;
    }
    
    public boolean verifikasiSiswa(Siswa siswa){
        boolean verifikasi = false;
        
        if (siswa.getNis().isEmpty()) {
            JOptionPane.showMessageDialog(null,"NIS tidak boleh kosong",
                "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getNamaSiswa().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama siswa tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getTempatLahirSiswa().isEmpty()){
            JOptionPane.showMessageDialog(null,"Tempat tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getTglLahirSiswa()==null){
            JOptionPane.showMessageDialog(null,"Tanggal lahir tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getJkSiswa().equals("-Jenis Kelamin-")){
            JOptionPane.showMessageDialog(null,"Jenis kelamin tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getAlamatSiswa().isEmpty()){
            JOptionPane.showMessageDialog(null,"Alamat tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getJurusanSiswa().equals("-Jurusan-")){
            JOptionPane.showMessageDialog(null,"Jurusan tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(siswa.getKelasSiswa().equals("-Kelas-")){
            JOptionPane.showMessageDialog(null,"Kelas tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            verifikasi = true;
        }
        return verifikasi;        
    }
    
    public boolean  verifikasiWali(Wali wali){
        boolean verifikasi = false;
        
        if (wali.getIdWali().isEmpty()) {
            JOptionPane.showMessageDialog(null,"ID Wali tidak boleh kosong",
                "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(wali.getNamaWali().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama wali tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(wali.getAlamatWali().isEmpty()){
            JOptionPane.showMessageDialog(null,"Alamat wali tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else if(wali.getNopeWali().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nomer HP tidak boleh kosong",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            verifikasi = true;
        }
        return verifikasi;
    }
}