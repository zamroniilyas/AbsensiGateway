/*
 *  BACA DENGAN TELITI !!!
 * 
 *  Anda boleh menggunakan, mengubah, menghapus, menambah, dan
 *  melakukan hal yang anda inginkan ke dalam source code ini.
 * 
 *  Dan saya tidak bertanggung jawab atas kesalahan,
 *  bug, atau keanehan yang ada dalam source code ini, dan
 *  saya juga TIDAK MENERIMA PERTANYAAN dari Anda
 *  mengenai isi source code ini.
 * 
 *  Semoga source code ini bermanfaat bagi Anda, dan juga
 *  bermanfaat bagi project yang sedang Anda buat.
 * 
 *  Salam saya, Eko Kurniawan Khannedy
 */
package absensi.component.table.renderer;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author echo
 */
public class BooleanRender1 implements TableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JCheckBox checkBox = new JCheckBox();
        Boolean b = (Boolean) value;
        checkBox.setText(String.valueOf(b));
        checkBox.setSelected(b);
        checkBox.setOpaque(true);
        checkBox.setFont(checkBox.getFont().deriveFont(Font.PLAIN));

        if (isSelected) {
            checkBox.setBackground(table.getSelectionBackground());
        } else {
            checkBox.setBackground(table.getBackground());
        }

        return checkBox;
    }
}
