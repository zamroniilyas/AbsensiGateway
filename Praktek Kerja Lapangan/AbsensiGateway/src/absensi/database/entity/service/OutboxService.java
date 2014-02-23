/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity.service;

import absensi.database.entity.Outbox;
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
public class OutboxService {
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet rs;    
    private DefaultTableModel model;
        
    public void insertOutbox(Outbox outbox){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(""
                    + "INSERT INTO outbox (nopeOutbox , pesanOutbox , waktuOutbox)"
                    + "VALUES (?,?,?,?)");
            preparedStatement.setString(1, outbox.getNopeOutbox());
            preparedStatement.setString(2, outbox.getPsnOutbox());
            preparedStatement.setString(3, outbox.getWaktuOutbox());
            
            int commit = preparedStatement.executeUpdate();
            if (commit==1) {
                JOptionPane.showMessageDialog(null, "Insert outbox berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Insert outbox gagal",
                 "Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Input ke table outbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateOutbox(Outbox outbox){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE outbox SET nopeOutbox = ?, pesanOutbox = ?, waktuOutbox = ?, statusOutbox= ?"
                            + "WHERE idOutbox = ?"                    
            );
            
            preparedStatement.setString(1, outbox.getNopeOutbox());
            preparedStatement.setString(2, outbox.getPsnOutbox());
            preparedStatement.setString(3, outbox.getWaktuOutbox());
            preparedStatement.setString(5, outbox.getIdOutbox());
            
            int commit = preparedStatement.executeUpdate();
            if (commit==1) {
                JOptionPane.showMessageDialog(null, "Update outbox berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Update outbox gagal",
                 "Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Update outbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteOutbox(int idOutbox){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(                    
                    "DELETE FROM outbox WHERE idOutbox = ?"
            );
            
            preparedStatement.setInt(1, idOutbox);
            
            int commit = preparedStatement.executeUpdate();
            if (commit==1) {
                JOptionPane.showMessageDialog(null, "Hapus outbox berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Hapus outbox gagal",
                        "Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "delete outbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void viewAllOutbox(){
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            
            rs = statement.executeQuery("SELECT * FROM outbox");
                        
            while(rs.next()){
                System.out.println("Id Outbox : "+rs.getInt("idOutboux")
                    +"Nope Outbox : "+rs.getString("nopeOutbox")
                    +"Pesan Outbox : "+rs.getString("pessnOutbox")
                    +"Waktu Outbox : "+rs.getString("waktuOutbox")
                    +"Status Outbox : "+rs.getString("statusOutbox")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "View all outbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
//    private String idOutbox;    
//    private String nopeOutbox;
//    private String psnOutbox;    
//    private String waktuOutbox;
//    private String statusOutbox;
    
    public DefaultTableModel initializeModelOutbox(){
        model = new DefaultTableModel();
        model.addColumn("Id Outbox");
        model.addColumn("Nomor Handphone");
        model.addColumn("Pesan");
        model.addColumn("Waktu");
        model.addColumn("Status Kirim");        
        return model;
    }
    
    public DefaultTableModel getOutboxs(){
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            
            rs = statement.executeQuery("SELECT * FROM outbox");
                        
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getInt("idOutboux"),
                    rs.getString("nopeOutbox"),
                    rs.getString("pesanOutbox"),
                    rs.getString("waktuOutbox"),
                    rs.getString("statusOutbox")
                });                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "View all outbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Outbox)",JOptionPane.ERROR_MESSAGE);
        }        
        return model;
    }
    
//    public static void main(String[] args) {
//        OutboxService outboxService = new OutboxService();
        
//        Outbox outbox = new Outbox();        
//        outbox.setNopeOutbox("0856758123432");
//        outbox.setPsnOutbox("Pesan Inbox");
//        outbox.setWaktuOutbox("09:12:21 , 09/2/2014");
//        outbox.setStatusOutbox("Gagal Terkirim");
        
//        Outbox outbox1 = new Outbox();  
//        outbox1.setIdOutbox("2");
//        outbox1.setNopeOutbox("0856758123432");
//        outbox1.setPsnOutbox("Pesan Inbox Edit");
//        outbox1.setWaktuOutbox("09:12:21 , 09/2/2014");
//        outbox1.setStatusOutbox("Berhasil Terkirim");

//        outboxService.insertOutbox(outbox);
//        outboxService.updateOutbox(outbox1);
//        outboxService.deleteOutbox(2);
//    }    
}
