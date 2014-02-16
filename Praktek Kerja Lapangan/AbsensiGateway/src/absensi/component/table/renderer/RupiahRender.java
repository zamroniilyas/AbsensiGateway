/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.table.renderer;

import java.awt.Component;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Chromatics
 */
public class RupiahRender extends DefaultTableCellRenderer{
    private NumberFormat numberFormat;

    public RupiahRender() {
        numberFormat = NumberFormat.getCurrencyInstance(new Locale("in", "ID")); 
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
//        int i= (int) value;
        int i= Integer.parseInt(value.toString());
        double d = (double)i;
        label.setText(numberFormat.format(d));
        
        
        return label;
    }
        
}
