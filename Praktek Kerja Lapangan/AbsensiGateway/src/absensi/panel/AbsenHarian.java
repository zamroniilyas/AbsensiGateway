/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.panel;

import absensi.component.table.editor.BooleanEditor;
import absensi.component.table.renderer.BooleanRender;
import absensi.component.table.renderer.BooleanRender1;
import absensi.database.entity.Absensi;
import absensi.database.entity.Admin;
import absensi.database.entity.Siswa;
import absensi.database.entity.service.AbsensiService;
import absensi.database.utility.DatabaseUtilities;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.renderer.DefaultTableRenderer;



/**
 *
 * @author Chromatics
 */
public class AbsenHarian extends javax.swing.JPanel {
    private Admin admin;
    private DefaultTableModel model;
    private AbsensiService absensiService;
    /**
     * Creates new form Absensi
     */
    public AbsenHarian(Admin admin) {
        this.admin=admin;        
        model = new DefaultTableModel();
        absensiService = DatabaseUtilities.getAbsensiService();
        
        initComponents();
        
        tableAbsensi.setModel(absensiService.initializeTableModelNgabsen());
        setEditorRenderer();
        
        jDateChooser1.setDate(new Date());
    }

    void setEditorRenderer(){
        tableAbsensi.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(comboAbsensi));
//        tableAbsensi.getColumnModel().getColumn(0).setCellRenderer(new BooleanRender());
        tableAbsensi.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(textNama));
        tableAbsensi.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(textNis));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cekBox = new javax.swing.JCheckBox();
        textNama = new javax.swing.JTextField();
        textNis = new javax.swing.JTextField();
        comboAbsensi = new javax.swing.JComboBox();
        panelBackground1 = new absensi.component.PanelBackground();
        panelTransparanRect1 = new absensi.component.PanelTransparanRect();
        panelTransparanRect3 = new absensi.component.PanelTransparanRect();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboJurusan = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        comboKelas = new javax.swing.JComboBox();
        panelTransparanRect2 = new absensi.component.PanelTransparanRect();
        jLabel3 = new javax.swing.JLabel();
        panelTransparanRect5 = new absensi.component.PanelTransparanRect();
        panelTransparanRect7 = new absensi.component.PanelTransparanRect();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAbsensi = new javax.swing.JTable();
        buttonSimpan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkBoxMasuk = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        cekBox.setOpaque(false);

        textNama.setText("jTextField1");
        textNama.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textNama.setEnabled(false);

        textNis.setText("jTextField1");
        textNis.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textNis.setEnabled(false);

        comboAbsensi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Absensi-", "Hadir", "Tidak Hadir", "Ijin", "Sakit" }));

        setLayout(new java.awt.BorderLayout());

        jLabel12.setBackground(new java.awt.Color(102, 255, 102));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/system_search.png"))); // NOI18N
        jLabel12.setText("Cari Form");

        javax.swing.GroupLayout panelTransparanRect3Layout = new javax.swing.GroupLayout(panelTransparanRect3);
        panelTransparanRect3.setLayout(panelTransparanRect3Layout);
        panelTransparanRect3Layout.setHorizontalGroup(
            panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect3Layout.setVerticalGroup(
            panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Tanggal :");

        jLabel2.setText("Jurusan : ");

        comboJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TKJ" }));
        comboJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJurusanActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon2/Search16.png"))); // NOI18N
        jButton1.setText("Lihat Form Absensi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Kelas :");

        comboKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "X", "XI", "XII" }));
        comboKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTransparanRect1Layout = new javax.swing.GroupLayout(panelTransparanRect1);
        panelTransparanRect1.setLayout(panelTransparanRect1Layout);
        panelTransparanRect1Layout.setHorizontalGroup(
            panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparanRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTransparanRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransparanRect1Layout.setVerticalGroup(
            panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect1Layout.createSequentialGroup()
                .addComponent(panelTransparanRect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboJurusan)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKelas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/user-check-icon.png"))); // NOI18N
        jLabel3.setText("Absen Harian");

        javax.swing.GroupLayout panelTransparanRect2Layout = new javax.swing.GroupLayout(panelTransparanRect2);
        panelTransparanRect2.setLayout(panelTransparanRect2Layout);
        panelTransparanRect2Layout.setHorizontalGroup(
            panelTransparanRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect2Layout.setVerticalGroup(
            panelTransparanRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setBackground(new java.awt.Color(102, 255, 102));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/write-document-icon.png"))); // NOI18N
        jLabel14.setText("Form Absensi");

        javax.swing.GroupLayout panelTransparanRect7Layout = new javax.swing.GroupLayout(panelTransparanRect7);
        panelTransparanRect7.setLayout(panelTransparanRect7Layout);
        panelTransparanRect7Layout.setHorizontalGroup(
            panelTransparanRect7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect7Layout.setVerticalGroup(
            panelTransparanRect7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
        );

        tableAbsensi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableAbsensi);

        buttonSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/document_save.png"))); // NOI18N
        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/printer1.png"))); // NOI18N
        jButton3.setText("Cetak");

        checkBoxMasuk.setText("Masuk Semua");
        checkBoxMasuk.setOpaque(false);
        checkBoxMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMasukActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTransparanRect5Layout = new javax.swing.GroupLayout(panelTransparanRect5);
        panelTransparanRect5.setLayout(panelTransparanRect5Layout);
        panelTransparanRect5Layout.setHorizontalGroup(
            panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparanRect7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTransparanRect5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(panelTransparanRect5Layout.createSequentialGroup()
                        .addComponent(checkBoxMasuk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        panelTransparanRect5Layout.setVerticalGroup(
            panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect5Layout.createSequentialGroup()
                .addComponent(panelTransparanRect7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(buttonSimpan)
                        .addComponent(checkBoxMasuk))
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelTransparanRect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransparanRect1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransparanRect5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(panelTransparanRect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTransparanRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTransparanRect5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void comboJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJurusanActionPerformed

    private void comboKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKelasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model = absensiService.lihatSiswa(comboJurusan.getSelectedItem().toString(), comboKelas.getSelectedItem().toString());
        tableAbsensi.setModel(model);
        setEditorRenderer();
        String message="";
        boolean cek=false;
        for(int i=0; i<tableAbsensi.getRowCount(); i++){
            if(absensiService.verifikasiAbsen(jDateChooser1.getDate(), 
                    tableAbsensi.getValueAt(i, 0).toString())==true){
                message=message+"NIS : "+tableAbsensi.getValueAt(i, 1)+
                        " / Nama : "+tableAbsensi.getValueAt(i, 2);
                cek=true;
                System.out.println(message+" -");
            }else{
                System.out.println("----");
            }        
        }
        
        if(cek==true){
            JOptionPane.showMessageDialog(null, "Maaf, siswa dibawah ini sudah melakukan absebsi"+
                message);
            buttonSimpan.setEnabled(false);
        }else{
            buttonSimpan.setEnabled(true);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkBoxMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMasukActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tableAbsensi.getRowCount(); i++) {
            if(checkBoxMasuk.isSelected()){
                tableAbsensi.setValueAt("Hadir", i , 0);
            }else{
                tableAbsensi.setValueAt("", i , 0);
            }
        }        
    }//GEN-LAST:event_checkBoxMasukActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:                
        int j=0;
        
        for (int i = 0; i < tableAbsensi.getRowCount(); i++) {            
            Siswa siswa = new Siswa();
            siswa.setNis(tableAbsensi.getValueAt(i, 1).toString());
            siswa.setNamaSiswa(tableAbsensi.getValueAt(i, 2).toString());
            
            Absensi absensi = new Absensi();            
            absensi.setAdmin(admin);                        
            absensi.setSiswa(siswa);
            absensi.setTglAbsensi(jDateChooser1.getDate());
            absensi.setWaktuAbsensi(jDateChooser1.getDate().getHours()+
                    ":"+jDateChooser1.getDate().getMinutes()+
                    ":"+jDateChooser1.getDate().getSeconds());
            absensi.setKetAbsensi(tableAbsensi.getValueAt(i, 0).toString());
            
            absensiService.insertAbsensi(absensi);
            j++;
        }
        
        if (j == tableAbsensi.getRowCount()) {
            JOptionPane.showMessageDialog(null, "Data sudah di masukkan");                
            hapusTable();
        }else{
            JOptionPane.showMessageDialog(null, "Maaf, sebagian data tidak bisa di masukkan");
        }
        cekBox.setSelected(false);
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, jDateChooser1.getDate().getHours()+
                    ""+jDateChooser1.getDate().getMinutes()+
                    ""+jDateChooser1.getDate().getSeconds());
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JCheckBox cekBox;
    private javax.swing.JCheckBox checkBoxMasuk;
    private javax.swing.JComboBox comboAbsensi;
    private javax.swing.JComboBox comboJurusan;
    private javax.swing.JComboBox comboKelas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private absensi.component.PanelBackground panelBackground1;
    private absensi.component.PanelTransparanRect panelTransparanRect1;
    private absensi.component.PanelTransparanRect panelTransparanRect2;
    private absensi.component.PanelTransparanRect panelTransparanRect3;
    private absensi.component.PanelTransparanRect panelTransparanRect5;
    private absensi.component.PanelTransparanRect panelTransparanRect7;
    private javax.swing.JTable tableAbsensi;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNis;
    // End of variables declaration//GEN-END:variables

    void hapusTable(){
       for( int i = model.getRowCount() - 1; i >= 0; i-- ){
             model.removeRow(i);
        }
    }
}
