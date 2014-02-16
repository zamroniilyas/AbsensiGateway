/*
 * (swing1.1beta3)
 * 
 */

package belajar.table;

import java.util.*;
import javax.swing.table.*;


 

/**
  * GroupableTableHeader
  *
  * @version 1.0 10/20/98
  * @author Nobuo Tamemasa
  */

public class GroupableTableHeader extends JTableHeader {
  private static final String uiClassID = "GroupableTableHeaderUI";
  protected Vector columnGroups = null;
    
  public GroupableTableHeader(TableColumnModel model) {
    super(model);
    setUI(new GroupableTableHeaderUI());
    setReorderingAllowed(false);
  }
  
  @Override
  public void setReorderingAllowed(boolean b) {
    reorderingAllowed = false;
  }
    
  public void addColumnGroup(ColumnGroup g) {
    if (columnGroups == null) {
      columnGroups = new Vector();
    }
    columnGroups.addElement(g);
  }

  public Enumeration getColumnGroups(TableColumn col) {
    if (columnGroups == null) return null;
    Enumeration enumw = columnGroups.elements();
    while (enumw.hasMoreElements()) {
      ColumnGroup cGroup = (ColumnGroup)enumw.nextElement();
      Vector v_ret = (Vector)cGroup.getColumnGroups(col,new Vector());
      if (v_ret != null) { 
	return v_ret.elements();
      }
    }
    return null;
  }
  
  public void setColumnMargin() {
    if (columnGroups == null) return;
    int columnMargin = getColumnModel().getColumnMargin();
    Enumeration enume = columnGroups.elements();
    while (enume.hasMoreElements()) {
      ColumnGroup cGroup = (ColumnGroup)enume.nextElement();
      cGroup.setColumnMargin(columnMargin);
    }
  }
  
}

