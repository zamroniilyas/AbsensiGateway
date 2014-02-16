/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity.service;

import absensi.database.entity.Absensi;
import absensi.database.utility.DatabaseUtilities;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AbsensiService {
    private DefaultTableModel modelLihatAbsensi;
    private DefaultTableModel modelNgabsen;
    private DefaultTableModel modelDetailAbsen;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet rs;
    
    public void insertAbsensi(Absensi absensi){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "insert into absen (nis, id_admin, tgl_absen, waktu_absen, ket_absen) "
                            + "values (?, ?, ?, ?, ?)"
            );
            
            preparedStatement.setString(1, absensi.getSiswa().getNis());
            preparedStatement.setString(2, absensi.getAdmin().getIdAdmin());
            preparedStatement.setDate(3, new Date(absensi.getTglAbsensi().getTime()));
            preparedStatement.setString(4, absensi.getWaktuAbsensi());
            preparedStatement.setString(5, absensi.getKetAbsensi());
            
            int insert = preparedStatement.executeUpdate();
            
            if(insert == 1){
            
            }else{
                JOptionPane.showMessageDialog(null, "Insert absensi gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Insert absensi gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void updateAbsensi(Absensi absensi){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "update absen set values nis = ?, id_admin = ?, tgl_absen = ?, waktu_absen = ?, ket_absen = ? "
                            + "where id_absen = ?"                      
            );
                        
            preparedStatement.setString(1, absensi.getSiswa().getNis());
            preparedStatement.setString(2, absensi.getAdmin().getIdAdmin());
            preparedStatement.setDate(3, new Date(absensi.getTglAbsensi().getTime()));
            preparedStatement.setString(4, absensi.getWaktuAbsensi());
            preparedStatement.setString(5, absensi.getKetAbsensi());
            preparedStatement.setInt(6, absensi.getIdAbsensi());
            
            int update = preparedStatement.executeUpdate();
            
            if(update == 1){
            
            }else{
                JOptionPane.showMessageDialog(null, "Update absensi gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update absensi gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void deleteAbsensi(String id_absensi){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "delete from absen where id_absensi = ?" 
            );
                        
            preparedStatement.setString(1, id_absensi);
                   
            int delete = preparedStatement.executeUpdate();
            
            if(delete == 1){
                JOptionPane.showMessageDialog(null, "Update absensi berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Update absensi gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update absensi gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public DefaultTableModel initializeTableModelLihatAbsensi(int bulan, int tahun){
        modelLihatAbsensi = new DefaultTableModel();
        
        modelLihatAbsensi.addColumn("No");
        modelLihatAbsensi.addColumn("NIS");
        modelLihatAbsensi.addColumn("Nama");        

        Calendar calender = new GregorianCalendar(tahun, bulan, 1);
        int daysInMonth = calender.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
        for (int i = 1; i <=daysInMonth; i++) {
            modelLihatAbsensi.addColumn(i);
        }
        return modelLihatAbsensi;
    }
    
    public DefaultTableModel initializeTableModelDetailAbsen(){
        modelDetailAbsen = new DefaultTableModel();
        
        modelDetailAbsen.addColumn("ID Absen");
        modelDetailAbsen.addColumn("NIS");
        modelDetailAbsen.addColumn("Nama Siswa");            
        modelDetailAbsen.addColumn("Jurusan");            
        modelDetailAbsen.addColumn("Kelas");            
        modelDetailAbsen.addColumn("Tanggal");            
        modelDetailAbsen.addColumn("Waktu");            
        modelDetailAbsen.addColumn("Keterangan");  
        modelDetailAbsen.addColumn("Admin");  
        return modelDetailAbsen;
    }
    
    public DefaultTableModel initializeTableModelNgabsen(){
        modelNgabsen = new DefaultTableModel();
        
        modelNgabsen.addColumn("Keterangan");
        modelNgabsen.addColumn("NIS");
        modelNgabsen.addColumn("Nama Siswa");            
        return modelNgabsen;
    }
    
    public void listSiswaOnAbsen(String jurusan, String kelas){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "select siswa.nis, siswa.nama_siswa from siswa where jurusan_siswa = ? and kelas_siswa = ?"
            );
            
            preparedStatement.setString(1, jurusan);
            preparedStatement.setString(2, kelas);
            
            rs = preparedStatement.executeQuery();
            int noUrut = 1;
            if(rs.next()){
                rs.previous();
                while(rs.next()){
                    modelLihatAbsensi.addRow(new Object[]{
                        noUrut++, 
                        rs.getString("nis"),
                        rs.getString("nama_siswa")
                    });
                    
                }
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, data siswa berdasarkan jurusan "+jurusan+" tidak ada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update absensi gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public DefaultTableModel lihatDaftarKehadiran(int bulan, int tahun, String jurusan, String kelas){
        initializeTableModelLihatAbsensi(bulan, tahun);
        listSiswaOnAbsen(jurusan, kelas);
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "select absen.*, siswa.jurusan_siswa, siswa.kelas_siswa, day(tgl_absen) \n" +
                        "from absen, siswa where absen.nis = siswa.nis and \n" +
                        "siswa.jurusan_siswa = ? and\n" +
                        "siswa.kelas_siswa = ? and month(tgl_absen) = ? "+ 
                        "and year(tgl_absen) = ? order by tgl_absen asc"
            );

            preparedStatement.setString(1, jurusan);
            preparedStatement.setString(2, kelas);
            preparedStatement.setInt(3, ++bulan);
            preparedStatement.setInt(4, tahun);
            
            rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                rs.previous();
                while (rs.next()) {                
                    for (int i = 0; i < modelLihatAbsensi.getRowCount(); i++) {                
                        if(modelLihatAbsensi.getValueAt(i, 1).toString().equalsIgnoreCase(rs.getString("absen.nis"))){
                            for (int j = 0; j < modelLihatAbsensi.getColumnCount(); j++) {
                                System.out.println(rs.getInt("day(tgl_absen)")+" - "+j);
                                if(rs.getInt("day(tgl_absen)")==j){
                                    int kolom = j+2;
                                    modelLihatAbsensi.setValueAt(rs.getString("absen.ket_absen"), i, kolom);            
                                }                        
                            }                                        
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, daftar kehadiran bulan : "+bulan+", tahun : "+tahun+" kosong");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update absensi gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } 
        return modelLihatAbsensi;
    }
    
    public DefaultTableModel lihatSiswa(String jurusan, String kelas){
        initializeTableModelNgabsen();
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "select siswa.nis, siswa.nama_siswa from siswa where jurusan_siswa = ? and kelas_siswa = ?"
            );
            
            preparedStatement.setString(1, jurusan);
            preparedStatement.setString(2, kelas);
            
            rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                rs.previous();
                while(rs.next()){
                    modelNgabsen.addRow(new Object[]{
                        "", 
                        rs.getString("nis"),
                        rs.getString("nama_siswa")
                    });
                }
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, data siswa berdasarkan jurusan "+jurusan+" tidak ada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update absensi gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return modelNgabsen;
    }
    
    public DefaultTableModel getDetailAbsen(String nis){
        initializeTableModelDetailAbsen();
        
        try {           
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                "SELECT absen.* , siswa.nama_siswa, siswa.jurusan_siswa, siswa.kelas_siswa, admin.nama_admin\n" +
                "FROM absen, siswa, admin\n" +
                "WHERE absen.nis = siswa.nis AND absen.id_admin=admin.id_admin\n" +
                "AND absen.nis = ? \n" +
                "ORDER BY tgl_absen ASC"
            );
            
            preparedStatement.setString(1, nis);
            
            rs = preparedStatement.executeQuery();

            if(rs.next()){
                while (rs.next()) {
                    modelDetailAbsen.addRow(new Object[]{
                        rs.getInt("id_absen"),
                        rs.getString("nis"),
                        rs.getString("nama_siswa"),
                        rs.getString("jurusan_siswa"),
                        rs.getString("kelas_siswa"),
                        rs.getDate("tgl_absen"),
                        rs.getString("waktu_absen"),
                        rs.getString("ket_absen"),
                        rs.getString("id_admin")+" / "+rs.getString("nama_admin"),
                    });
                }
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, data absen kosong","Data Kosong",
                        JOptionPane.ERROR_MESSAGE);
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "getDetailAbsen gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        return modelDetailAbsen;
    }
    
    public boolean verifikasiAbsen(java.util.Date tanggal, String nis){
        boolean cek = false;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "select absen.* from absen where nis = ? and tgl_absen = ?"
            );
            
            preparedStatement.setString(1, nis);
            preparedStatement.setDate(2, new Date(tanggal.getTime()));
            
            rs = preparedStatement.executeQuery();
            if(rs.next()){
                cek=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "verifikasiAbsen gagal, karena : "+ex,
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }        
        return cek;
    }
}
