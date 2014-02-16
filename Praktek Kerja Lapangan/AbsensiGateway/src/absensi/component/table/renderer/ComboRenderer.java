/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.table.renderer;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Chromatics
 */
public class ComboRenderer implements TableCellRenderer{

    private JComboBox comboBox;

//    public ComboRenderer(JComboBox comboBox) {
//        this.comboBox = comboBox;
//    }
                                
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComboBox comboBox = new JComboBox();
//        "Hadir", "Tidak Hadir", "Izin", "Sakit" 
        comboBox.addItem("Hadir");
        comboBox.addItem("Tidak Hadir");
        comboBox.addItem("Izin");
        comboBox.addItem("Sakit");
        comboBox.setSelectedItem(value);
        return comboBox;
    }
    
}
