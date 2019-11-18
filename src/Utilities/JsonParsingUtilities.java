package Utilities;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.*; 

public class JsonParsingUtilities {    
    JSONObject jsonObject;
    public JsonParsingUtilities(String filename){
        try{
            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(filename));                         
        }catch(FileNotFoundException fe){}catch(IOException ioe){}catch(ParseException pe){}
    }
    public Object getProperty(String propertyname){
        try {            
            System.out.println(this.jsonObject.get(propertyname).getClass());
            return this.jsonObject.get(propertyname);
            //System.out.println("Name: " + jsonObject.get("firstName").toString());
            //System.out.println("Author: " + jsonObject.get("lastName").toString());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
