package com.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccessUtilities {
    static public Connection con;
    private static final String id = "vrushank.patel";
    private static final String password = "capsys@123";
    public static void connectToDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vrushank_schema",id,password);
        }catch(SQLException  se){
            
        }catch(NullPointerException ne){
            
        }catch(Exception e){
            
        }
    }
    public static void closeConnection(){        
        try {   
            con.close();
        } catch (SQLException ex) {}        
    }
}
