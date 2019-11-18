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
        return this.jsonObject.get(propertyname);            
    }    
    
}
