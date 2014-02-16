/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.table.renderer;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Chromatics
 */
public class BooleanRender implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setOpaque(false);
        Boolean b = (Boolean) value;
        checkBox.setSelected(b);
        
        return checkBox;
        
    }
    
}
