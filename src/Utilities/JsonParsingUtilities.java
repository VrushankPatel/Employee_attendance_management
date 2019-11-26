package Utilities;
import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import org.json.simple.JSONObject;
import org.json.simple.parser.*; 

public class JsonParsingUtilities {    
    JSONObject jsonObject,jsonObject2;
    public JsonParsingUtilities(String filename){
        try{
            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(filename));                         
        }catch(FileNotFoundException fe){}catch(IOException ioe){}catch(ParseException pe){}
    }
    public Object getProperty(String propertyname){         
        return this.jsonObject.get(propertyname);            
    }    
    public String[] getKeys(String filename) throws FileNotFoundException, IOException, ParseException{
        jsonObject2 = (JSONObject) new JSONParser().parse(new FileReader(filename));    
        Set keyset = jsonObject2.keySet();
        for(Object i:keyset){
            System.out.println(i.toString());
        }
        String[] keys = new String[jsonObject2.keySet().size()];        
        int index = 0;
        for(Object i : keyset){
            keys[index] = i.toString();
            index++;
        }
        return keys;
    }
}
