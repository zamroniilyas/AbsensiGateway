/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity.service;

import absensi.database.entity.Admin;
import absensi.database.entity.Wali;
import absensi.database.utility.DatabaseUtilities;
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
public class WaliService {
    private DefaultTableModel model;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet rs;
                
    public boolean insertWali(Wali wali){
        boolean cek = false;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "insert into WALI (id_wali, id_admin, nama_wali, alamat_wali, no_tlpn_wali) "
                            + "values (?, ?, ?, ?, ?)"
            );
            
            preparedStatement.setString(1, wali.getIdWali());
            preparedStatement.setString(2, wali.getAdmin().getIdAdmin());
            preparedStatement.setString(3, wali.getNamaWali());
            preparedStatement.setString(4, wali.getAlamatWali());
            preparedStatement.setString(5, wali.getNopeWali());
            
            int commit = preparedStatement.executeUpdate();
            
            if(commit==1){
                cek = true;
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, insert wali gagal",
                        "Error Message(Wali Service)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, insert wali gagal, karena : "+ex,
                        "Error Message(Wali Service)",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return cek;
    }
    
    public void updateWali(Wali wali){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "update WALI set id_admin = ?, nama_wali = ?, "
                            + "alamat_wali = ?, no_tlpn_wali = ? where id_wali = ?"  
            );
                        
            preparedStatement.setString(1, wali.getAdmin().getIdAdmin());
            preparedStatement.setString(2, wali.getNamaWali());
            preparedStatement.setString(3, wali.getNamaWali());
            preparedStatement.setString(4, wali.getNopeWali());
            preparedStatement.setString(5, wali.getIdWali());
            
            int commit = preparedStatement.executeUpdate();
            
            if(commit==1){
            
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, update wali gagal",
                        "Error Message(Wali Service)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, update wali gagal, karena : "+ex,
                        "Error Message(Wali Service)",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void deleteWali(String id_wali){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "delete from WALI where id_wali = ?"
            );
            
            preparedStatement.setString(1, id_wali);
                       
            int commit = preparedStatement.executeUpdate();
            
            if(commit==1){
                JOptionPane.showMessageDialog(null, "Delete wali berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, delete wali gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, delete wali gagal, karena : "+ex,
                        "Error Message(Wali Service)",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void initializeTableModel(){
        model = new DefaultTableModel();
        model.addColumn("ID Wali");
        model.addColumn("Nama wali");
        model.addColumn("Alamat Wali");
        model.addColumn("No Telpon Wali");
        model.addColumn("ID Admin / Nama Admin");
    }
    
    public DefaultTableModel getAllWali(Wali wali){
        initializeTableModel();
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            rs = statement.executeQuery(
                    "select WALI.* ADMIN.nama_admin where WALI.id_admin = ADMIN.id_admin"
            );
            
            while(rs.next()){
                model.addRow(new Object[]{                
                });
            }
        } catch (SQLException ex) {
            
        }                        
        return model;
    }
    
    public static void main(String[] args) {
        WaliService waliService = new WaliService();
        Admin admin = new Admin();
        admin.setIdAdmin("0912");
        
        Wali wali = new Wali();
        wali.setIdWali("1235");
        wali.setAlamatWali("Balung Edit");
        wali.setNamaWali("Wali A");
        wali.setNopeWali("08651263677");        
        wali.setAdmin(admin);
        
//        waliService.insertWali(wali);
//        waliService.updateWali(wali);
//        waliService.deleteWali("1235");
    }
}