package com.utilities;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class UIColorUtilities {
    private static JsonParsingUtilities json; 
    public Color primarytextcolor,headpanelandhovercolor,bodypanelcolor,initialColor,initialBorder;
    public UIColorUtilities() throws Exception {
        json = new JsonParsingUtilities("Properties.json");                                 
        primarytextcolor = getColorProperty("PrimaryTextColor");
        headpanelandhovercolor = getColorProperty("HeadPanelandhovercolor");
        bodypanelcolor = getColorProperty("BodyPanelColor");  
        initialColor = getColorProperty("InititalColor");         
        initialBorder = getColorProperty("InititalBorder");            
    }
    
    public Color getColorProperty(String propertyname) throws IOException,FileNotFoundException, ParseException{
        try{                        
            return getColorAndSet(propertyname);
        }catch(Exception e){            
            json.restoreDefaults();   
            return getColorAndSet(propertyname);            
        }
    }    
    private static Color getColorAndSet(String propertyname){
        int R = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("R").toString());
        int G = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("G").toString());
        int B = Integer.parseInt(((JSONObject)(json.getProperty(propertyname))).get("B").toString());        
        R = (R>=0 && R<=255) ? R : 255;
        G = (G>=0 && G<=255) ? G : 255;
        B = (B>=0 && B<=255) ? B : 255;
        return new Color(R,G,B);
    }
}
