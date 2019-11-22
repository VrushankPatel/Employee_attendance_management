package Utilities;

import EncryptionEngine.CryptoUtilitiy;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;

public class DBOperationUtilities {
    public PreparedStatement insertadmin,getadmin,markattendance;
    DBAccessUtilities dbutil;
    CryptoUtilitiy crypto;
    public DBOperationUtilities(DBAccessUtilities dbtocken){
        dbutil = dbtocken;
        crypto = new CryptoUtilitiy();
        try{
            insertadmin = dbutil.con.prepareStatement("insert into Administrator (Admin_username,Admin_Password) values (?,?)");
            getadmin = dbutil.con.prepareStatement("select * from Administrator where Admin_username = ? and Admin_Password = ?");
            markattendance = dbutil.con.prepareStatement("replace into Attendance values(?,?,?,?)");
        }catch(SQLException e){
            System.out.println(e.toString());
        }catch(NullPointerException e){}
    }
    public String insertEmployee(String username,String password){
        try{
            insertadmin.setString(1,username);
            insertadmin.setString(2,crypto.encrypt(password, username));
            insertadmin.execute();                
            return "success";                
        }catch(SQLIntegrityConstraintViolationException e){
            return "User Id already exists";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
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
                SessionUtilities.companyidloggedin = result.getInt(1);
                SessionUtilities.useridloggedin = result.getString(2);
                return "success";
            }
            return "No Administrator found with entered credentials";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch (Exception e) {
            return "No Administrator found with entered credentials";
        }                    
    }
    public String markAttendance(String employeeid,String date,String attendanceStatus){
        try {    
            markattendance.setInt(1,2);
            markattendance.setInt(2,Integer.parseInt(employeeid));
            markattendance.setString(3, date);
            markattendance.setString(4, attendanceStatus);      
            markattendance.executeUpdate();
            return "success";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch (Exception e) {
            System.out.println(e.getClass());
            return "No Employee found with entered credentials";
        }                    
    }
}
