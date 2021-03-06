/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.panel;

/**
 *
 * @author Chromatics
 */
public class LaporanAbsensi extends javax.swing.JPanel {

    /**
     * Creates new form LaporanAbsensi
     */
    public LaporanAbsensi() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        panelTransparanRect2 = new absensi.component.PanelTransparanRect();
        panelTransparanRect5 = new absensi.component.PanelTransparanRect();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboCariPinjam6 = new javax.swing.JComboBox();
        labelPencarian7 = new javax.swing.JLabel();
        tglPinjam = new com.toedter.components.JSpinField();
        blnPinjam = new com.toedter.calendar.JMonthChooser();
        thnPinjam = new com.toedter.calendar.JYearChooser();
        jButton7 = new javax.swing.JButton();
        panelTransparanRect3 = new absensi.component.PanelTransparanRect();
        panelTransparanRect4 = new absensi.component.PanelTransparanRect();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/reports-icon.png"))); // NOI18N
        jLabel8.setText("Laporan Absensi");

        javax.swing.GroupLayout panelTransparanRect1Layout = new javax.swing.GroupLayout(panelTransparanRect1);
        panelTransparanRect1.setLayout(panelTransparanRect1Layout);
        panelTransparanRect1Layout.setHorizontalGroup(
            panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect1Layout.setVerticalGroup(
            panelTransparanRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(102, 255, 102));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/system_search.png"))); // NOI18N
        jLabel9.setText("Pencarian");

        javax.swing.GroupLayout panelTransparanRect5Layout = new javax.swing.GroupLayout(panelTransparanRect5);
        panelTransparanRect5.setLayout(panelTransparanRect5Layout);
        panelTransparanRect5Layout.setHorizontalGroup(
            panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect5Layout.setVerticalGroup(
            panelTransparanRect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect5Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setText("Lihat Berdasarkan :");

        comboCariPinjam6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Lihat Berdasarkan-", "Hari", "Bulan", "Tahun" }));
        comboCariPinjam6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCariPinjam6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboCariPinjam6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboCariPinjam6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboCariPinjam6MouseReleased(evt);
            }
        });
        comboCariPinjam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCariPinjam6ActionPerformed(evt);
            }
        });

        labelPencarian7.setText("Tanggal :");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon2/Search16.png"))); // NOI18N
        jButton7.setText("Cari");

        javax.swing.GroupLayout panelTransparanRect2Layout = new javax.swing.GroupLayout(panelTransparanRect2);
        panelTransparanRect2.setLayout(panelTransparanRect2Layout);
        panelTransparanRect2Layout.setHorizontalGroup(
            panelTransparanRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparanRect5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTransparanRect2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCariPinjam6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPencarian7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panelTransparanRect2Layout.setVerticalGroup(
            panelTransparanRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect2Layout.createSequentialGroup()
                .addComponent(panelTransparanRect5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransparanRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparanRect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(comboCariPinjam6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPencarian7))
                    .addComponent(tglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(102, 255, 102));
        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/windows_table.png"))); // NOI18N
        jLabel10.setText("Tabel Laporan");

        javax.swing.GroupLayout panelTransparanRect4Layout = new javax.swing.GroupLayout(panelTransparanRect4);
        panelTransparanRect4.setLayout(panelTransparanRect4Layout);
        panelTransparanRect4Layout.setHorizontalGroup(
            panelTransparanRect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransparanRect4Layout.setVerticalGroup(
            panelTransparanRect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absensi/panel/icon/printer.png"))); // NOI18N
        jButton8.setText("Cetak");

        javax.swing.GroupLayout panelTransparanRect3Layout = new javax.swing.GroupLayout(panelTransparanRect3);
        panelTransparanRect3.setLayout(panelTransparanRect3Layout);
        panelTransparanRect3Layout.setHorizontalGroup(
            panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparanRect4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparanRect3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransparanRect3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap())
        );
        panelTransparanRect3Layout.setVerticalGroup(
            panelTransparanRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanRect3Layout.createSequentialGroup()
                .addComponent(panelTransparanRect4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransparanRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransparanRect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTransparanRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(panelTransparanRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTransparanRect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTransparanRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void comboCariPinjam6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCariPinjam6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCariPinjam6MouseClicked

    private void comboCariPinjam6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCariPinjam6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCariPinjam6MouseEntered

    private void comboCariPinjam6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCariPinjam6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCariPinjam6MousePressed

    private void comboCariPinjam6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCariPinjam6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCariPinjam6MouseReleased

    private void comboCariPinjam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCariPinjam6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCariPinjam6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser blnPinjam;
    private javax.swing.JComboBox comboCariPinjam6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelPencarian7;
    private absensi.component.PanelBackground panelBackground1;
    private absensi.component.PanelTransparanRect panelTransparanRect1;
    private absensi.component.PanelTransparanRect panelTransparanRect2;
    private absensi.component.PanelTransparanRect panelTransparanRect3;
    private absensi.component.PanelTransparanRect panelTransparanRect4;
    private absensi.component.PanelTransparanRect panelTransparanRect5;
    private com.toedter.components.JSpinField tglPinjam;
    private com.toedter.calendar.JYearChooser thnPinjam;
    // End of variables declaration//GEN-END:variables
}
