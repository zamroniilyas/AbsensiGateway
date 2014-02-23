/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.database.entity.service;

import absensi.database.entity.Inbox;
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
public class InboxService {
    private DefaultTableModel model;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet rs;
    
    public void insertInbox(Inbox inbox){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(""
                    + "INSERT INTO inbox (nopeInbox, pesanInbox, waktuInbox) VALUES (?,?,?)"
            );
            
            preparedStatement.setString(1, inbox.getNopeInbox());
            preparedStatement.setString(2, inbox.getPesanInbox());
            preparedStatement.setString(3, inbox.getWaktuInbox());
            
            int commit = preparedStatement.executeUpdate();
            if (commit==1) {
                JOptionPane.showMessageDialog(null, "Input inbox berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Input inbox gagal",
                 "Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Input ke table inbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateInbox(Inbox inbox){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE inbox SET nopeInbox = ?, pesanInbox = ?, waktuInbox = ? "
                            + "WHERE idInbox = ?"
            );
            
            preparedStatement.setString(1, inbox.getNopeInbox());
            preparedStatement.setString(2, inbox.getPesanInbox());
            preparedStatement.setString(3, inbox.getWaktuInbox());
            preparedStatement.setString(4, inbox.getIdInbox());
            
            int commit = preparedStatement.executeUpdate();
            if (commit==1) {
                JOptionPane.showMessageDialog(null, "Update inbox berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Update inbox gagal",
                 "Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Update inbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteInbox(int idInbox){
        try {
            preparedStatement = DatabaseUtilities.getConnection().prepareStatement(                    
                    "DELETE FROM inbox WHERE idInbox = ?"
            );
            
            preparedStatement.setInt(1, idInbox);
            
            int commit = preparedStatement.executeUpdate();
            if (commit==1) {
                JOptionPane.showMessageDialog(null, "Hapus inbox berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Hapus inbox gagal",
                 "Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Delete inbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void viewAllInbox(){
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            
            rs = statement.executeQuery("SELECT * FROM inbox");
                        
            while(rs.next()){
                System.out.println("Id Outbox : "+rs.getInt("idInbox")
                    +"Nope Outbox : "+rs.getString("nopeInbox")
                    +"Pesan Outbox : "+rs.getString("pesanInbox")
                    +"Waktu Outbox : "+rs.getString("waktuInbox")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "View all inbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
        }
    }
 
    public DefaultTableModel initiailizeModelInbox(){
        model = new DefaultTableModel();
        model.addColumn("Id Inbox");
        model.addColumn("Nomor Handphone");
        model.addColumn("Pesan");
        model.addColumn("Waktu");
        return model;                
    }   
    
    public DefaultTableModel getInboxs(){
        initiailizeModelInbox();
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            
            rs = statement.executeQuery("SELECT * FROM inbox");
                        
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getInt("idInbox"),
                    rs.getString("nopeInbox"),
                    rs.getString("pesanInbox"),
                    rs.getString("waktuInbox")                    
                });                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "View all inbox gagal, karena : "+
                    ex.getMessage(),"Error Message(Inbox)",JOptionPane.ERROR_MESSAGE);
        }        
        return model;
    }
    
//    public static void main(String[] args) {
//        InboxService inboxService = new InboxService();
        
//        Inbox inbox = new Inbox();        
//        inbox.setNopeInbox("0856758123432");
//        inbox.setPesanInbox("Pesan Inbox");
//        inbox.setWaktuInbox("09:12:21 , 09/2/2014");        

//        Inbox inbox1 = new Inbox();
//        inbox1.setIdInbox("2");
//        inbox1.setNopeInbox("0856758123432");
//        inbox1.setPesanInbox("Pesan Inbox Edit 22");
//        inbox1.setWaktuInbox("09:12:21 , 09/2/2014");
        
//        inboxService.insertInbox(inbox);
//        inboxService.updateInbox(inbox1);        
//        inboxService.deleteInbox(2);
//    }
}
