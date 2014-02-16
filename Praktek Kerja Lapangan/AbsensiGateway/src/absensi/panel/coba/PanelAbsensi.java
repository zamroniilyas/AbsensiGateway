/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.panel.coba;

import absensi.database.entity.Admin;
import absensi.database.entity.service.AbsensiService;
import absensi.database.utility.DatabaseUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chromatics
 */
public class PanelAbsensi extends javax.swing.JPanel {
    private DefaultTableModel model;
    private AbsensiService absensiService;
    private Admin admin;
    /**
     * Creates new form Absensi
     */
    public PanelAbsensi(Admin admin) {
        model = new DefaultTableModel();
        absensiService = DatabaseUtilities.getAbsensiService();
        this.admin = admin;
        
        initComponents();
                
//        model.addColumn("Cek");
//        model.addColumn("NIS");
//        model.addColumn("Nama Siswa");
        
        tableAbsensi.setModel(absensiService.initializeTableModelNgabsen());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new absensi.component.PanelBackground();
        panelTransparanRect1 = new absensi.component.PanelTransparanRect();
        panelTransparanRect3 = new absensi.component.PanelTransparanRect();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboJurusan = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        panelTransparanRect2 = new absensi.component.PanelTransparanRect();
        jLabel3 = new javax.swing.JLabel();
        panelTransparanRect4 = new absensi.component.PanelTransparanRect();
        panelTransparanRect6 = new absensi.component.PanelTransparanRect();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAbsensi = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel12.setBackground(new java.awt.Color(102, 255, 102));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/write-document-icon.png"))); // NOI18N
        jLabel12.setText("Lihat Form");

        javax.swing.GroupLayout panelTransparanRect3Layout = new javax.swing.GroupLayout(panelTransparanRect3);
        panelTransparanRect3.setLayout(panelTransparanRect3Layout);
        panelTransparanRect3Layout.setHorizontalGroup(
            panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        panelTransparanRect3Layout.setVerticalGroup(
            panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Tanggal :");

        jLabel2.setText("Kelas :");

        comboJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJurusanActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTransparanRect1Layout.setVerticalGroup(
            panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect1Layout.createSequentialGroup()
                .addComponent(panelTransparanRect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/user-check-icon.png"))); // NOI18N
        jLabel3.setText("Absensi");

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

        jLabel13.setBackground(new java.awt.Color(102, 255, 102));
        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/write-document-icon.png"))); // NOI18N
        jLabel13.setText("Form Absensi");

        javax.swing.GroupLayout panelTransparanRect6Layout = new javax.swing.GroupLayout(panelTransparanRect6);
        panelTransparanRect6.setLayout(panelTransparanRect6Layout);
        panelTransparanRect6Layout.setHorizontalGroup(
            panelTransparanRect6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect6Layout.setVerticalGroup(
            panelTransparanRect6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/document_save.png"))); // NOI18N
        jButton2.setText("Simpan");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/printer1.png"))); // NOI18N
        jButton3.setText("Simpan");

        javax.swing.GroupLayout panelTransparanRect4Layout = new javax.swing.GroupLayout(panelTransparanRect4);
        panelTransparanRect4.setLayout(panelTransparanRect4Layout);
        panelTransparanRect4Layout.setHorizontalGroup(
            panelTransparanRect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparanRect6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTransparanRect4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparanRect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparanRect4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        panelTransparanRect4Layout.setVerticalGroup(
            panelTransparanRect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect4Layout.createSequentialGroup()
                .addComponent(panelTransparanRect6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelTransparanRect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelTransparanRect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransparanRect1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransparanRect4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(panelTransparanRect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTransparanRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTransparanRect4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void comboJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJurusanActionPerformed
        // TODO add your handling code here:
//        tableAbsensi.setModel(absensiService.lihatSiswa(comboJurusan.getSelectedItem().toString()));
    }//GEN-LAST:event_comboJurusanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboJurusan;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private absensi.component.PanelBackground panelBackground1;
    private absensi.component.PanelTransparanRect panelTransparanRect1;
    private absensi.component.PanelTransparanRect panelTransparanRect2;
    private absensi.component.PanelTransparanRect panelTransparanRect3;
    private absensi.component.PanelTransparanRect panelTransparanRect4;
    private absensi.component.PanelTransparanRect panelTransparanRect6;
    private javax.swing.JTable tableAbsensi;
    // End of variables declaration//GEN-END:variables
}
