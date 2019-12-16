package com.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccessUtilities {
    static public Connection con;
    private static final String ID = Constants.DBUSERNAME;
    private static final String PASSWORD = Constants.DBPASSWORD;
    public static void connectToDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");                     
            con = DriverManager.getConnection("jdbc:mysql://@remotemysql.com:3306/51I7Tu9aQd",ID,PASSWORD);
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
