package Utilities;



import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class UIComponentEventUtilities {
    public void actionClose(java.awt.event.MouseEvent evt){
        System.exit(0);
    }
    public void onHoverTitleBarButtons(java.awt.event.MouseEvent evt) {                                          
        ((JLabel)(evt.getSource())).setForeground(((JLabel)(evt.getSource())).getForeground() == Color.WHITE ? Color.BLACK : Color.WHITE);
    } 
    public void onFocusTextFields(java.awt.event.FocusEvent evt) {                                 
        ((JTextField)(evt.getSource())).setText(((JTextField)(evt.getSource())).isFocusOwner() ? (((JTextField)(evt.getSource())).getText().toString()).equals(((JTextField)(evt.getSource())).getToolTipText()) ? "" : ((JTextField)(evt.getSource())).getText() : (((JTextField)(evt.getSource())).getText().toString()).isEmpty() ? ((JTextField)(evt.getSource())).getToolTipText() : ((JTextField)(evt.getSource())).getText());
    }
    public void hoverGeneralButtons(MouseEvent evt) {        
        ((JComponent)(evt.getSource())).setBorder(((LineBorder)((JComponent)(evt.getSource())).getBorder()).getLineColor().toString().equals("java.awt.Color[r=255,g=255,b=255]") ? javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,148,6)) : javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        (((JComponent)(evt.getSource())).getComponent(0)).setForeground(((((JComponent)(evt.getSource())).getComponent(0)).getForeground()).toString().equals("java.awt.Color[r=255,g=255,b=255]") ? new Color(248,148,6) : new Color(255,255,255));        
    }
}

