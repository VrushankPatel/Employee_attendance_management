package com.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccessUtilities {
    static public Connection con;
    private static final String ID = "vrushank.patel";
    private static final String PASSWORD = "capsys@123";
    public static void connectToDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vrushank_schema",ID,PASSWORD);
        }catch(SQLException  se){
            
        }catch(NullPointerException ne){
            
        }catch(Exception e){
            
        }
    }
    public static void closeConnection(){        
        try {   
            DBOperationUtilities.commonStatement.close();
            con.close();
        } catch (SQLException ex) {}        
    }
}
