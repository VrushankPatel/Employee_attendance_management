package com.utilities;

import java.awt.Component;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class UIComponentUtilities {
    private final JsonParsingUtilities json; 
    public UIColorUtilities colorutil;
    public UIComponentUtilities() {
        try{
            colorutil = new UIColorUtilities();
        }catch(Exception e){}
        json = new JsonParsingUtilities("Properties.json");                                 
    }            
    public void actionClose(java.awt.event.MouseEvent evt){
        SessionUtilities.invalidateSession();
        System.exit(0);
    }
    public void actionMinimize(JFrame frame){
        frame.setState(JFrame.ICONIFIED);
    }
    public void onHoverTitleBarButtons(java.awt.event.MouseEvent evt) {  
        ((JLabel)(evt.getSource())).setForeground(((JLabel)(evt.getSource())).getForeground().toString().equals(colorutil.primarytextcolor.toString()) ? colorutil.bodypanelcolor : colorutil.primarytextcolor);
    } 
    public void onFocusTextFields(JTextField textfield) {                                 
        textfield.setText(textfield.isFocusOwner() ? (textfield.getText()).equals(textfield.getToolTipText()) ? "" : textfield.getText() : (textfield.getText()).isEmpty() ? textfield.getToolTipText() : textfield.getText());
    }
    public void hoverGeneralButtonicPanels(JPanel panel) {
        panel.setBorder(((LineBorder)(panel.getBorder())).getLineColor().toString().equals(colorutil.initialBorder.toString()) ? javax.swing.BorderFactory.createLineBorder(colorutil.headpanelandhovercolor) : javax.swing.BorderFactory.createLineBorder(colorutil.initialBorder));        
        for(Component j : panel.getComponents()){
            if(j instanceof JLabel){
                ((JLabel)j).setForeground((((JLabel)j).getForeground()).toString().equals(colorutil.initialColor.toString()) ? colorutil.headpanelandhovercolor : colorutil.initialColor);
            }            
        }
    }
    public void backHover(java.awt.event.MouseEvent evt){        
        ((JLabel)(evt.getSource())).setIcon((((JLabel)(evt.getSource())).getIcon().toString()).equals(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-left_4.png")).toString()) ? new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-left_4_1.png")) : new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-left_4.png"))); // NOI18N                
        ((JLabel)(evt.getSource())).setForeground(((JLabel)(evt.getSource())).getForeground().toString().equals(colorutil.primarytextcolor.toString()) ? colorutil.headpanelandhovercolor : colorutil.primarytextcolor);        
    }
    public void switchFromTo(JPanel sourcePanel,JPanel destinationPanel){
        sourcePanel.setVisible(false);
        sourcePanel.getParent().add(destinationPanel);
        sourcePanel.getParent().revalidate();
        sourcePanel.getParent().remove(sourcePanel);        
    }
}

