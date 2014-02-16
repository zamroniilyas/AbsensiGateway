/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.table.editor;

import absensi.component.filter.JTextFieldFilter;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Chromatics
 */
public class RupiahEditor extends AbstractCellEditor implements TableCellEditor{
//    private JTextField textField;

    private JFormattedTextField formattedTextField;

    public RupiahEditor(JFormattedTextField formattedTextField) {
        this.formattedTextField = formattedTextField;
    }
    
        
    @Override
    public Object getCellEditorValue() {        
        return formattedTextField.getText();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {                
        formattedTextField.setValue(value);

        return formattedTextField;
    }
    
}
