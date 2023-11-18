package Dominio;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import javax.swing.table.DefaultTableCellRenderer;

public class HTMLRenderer extends DefaultTableCellRenderer implements Serializable{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value != null && value instanceof String) {
            setText("<html>" + value + "</html>");
        }
        return c;
    }
}
