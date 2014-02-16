/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.filter;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Taopik Ridwan
 */
public class AutoResizeTable {
    public void sesuaikanKolom(JTable t) {
        //cara untuk menyesuaikan kolom dari tabel adalah mengambil
        // lebar kolom yang ada kemudian sesuaikan
        TableColumnModel modelKolom = t.getColumnModel();

        for (int kol = 0; kol < modelKolom.getColumnCount(); kol++) {
            int lebarKolomMax = 0;
            for (int baris = 0; baris < t.getRowCount(); baris++) {
                TableCellRenderer rend = t.getCellRenderer(baris, kol);
                Object nilaiTablel = t.getValueAt(baris, kol);
                Component comp = rend.getTableCellRendererComponent
                        (t, nilaiTablel, false, false, baris, kol);
                lebarKolomMax = Math.max(comp.getPreferredSize().width, lebarKolomMax);
                System.out.println(lebarKolomMax);
            }//akhir for baris
            TableColumn kolom = modelKolom.getColumn(kol);
            kolom.setPreferredWidth(lebarKolomMax);
        }//akhir for kolom
    }
}