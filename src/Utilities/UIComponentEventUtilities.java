package Utilities;

import Views.SignupPanel;
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
    public void onFocusTextFields(JTextField textfield) {                                 
        textfield.setText(textfield.isFocusOwner() ? (textfield.getText().toString()).equals(textfield.getToolTipText()) ? "" : textfield.getText() : (textfield.getText().toString()).isEmpty() ? textfield.getToolTipText() : textfield.getText());
    }
    public void hoverGeneralButtonicPanels(JPanel panel) {        
        panel.setBorder(((LineBorder)(panel.getBorder())).getLineColor().toString().equals("java.awt.Color[r=255,g=255,b=255]") ? javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,148,6)) : javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        panel.getComponent(0).setForeground(((panel.getComponent(0)).getForeground()).toString().equals("java.awt.Color[r=255,g=255,b=255]") ? new Color(248,148,6) : new Color(255,255,255));               
        
    }
    public void switchFromTo(JPanel sourcePanel,JPanel destinationPanel){
        sourcePanel.setVisible(false);
        sourcePanel.getParent().add(destinationPanel);
        sourcePanel.getParent().revalidate();
        sourcePanel.getParent().remove(sourcePanel);        
    }
}

