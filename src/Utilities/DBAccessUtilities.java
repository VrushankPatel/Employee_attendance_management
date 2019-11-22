package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccessUtilities {
    public Connection con;
    
    public DBAccessUtilities() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vrushank_schema","vrushank.patel","capsys@123");
        }catch(SQLException | ClassNotFoundException se){
            
        }catch(NullPointerException ne){
            
        }catch(Exception e){
            
        }
    }            
}
