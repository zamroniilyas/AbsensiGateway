package belajar.table2;

/** (swing1.1beta3) */
//package jp.gr.java_conf.tame.swing.examples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;


/**
 * @version 1.0 11/09/98
 */
 
class RowHeaderRenderer extends JLabel implements ListCellRenderer {
  
  RowHeaderRenderer(JTable table) {
    JTableHeader header = table.getTableHeader();
    setOpaque(true);
    setBorder(UIManager.getBorder("TableHeader.cellBorder"));
    setHorizontalAlignment(CENTER);
    setForeground(header.getForeground());
    setBackground(header.getBackground());
    setFont(header.getFont());
  }
  
  @Override
  public Component getListCellRendererComponent( JList list, 
         Object value, int index, boolean isSelected, boolean cellHasFocus) {
    setText((value == null) ? "" : value.toString());
    return this;
  }
}

public class RowHeaderExample extends JFrame {

  public RowHeaderExample() {
    super( "Row Header Example" );
    setSize( 300, 150 );
        
    ListModel lm = new AbstractListModel() {
      String headers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
      @Override
      public int getSize() { return headers.length; }
      @Override
      public Object getElementAt(int index) {
        return headers[index];
      }
    };
    ListModel lmRow = new AbstractListModel() {
      String headers[] = {"Roni", "Hamid", "Wahyu", "Yogi", "Hanafi", "Fahry", "Teguh", "Yesi", "Luki"};
      @Override
      public int getSize() { return headers.length; }
      @Override
      public Object getElementAt(int index) {
        return headers[index];
      }
    };

    DefaultTableModel dm = new DefaultTableModel(lm.getSize(),10);
    JTable table = new JTable( dm );
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    
    JList rowHeader = new JList(lmRow);    
    rowHeader.setFixedCellWidth(50);
    
    rowHeader.setFixedCellHeight(table.getRowHeight()
                               + table.getRowMargin());
//                             + table.getIntercellSpacing().height);
    rowHeader.setCellRenderer(new RowHeaderRenderer(table));

    JScrollPane scroll = new JScrollPane( table );
    scroll.setRowHeaderView(rowHeader);
    getContentPane().add(scroll, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    RowHeaderExample frame = new RowHeaderExample();
    frame.addWindowListener( new WindowAdapter() {
      @Override
      public void windowClosing( WindowEvent e ) {
	System.exit(0);
      }
    });
    frame.setVisible(true);
  }
}