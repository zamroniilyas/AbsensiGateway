/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity.service;

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
                    "insert into wali (id_wali, id_admin, nama_wali, alamat_wali, no_tlpn_wali) "
                            + "values (?, ?, ?, ?, ?)"
            );
            
            preparedStatement.setString(1, wali.getIdWali());
            preparedStatement.setString(2, wali.getAdmin().getIdAdmin());
            preparedStatement.setString(3, wali.getNamaWali());
            preparedStatement.setString(4, wali.getAlamatWali());
            preparedStatement.setString(5, wali.getNopeWali());
            
            int insert = preparedStatement.executeUpdate();
            
            if(insert==1){
                cek = true;
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, insert wali gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, insert wali gagal, karena : "+ex,
                        "Error Message",JOptionPane.ERROR_MESSAGE);
        }
        return cek;
    }
    
    public void updateWali(Wali wali){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "update wali set values id_admin = ?, nama_wali = ?, alamat_wali = ?, no_tlpn_wali = ? "
                            + "where id_wali = ?"  
            );
                        
            preparedStatement.setString(12, wali.getAdmin().getIdAdmin());
            preparedStatement.setString(2, wali.getNamaWali());
            preparedStatement.setString(3, wali.getNamaWali());
            preparedStatement.setString(4, wali.getNopeWali());
            preparedStatement.setString(5, wali.getIdWali());
            
            int update = preparedStatement.executeUpdate();
            
            if(update==1){
            
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, update wali gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, update wali gagal, karena : "+ex,
                        "Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteWali(String id_wali){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "delete from wali where id_wali = ?"
            );
            
            preparedStatement.setString(1, id_wali);
                       
            int insert = preparedStatement.executeUpdate();
            
            if(insert==1){
                JOptionPane.showMessageDialog(null, "Delete wali berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, delete wali gagal",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, delete wali gagal, karena : "+ex,
                        "Error Message",JOptionPane.ERROR_MESSAGE);
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
            rs = statement.executeQuery("select wali.* admin.nama_admin where wali.id_admin = admin.id_admin");
            
            while(rs.next()){
                model.addRow(new Object[]{
                
                });
            }
        } catch (SQLException ex) {
            
        }
                        
        return model;
    }
}
