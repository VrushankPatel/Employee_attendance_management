package Utilities;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Utilities {
    public void actionClose(java.awt.event.MouseEvent evt){
        System.exit(0);
    }
    public void MouseHoverminimmizeClose(java.awt.event.MouseEvent evt) {                                          
        ((JLabel)(evt.getSource())).setForeground(((JLabel)(evt.getSource())).getForeground() == Color.WHITE ? Color.BLACK : Color.WHITE);
    } 
    public void FocusTextFields(java.awt.event.FocusEvent evt) {                                 
        ((JTextField)(evt.getSource())).setText(((JTextField)(evt.getSource())).isFocusOwner() ? (((JTextField)(evt.getSource())).getText().toString()).equals(((JTextField)(evt.getSource())).getToolTipText()) ? "" : ((JTextField)(evt.getSource())).getText() : (((JTextField)(evt.getSource())).getText().toString()).isEmpty() ? ((JTextField)(evt.getSource())).getToolTipText() : ((JTextField)(evt.getSource())).getText());
    }
}
