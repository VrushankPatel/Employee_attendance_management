package Utilities;

import java.awt.*;
import org.json.simple.JSONObject;

public class UIColorUtilities {
    private final JsonParsingUtilities json; 
    public Color primarytextcolor,headpanelandhovercolor,bodypanelcolor,initialColor,initialBorder;
    public UIColorUtilities() {
        json = new JsonParsingUtilities("Properties.json");                                 
        primarytextcolor = getColorProperty("PrimaryTextColor");
        headpanelandhovercolor = getColorProperty("HeadPanelandhovercolor");
        bodypanelcolor = getColorProperty("BodyPanelColor");  
        initialColor = getColorProperty("InititalColor");         
        initialBorder = getColorProperty("InititalBorder");         
    }
    
    public Color getColorProperty(String propertyname){
        int R = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("R").toString());
        int G = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("G").toString());
        int B = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("B").toString());        
        R = (R>=0 && R<=255) ? R : 255;
        G = (G>=0 && G<=255) ? G : 255;
        B = (B>=0 && B<=255) ? B : 255;
        return new Color(R,G,B);
    }       
}
