package com.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccessUtilities {
    static public Connection con;
    private final String id = "vrushank.patel";
    private final String password = "capsys@123";
    public DBAccessUtilities() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vrushank_schema",id,password);
        }catch(SQLException | ClassNotFoundException se){
            
        }catch(NullPointerException ne){
            
        }catch(Exception e){
            
        }
    }            
}
