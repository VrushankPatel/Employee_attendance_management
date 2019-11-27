package Utilities;
import java.io.*;
import java.util.ArrayList;
import java.util.Set;
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
    public String[] getKeys(String filename) throws FileNotFoundException, IOException, ParseException{
        Set keyset = jsonObject.keySet();
        for(Object i:keyset){
            System.out.println(i.toString());
        }
        String[] keys = new String[jsonObject.keySet().size()];        
        int index = 0;
        for(Object i : keyset){
            keys[index] = i.toString();
            index++;
        }
        return keys;
    }
    public int setValue(String propertyname,final int R,final int G,final int B) throws Exception{              
        JsonParsingUtilities json = new JsonParsingUtilities("Properties.json");
        JSONObject temp = (JSONObject)(json.getProperty(propertyname));
        temp.put("R", R);
        temp.put("G", G);
        temp.put("B", B);
        jsonObject.put(propertyname,temp);
        System.out.println(jsonObject.toJSONString());
        System.out.println("Utilities.JsonParsingUtilities.setValue()fdsa7");
        try (FileWriter file = new FileWriter("Properties.json")) {
            file.write(jsonObject.toJSONString());
        }     
        return 1;
    }
    public void restoreDefaults() throws FileNotFoundException, IOException, ParseException{                
        try (FileWriter file = new FileWriter("Properties.json")) {
            file.write("{\"PrimaryTextColor\":{\"R\":255,\"G\":255,\"B\":255},\"HeadPanelandhovercolor\":{\"R\":248,\"G\":148,\"B\":6},\"BodyPanelColor\":{\"R\":44,\"G\":62,\"B\":80},\"InititalColor\":{\"R\":255,\"G\":255,\"B\":255},\"InititalBorder\":{\"R\":192,\"G\":192,\"B\":192},}");       
            file.close();
        }             
    }
}
