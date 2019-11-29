package com.utilities;

import com.encryptionengine.CryptoUtilitiy;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import com.pojo.DeleteEmployeePojo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Logger;

public class DBOperationUtilities {
    static final Logger logger = Logger.getLogger(DBOperationUtilities.class.getName());    
    public static PreparedStatement commonStatement;
    CryptoUtilitiy crypto;    
    
    public DBOperationUtilities(){
        crypto = new CryptoUtilitiy();  
        DBAccessUtilities.connectToDatabase();
    }
    public String insertEmployee(String username,String password){
        try{
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.INSERTADMIN);
            commonStatement.setString(1,username);
            commonStatement.setString(2,crypto.encrypt(password, username));
            commonStatement.execute();               
            return Constants.SUCCESS;                
        }catch(SQLIntegrityConstraintViolationException e){
            logger.severe(e.getMessage());
            return Constants.USERIDEXISTS;
        }catch(CommunicationsException | NullPointerException e){
            logger.severe(e.getMessage());
            return Constants.DBLINKERROR;
        }catch(Exception e){            
            logger.severe(e.getMessage());
            return Constants.INSERTIONERROR;
        }finally{
            
        }
    }
    public String getAdmin(String username,String password){
        try {            
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.GETADMIN);
            commonStatement.setString(1, username);
            commonStatement.setString(2,crypto.encrypt(password, username));
            ResultSet result = commonStatement.executeQuery();                       
            while(result.next()){
                SessionUtilities.validateSession(result.getInt(1), result.getString(2));                
                return Constants.SUCCESS;                
            }
            return Constants.NOADMINFOUND;
        }catch(CommunicationsException | NullPointerException e){
            logger.severe(e.getMessage());
           return Constants.DBLINKERROR;
        }catch (Exception e) {
            logger.severe(e.getMessage());            
            return Constants.NOADMINFOUND;
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {
                logger.severe(ex.getMessage());            
            }
        }                    
    }
    public String markAttendance(String employeeid,String date,String attendanceStatus){
        try {    
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.MARKATTENDANCE);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setLong(2,Long.parseLong(employeeid));
            commonStatement.setString(3, date);
            commonStatement.setString(4, attendanceStatus);                 
            return commonStatement.executeUpdate()>0 ? Constants.SUCCESS : Constants.NOEMPLOYEEFOUND;
        }catch(CommunicationsException | NullPointerException e){
           return Constants.DBLINKERROR;
        }catch(NumberFormatException e){
           return Constants.EMPLOYEEIDNOTANUMBER;
        }catch (Exception e) {
            return Constants.NOEMPLOYEEFOUND;
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {
                logger.severe(ex.getMessage());
            }
        }
    }
    public String addEmployee(String name,String address,String id,String phone){
        try {
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.ADDEMPLOYEE);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setLong(2,Long.parseLong(id));
            commonStatement.setString(3, name);
            commonStatement.setString(4, address); 
            commonStatement.setLong(5, Long.parseLong(phone)); 
            commonStatement.executeUpdate();
            return Constants.SUCCESS;
        }catch(SQLIntegrityConstraintViolationException e){
            return Constants.USERIDEXISTS;
        }catch(CommunicationsException | NullPointerException e){
           return Constants.DBLINKERROR;
        }catch(NumberFormatException e){
           return Constants.EMPLOYEEIDNOTANUMBER;
        }catch (Exception e) {
            return Constants.INSERTIONERROR;
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {}
        }
    }
    public String deleteEmployee(DeleteEmployeePojo pojo){
        try {    
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.DELETEEMPLOYEE);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setLong(2,Long.parseLong(pojo.getEmployeeID()));           
            int result = commonStatement.executeUpdate();            
            return result > 0 ? Constants.SUCCESS : Constants.NOEMPLOYEEFOUND;
        }catch(CommunicationsException | NullPointerException e){            
           return Constants.DBLINKERROR;
        }catch(NumberFormatException e){
           return Constants.EMPLOYEEIDNOTANUMBER;
        }catch (Exception e) {
            return Constants.NOEMPLOYEEFOUND;
        }
    }
    public ResultSet getEmployee(String employeeId) throws SQLException{        
        commonStatement = DBAccessUtilities.con.prepareStatement(Constants.GETEMPLOYEE);
        commonStatement.setInt(1,SessionUtilities.companyidloggedin);
        commonStatement.setLong(2,Long.parseLong(employeeId));
        return commonStatement.executeQuery();        
    }
    public String modifyEmployee(String name,String address,String id,String phone){
        try {             
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.MODIFYEMPLOYEE);
            commonStatement.setString(1, name);
            commonStatement.setString(2, address); 
            commonStatement.setLong(3, Long.parseLong(phone)); 
            commonStatement.setInt(5,SessionUtilities.companyidloggedin);
            commonStatement.setLong(4,Long.parseLong(id));            
            int result = commonStatement.executeUpdate();
            return result > 0 ? Constants.SUCCESS : Constants.MODIFYERROR;
        }catch(CommunicationsException | NullPointerException e){
            return Constants.DBLINKERROR;
        }catch (Exception e) {
            return Constants.MODIFYERROR;
        }
    }
    public String isEmployeeExists(String Emp_Id){
        try{
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.ISEMPLOYEEEXISTS);
            commonStatement.setLong(1,Long.parseLong(Emp_Id));
            commonStatement.setInt(2,SessionUtilities.companyidloggedin);
            ResultSet result = commonStatement.executeQuery();
            result.next();            
            return result.getInt(1)==1 ? Constants.SUCCESS : Constants.NOEMPLOYEEFOUND;
        }catch (Exception e) {
            return Constants.DBLINKERROR;
        }
    }
    public ResultSet getReportFromToDate(String employeeId,String startDate,String endDate) throws SQLException{                
            commonStatement = DBAccessUtilities.con.prepareStatement(Constants.GETATTENDANCEFROMTO);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setString(2,employeeId);
            commonStatement.setString(3, startDate);
            commonStatement.setString(4, endDate);
            ResultSet result = commonStatement.executeQuery();
            return result;                            
    }
    public int getPresentDays(String employeeId,String startDate,String endDate) throws SQLException{        
        commonStatement = DBAccessUtilities.con.prepareStatement(Constants.GETPRESENTDAYS);
        commonStatement.setInt(1,SessionUtilities.companyidloggedin);
        commonStatement.setString(2,(employeeId));
        commonStatement.setString(3, startDate);
        commonStatement.setString(4, endDate);
        ResultSet result = commonStatement.executeQuery();            
        if(result.next()){                
            return result.getInt(1);
        }
        return 0;
    }
    public ResultSet getOverallAttendance(String employeeId) throws SQLException{        
        commonStatement = DBAccessUtilities.con.prepareStatement(Constants.OVERALLATTENDANCE);
        commonStatement.setInt(1,SessionUtilities.companyidloggedin);
        commonStatement.setLong(2,Long.parseLong(employeeId));            
        ResultSet result = commonStatement.executeQuery();
        return result;        
    }
}
