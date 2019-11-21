package Utilities;

import EncryptionEngine.CryptoUtilitiy;
import Views.LoginPanel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperationUtilities {
    public PreparedStatement insertadmin,getadmin;
    DBAccessUtilities dbutil;
    CryptoUtilitiy crypto;
    public DBOperationUtilities(DBAccessUtilities dbtocken){
        dbutil = dbtocken;
        crypto = new CryptoUtilitiy();
        try{
            insertadmin = dbutil.con.prepareStatement("insert into Administrator (Admin_username,Admin_Password) values (?,?)");
            getadmin = dbutil.con.prepareStatement("select * from Administrator where Admin_username = ? and Admin_Password = ?");
        }catch(SQLException e){
            
        }catch(NullPointerException e){
            
        }
    }
    public String getLatestId(String username) {
        try{
            ResultSet rs = dbutil.st.executeQuery("select max("+(username=="Administrator" ? "Company" : "Employee")+"_id) from "+username);        
            while(rs.next()){
                int temp = rs.getInt(1);
                System.out.println(temp);
                return String.valueOf(temp+1);
            }
            return "0";        
        }catch(SQLException e){            
            return "Unable to fetch..";
        }catch(NullPointerException e){
            return "Unable to fetch..";
        }
    }
    public String insertEmployee(String username,String password){
        try{
            insertadmin.setString(1,username);
            insertadmin.setString(2,crypto.encrypt(password, username));
            insertadmin.execute();                
            return "success";                
        }catch(SQLIntegrityConstraintViolationException e){
            return "User Id already exists";
        }catch(Exception e){            
            return "Unable to insert data";                
        }
    }
    public String getAdmin(String username,String password){
        try {            
            getadmin.setString(1, username);
            getadmin.setString(2,crypto.encrypt(password, username));
            ResultSet result = getadmin.executeQuery();                       
            while(result.next()){
                System.out.println("Logged in as : "+result.getString(1));
                return "success";
            }
            System.out.println("No Administrator found with entered credentials");
            return "No Administrator found with entered credentials";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "No Administrator found with entered credentials";
        }            
    }
}
