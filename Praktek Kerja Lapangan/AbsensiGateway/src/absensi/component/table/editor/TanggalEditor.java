/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component.table.editor;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.util.Date;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Chromatics
 */
public class TanggalEditor extends AbstractCellEditor implements TableCellEditor{

    private JDateChooser dateChooser;

    public TanggalEditor(JDateChooser dateChooser) {
        this.dateChooser = dateChooser;
    }
    
    @Override
    public Object getCellEditorValue() {
        return dateChooser.getDate();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        dateChooser.setDate((Date) value);
        return dateChooser;
    }
    
}
