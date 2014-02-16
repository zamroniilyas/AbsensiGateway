/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.database.utility;

import absensi.database.entity.service.AbsensiService;
import absensi.database.entity.service.AdminService;
import absensi.database.entity.service.InboxService;
import absensi.database.entity.service.OutboxService;
import absensi.database.entity.service.SiswaService;
import absensi.database.entity.service.WaliService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Chromatics
 */
public class DatabaseUtilities {
    private static Connection connection;
    private static SiswaService siswaService;
    private static AdminService adminService;
    private static WaliService waliService;
    private static InboxService inboxService;
    private static OutboxService outboxService;
    private static AbsensiService absensiService;

    public static Connection getConnection() {
        if(connection == null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = DriverManager.getConnection("jdbc:mysql://localhost/absensi", "root", "nasigoreng");
                JOptionPane.showMessageDialog(null, "Koneksi Berhasil ","Koneksi Report",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal Karena "+ex,"Koneksi Report",JOptionPane.ERROR_MESSAGE);
            }
        }           
        return connection;
    }        
    
    public static void main(String[] args) {
        DatabaseUtilities.getConnection();
    }
    
     public static AdminService getAdminService(){
        if (adminService==null) {
            adminService = new AdminService();
        }
        return adminService;
    }

    public static SiswaService getSiswaService() {
        if (siswaService==null) {
            siswaService = new SiswaService();
        }
        return siswaService;
    }

    public static WaliService getWali_Service() {
        if (waliService==null) {
            waliService = new WaliService();            
        }
        return waliService;
    }
    
    public static InboxService getInbox_Service() {
        if(inboxService==null){
            inboxService = new InboxService();
        }
        return inboxService;
    }

    public static OutboxService getOutbox_Service() {
        if(outboxService==null){
            outboxService = new OutboxService();
        }
        return outboxService;
    } 
    
    public static AbsensiService getAbsensiService() {
        if(absensiService==null){
            absensiService = new AbsensiService();
        }
        return absensiService;
    } 
}
