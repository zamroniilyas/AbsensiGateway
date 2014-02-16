/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity.service;

import absensi.database.entity.Siswa;
import absensi.database.utility.DatabaseUtilities;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SiswaService {
    private PreparedStatement preparedStatement;
    private Statement statement;
    private DefaultTableModel tableModel;
    
    public boolean insertSiswa(Siswa siswa){
        
        preparedStatement = null;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "insert into siswa (nis, id_admin, id_wali, nama_siswa, jk_siswa, "
                            + "tempat_lahir_siswa, tgl_lahir_siswa, kelas_siswa, alamat_siswa, jurusan_siswa) "
                            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            preparedStatement.setString(1, siswa.getNis());
            preparedStatement.setString(2, siswa.getAdmin().getIdAdmin());
            preparedStatement.setString(3, siswa.getWali().getIdWali());
            preparedStatement.setString(4, siswa.getNamaSiswa());
            preparedStatement.setString(5, siswa.getJkSiswa());
            preparedStatement.setString(6, siswa.getTempatLahirSiswa());
            preparedStatement.setDate(7,new Date(siswa.getTglLahirSiswa().getTime()));
            preparedStatement.setString(8, siswa.getKelasSiswa());
            preparedStatement.setString(9, siswa.getAlamatSiswa());
            preparedStatement.setString(10, siswa.getJurusanSiswa());
            
            int insert = preparedStatement.executeUpdate();
            if(insert == 1){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, insert siswa gagal",
                    "Error Message",JOptionPane.INFORMATION_MESSAGE);                
            }
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, insert siswa gagal, karena : "+ex.getMessage(),
                    "Error Message",JOptionPane.INFORMATION_MESSAGE);                
            ex.printStackTrace();
            return false;    
        }
        
    }
    
    public void updateSiswa(Siswa siswa){
        preparedStatement = null;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "update siswa set values id_admin = ?, id_wali = ?, nama_siswa = ?, jk_siswa = ?, "
                            + "tempat_lahir_siswa = ?, tgl_lahir_siswa = ?, kelas_siswa = ?, alamat_siswa = ?"
                            + "where nis = ? ");
            
            preparedStatement.setString(1, siswa.getNis());
            preparedStatement.setString(2, siswa.getAdmin().getIdAdmin());
            preparedStatement.setString(3, siswa.getWali().getIdWali());
            preparedStatement.setString(4, siswa.getNamaSiswa());
            preparedStatement.setString(5, siswa.getJkSiswa());
            preparedStatement.setString(6, siswa.getTempatLahirSiswa());
            preparedStatement.setDate(7,new Date(siswa.getTglLahirSiswa().getTime()));
            preparedStatement.setString(8, siswa.getKelasSiswa());
            preparedStatement.setString(9, siswa.getAlamatSiswa());
            
            int update = preparedStatement.executeUpdate();
            if(update == 1){
                
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, update siswa gagal",
                        "Error Message",JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, update siswa gagal, karena : "+ex,
                    "Error Message",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void deleteSiswa(int nis){
        preparedStatement = null;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "delete from siswa where nis = ?");
            
            preparedStatement.setInt(1, nis);
                        
            int delete = preparedStatement.executeUpdate();
            if(delete == 1){
                JOptionPane.showMessageDialog(null, "Delete siswa berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, delete siswa gagal",
                    "Error Message",JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, delete siswa gagal, karena : "+ex,
                    "Error Message",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public DefaultTableModel initializeTableModel(){
        tableModel = new DefaultTableModel();
        
        tableModel.addColumn("NIS");//1
        tableModel.addColumn("Nama Siswa");//2
        tableModel.addColumn("Alamat");//3
        tableModel.addColumn("Tempat Lahir");//4
        tableModel.addColumn("Tanggal Lahir");//5
            
        tableModel.addColumn("Jenis Kelamin");//6                                
        tableModel.addColumn("Jurusan");//6                                
        tableModel.addColumn("Kelas");//7                        
         
        tableModel.addColumn("ID Wali");//11
        tableModel.addColumn("Nama Wali");//12
        tableModel.addColumn("Alamat Wali");//12
        tableModel.addColumn("No Telpon Wali");//13
        tableModel.addColumn("Admin");//14
        
        return tableModel;
    }
    
    public DefaultTableModel getAllSiswa(){
        initializeTableModel();
        
        statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("select siswa.*, admin.* , wali.* from "
                    + "siswa, admin, wali where siswa.id_admin = admin.id_admin and "
                    + "siswa.id_wali = wali.id_wali");
            
            if(rs.next()){
                rs.previous();
                while (rs.next()) {           
//                     tableModel.addColumn("NIS");//1
//        tableModel.addColumn("Nama Siswa");//2
//        tableModel.addColumn("Alamat");//3
//        tableModel.addColumn("Tempat Lahir");//4
//        tableModel.addColumn("Tanggal Lahir");//5
//            
//        tableModel.addColumn("Jenis Kelamin");//6                                
//        tableModel.addColumn("Jurusan");//6                                
//        tableModel.addColumn("Kelas");//7                        
//         
//        tableModel.addColumn("ID Wali");//11
//        tableModel.addColumn("Nama Wali");//12
//        tableModel.addColumn("Alamat Wali");//12
//        tableModel.addColumn("No Telpon Wali");//13
//        tableModel.addColumn("Admin");//14
                   tableModel.addRow(new Object[]{
                       rs.getString("nis"),
                       rs.getString("nama_siswa"),
                       rs.getString("alamat_siswa"),
                       rs.getString("tempat_lahir_siswa"),
                       rs.getString("tgl_lahir_siswa"),
                       
                       rs.getString("jk_siswa"),
                       rs.getString("jurusan_siswa"),                       
                       rs.getString("kelas_siswa"),
                       
                       rs.getString("id_wali"),
                       rs.getString("nama_wali"),                                              
                       rs.getString("alamat_wali"),                        
                       rs.getString("no_tlpn_wali"),
                       
                       rs.getString("id_admin")+" / "+rs.getString("nama_admin")
                   });
                }
            }else{
            
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, getAllSiswa() gagal, karena : "+ex,
                    "Siswa Service Report",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }                                                
        return tableModel;
    }
    
    public DefaultTableModel cariSIswa(String cari, String berdasarkan){
        initializeTableModel();        
                        
        try {                      
         String query = "select siswa.* , admin.nama_admin, wali.* from siswa, admin, wali ";
            
            if (berdasarkan.equals("NIS")) {
                query+="where NIS like ?";
            }else if(berdasarkan.equals("Nama")){
                query+="where NAMA_SISWA like ?";
            }else if(berdasarkan.equals("Jenis Kelamin")){
//                .equals("Alamat")){
                query+="where ALAMAT_SISWA like ?";
            }else if(berdasarkan.equals("Nama Wali")){
                query+="where NAMA_wali like ?";
            }else if(berdasarkan.equals("Status")){
                query+="where STATUS like ?";
            }
            
            query+=" and siswa.id_admin = admin.id_admin and siswa.id_wali = wali.id_wali";
            
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(query);
            preparedStatement.setString(1, "%"+cari+"%");
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                rs.previous();
                while(rs.next()){
                    tableModel.addRow(new Object[]{
                        rs.getString("nis"),
                        rs.getString("nama_siswa"),
                        rs.getString("alamat_siswa"),
                        rs.getString("tempat_lahir_siswa"),
                        rs.getString("tgl_lahir_siswa"),
                       
                        rs.getString("jk_siswa"),
                        rs.getString("kelas_siswa"),
                       
                        rs.getString("id_wali"),
                        rs.getString("nama_wali"),                       
                        rs.getString("alamat_wali"),                       
                        rs.getString("no_tlpn_wali"),                       
                        rs.getString("id_admin"+" | "+"nama_admin"),                          
                    });                    
                }            
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, data siswa dengan keyword : "+cari+" tidak ada");
            }   
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, cariSiswa() gagal, karena : "+ex,
                    "Siswa Service Report",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }                
        return tableModel;    
    }
}
     