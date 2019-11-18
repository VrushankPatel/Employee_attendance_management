package Utilities;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.json.simple.JSONObject;

public class UIComponentUtilities {
    public Color primarytextcolor,headpanelcolor,bodypanelcolor;
    private JsonParsingUtilities json; 
    public UIComponentUtilities() {
        json = new JsonParsingUtilities("Properties.json");                 
        primarytextcolor = getColorProperty("PrimaryTextColor");
        headpanelcolor = getColorProperty("HeadPanelColor");
        bodypanelcolor = getColorProperty("BodyPanelColor");        
    }
    private Color getColorProperty(String propertyname){
        int R = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("R").toString());
        int G = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("G").toString());
        int B = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("B").toString());        
        R = (R>=0 && R<=255) ? R : 255;
        G = (G>=0 && G<=255) ? G : 255;
        B = (B>=0 && B<=255) ? B : 255;
        return new Color(R,G,B);
    }       
    public void actionClose(java.awt.event.MouseEvent evt){
        System.exit(0);
    }
    public void onHoverTitleBarButtons(java.awt.event.MouseEvent evt) {  
        ((JLabel)(evt.getSource())).setForeground(((JLabel)(evt.getSource())).getForeground().toString().equals("java.awt.Color[r=255,g=255,b=255]") ? Color.BLACK : Color.WHITE);
    } 
    public void onFocusTextFields(JTextField textfield) {                                 
        textfield.setText(textfield.isFocusOwner() ? (textfield.getText()).equals(textfield.getToolTipText()) ? "" : textfield.getText() : (textfield.getText()).isEmpty() ? textfield.getToolTipText() : textfield.getText());
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

