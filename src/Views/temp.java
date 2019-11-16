package Views;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.*; 

public class temp {
    public static void main(String[] args){
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader("Properties.json"));                         
            System.out.println("Name: " + jsonObject.get("firstName").toString());
            System.out.println("Author: " + jsonObject.get("lastName").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
