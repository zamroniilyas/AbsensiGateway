/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.table.editor;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Chromatics
 */
public class BooleanEditor extends AbstractCellEditor implements TableCellEditor{

    JCheckBox checkBox;

    public BooleanEditor(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }
    
    @Override
    public Object getCellEditorValue() {
        return checkBox.getText();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Boolean b = (Boolean) value;
        checkBox.setSelected(b);        
        return checkBox;
    }
    
}
