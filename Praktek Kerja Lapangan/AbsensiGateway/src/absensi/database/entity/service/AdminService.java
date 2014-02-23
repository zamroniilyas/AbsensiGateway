/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.entity.service;

import absensi.database.entity.Admin;
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
 * @author Chromatics
 */
public class AdminService {
    private DefaultTableModel model;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet rs;
    
    public void insertAdmin(Admin admin){     
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "insert into admin (id_admin, nama_admin, alamat_admin, tempat_lahir_admin, "
                            + "tgl_lahir_admin, jk_admin, nope_admin, password_admin, foto_admin) "
                            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)"                    
            );
            
            preparedStatement.setString(1, admin.getIdAdmin());
            preparedStatement.setString(2, admin.getNamaAdmin());
            preparedStatement.setString(3, admin.getAlamatAdmin());
            preparedStatement.setString(4, admin.getTempatLahirAdmin());
            preparedStatement.setDate(5, new Date(admin.getTglLahirAdmin().getTime()));
            preparedStatement.setString(6, admin.getJkAdmin());
            preparedStatement.setString(7, admin.getNopeAdmin());
            preparedStatement.setString(8, admin.getPasswordAdmin());
            preparedStatement.setBlob(9, admin.getFotoAdmin());
            
            int insert = preparedStatement.executeUpdate();
            
            if(insert==1){
            
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, insert siswa gagal,","Siswa Service Report",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Insert admin gagal, karena : "+ex);
            ex.printStackTrace();
        }
    }
    
    public void updateAdmin(Admin admin){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "update admin set nama_admin = ?, tempat_lahir_admin = ?, tgl_lahir_admin = ?, "
                            + "jk_admin = ?, alamat_admin = ?,  nope_admin = ?, password_admin = ?, "
                            + "foto_admin = ? where id_admin = ?"
            );
                        
            preparedStatement.setString(1, admin.getNamaAdmin());
            preparedStatement.setString(2, admin.getTempatLahirAdmin());
            preparedStatement.setDate(3, new Date(admin.getTglLahirAdmin().getTime()));
            preparedStatement.setString(4, admin.getJkAdmin());
            preparedStatement.setString(5, admin.getAlamatAdmin());            
            preparedStatement.setString(6, admin.getNopeAdmin());
            preparedStatement.setString(7, admin.getPasswordAdmin());            
            preparedStatement.setBlob(8, admin.getFotoAdmin());            
            preparedStatement.setString(9, admin.getIdAdmin());
                                    
            int update = preparedStatement.executeUpdate();
            
            if(update==1){
                
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, update siswa gagal,","Siswa Service Report",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update admin gagal, karena : "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public void deleteAdmin(String idAdmin){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                "delete from admin where id_admin = ?"                    
            );
            
            preparedStatement.setString(1, idAdmin);
            
            int delete = preparedStatement.executeUpdate();
            
            if(delete==1){
                JOptionPane.showMessageDialog(null, "Delete admin.id : "+idAdmin);
            }else{
                JOptionPane.showMessageDialog(null, "Delete admin gagal","Siswa Service Report",JOptionPane.ERROR);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Insert admin gagal, karena : "+ex);
            ex.printStackTrace();
        }
    }
    
    public void initializeTableModel(){
        model = new DefaultTableModel();
        
        model.addColumn("ID Admin");
        model.addColumn("Nama");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");        
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No Telpon");
        model.addColumn("Password");
    }
    
    public DefaultTableModel getAllAdmin(){
        initializeTableModel();
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            
            rs = statement.executeQuery("select * from ADMIN");
            
            while(rs.next()){
//                 model.addColumn("ID Admin");
//        model.addColumn("Nama");
//        model.addColumn("Tempat Lahir");
//        model.addColumn("Tanggal Lahir");        
//        model.addColumn("Alamat");
//        model.addColumn("Jenis Kelamin");
//        model.addColumn("No Telpon");
//        model.addColumn("Password");
                model.addRow(new Object[]{
                    rs.getString("id_admin"),
                    rs.getString("nama_admin"),
                    rs.getString("tempat_lahir_admin"),
                    rs.getDate("tgl_lahir_admin"),
                    rs.getString("alamat_admin"),
                    rs.getString("jk_admin"),
                    
                    rs.getString("nope_admin"),
                    rs.getString("password_admin"),  
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "getAllAdmin() gagal, karena : "+ex);
            ex.printStackTrace();
        }                
        return model;
    }        
    
     public boolean loginAdmin(String id_admin, String password){
        boolean login = false;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "select * from ADMIN where id_admin = ?  and password_admin = ?");
            preparedStatement.setString(1, id_admin);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {                
                login = true;
            }else {
                login = false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "loginAdmin() error karena : "+ex.getMessage(),
                    "Admin Service Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return login;
    }
     
    public Admin cariAdmin(String id_admin){
        Admin admin = null;
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "select * from ADMIN where id_admin = ?");
            preparedStatement.setString(1, id_admin);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                admin = new Admin();
                admin.setIdAdmin(rs.getString("ID_ADMIN"));
                admin.setNamaAdmin(rs.getString("NAMA_ADMIN"));
                admin.setTempatLahirAdmin(rs.getString("TEMPAT_LAHIR_ADMIN"));                
                admin.setTglLahirAdmin(rs.getDate("TGL_LAHIR_ADMIN"));                
                admin.setAlamatAdmin(rs.getString("ALAMAT_ADMIN"));                                                
                admin.setJkAdmin(rs.getString("JK_ADMIN"));                
                admin.setFotoAdmin(rs.getBlob("FOTO_ADMIN"));
                admin.setPasswordAdmin(rs.getString("PASSWORD_ADMIN"));                                                
                admin.setNopeAdmin(rs.getString("NOPE_ADMIN"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "cariAdmin() error karena : "+ex.getMessage(),
                    "Admin Service Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return admin;
    }
    
    public static void main(String[] args) {
        AdminService adminService = new AdminService();
        Admin admin = new Admin();
        
        admin.setIdAdmin(null);
        admin.setNamaAdmin(null);
        admin.setAlamatAdmin(null);                
        admin.setJkAdmin(null);
        admin.setTempatLahirAdmin(null);
        admin.setTglLahirAdmin(null);
        admin.setNopeAdmin(null);
        admin.setPasswordAdmin(null);        
        admin.setUploadFotoAdmin(null);
        admin.setFotoAdmin(null);
    }
}