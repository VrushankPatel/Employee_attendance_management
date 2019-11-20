package Utilities;

import java.awt.Component;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class UIComponentUtilities {
    private final JsonParsingUtilities json; 
    public UIColorUtilities colorutil = new UIColorUtilities();
    public UIComponentUtilities() {
        json = new JsonParsingUtilities("Properties.json");                                 
    }            
    public void actionClose(java.awt.event.MouseEvent evt){
        System.exit(0);
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
    public void switchFromTo(JPanel sourcePanel,JPanel destinationPanel){
        sourcePanel.setVisible(false);
        sourcePanel.getParent().add(destinationPanel);
        sourcePanel.getParent().revalidate();
        sourcePanel.getParent().remove(sourcePanel);        
    }
}

