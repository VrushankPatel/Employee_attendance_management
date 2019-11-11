/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.io.*;
import org.json.*;  
import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.*; 

/**
 *
 * @author Vrushank
 */
public class temp {
    public static void main(String[] args) throws JSONException, FileNotFoundException, IOException, ParseException {
        // parsing file "JSONExample.json" 
        Object obj;         
        obj = new JSONParser().parse(new FileReader("Properties.json"));        
          
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
          
        // getting firstName and lastName 
        String firstName = (String) jo.get("firstName"); 
        String lastName = (String) jo.get("lastName"); 
          
        System.out.println(firstName); 
        System.out.println(lastName); 
          
        // getting age 
        long age = (long) jo.get("age"); 
        System.out.println(age); 
          
        // getting address 
        Map address = ((Map)jo.get("address")); 
          
        // iterating address Map 
        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
          
        // getting phoneNumbers 
        JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 
          
        // iterating phoneNumbers 
        Iterator itr2 = ja.iterator(); 
          
        while (itr2.hasNext())  
        { 
            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        } 
        /*JSONObject jo = new JSONObject(); 
          
        // putting data to JSONObject 
        jo.put("firstName", "Vrushank"); 
        jo.put("lastName", "Smith"); 
        jo.put("age", 25); 
          
        // for address data, first create LinkedHashMap 
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.put(m);        
          
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.put(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
          
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = new PrintWriter("Properties.json"); 
        pw.write(jo.toString()); 
          
        pw.flush(); 
        pw.close();*/
    }
}
