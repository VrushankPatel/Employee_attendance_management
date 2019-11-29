package com.utilities;

import com.encryptionengine.CryptoUtilitiy;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperationUtilities {
    static final Logger logger = Logger.getLogger(DBOperationUtilities.class.getName());
    private static String insertadmin;
    private static String getadmin;
    private static String markattendance;
    private static String addEmployee;
    private static String deleteEmployee;
    private static String modifyEmployee;
    private static String getEmployee;
    private static String isEmployeeExists;
    private static String getAttendanceFromTo; 
    private static String getPresentDays;
    private static String overallAttendance;    
    private static PreparedStatement commonStatement;
    CryptoUtilitiy crypto;    
    
    public DBOperationUtilities(){
        crypto = new CryptoUtilitiy();        
        insertadmin = "insert into Administrator (Admin_username,Admin_Password) values (?,?)";        
        getadmin = "select * from Administrator where Admin_username = ? and Admin_Password = ?";
        markattendance = "replace into Attendance values(?,?,?,?)";
        addEmployee = "insert into Employee values(?,?,?,?,?)";
        getEmployee = "select Emp_full_name,Emp_address,Emp_phone from Employee where Employee_Company_id = ? and Employee_id = ?";
        modifyEmployee = "update Employee set Emp_full_name = ?, Emp_address = ?, Emp_phone = ? where Employee_id = ? and Employee_Company_id = ?";
        deleteEmployee = "delete from Employee where Employee_Company_id = ? and Employee_id = ?";
        isEmployeeExists = "select count(*) from Employee where Employee_id = ? and Employee_Company_id = ?";
        getAttendanceFromTo = "select attendance_date,attendance_status from Attendance where Attendance_Employee_Company_Id = ? and Attendance_Employee_Id = ? and attendance_date between ? and ? order by attendance_date";
        getPresentDays = "select count(*) from Attendance where attendance_status = \"PRESENT\" and Attendance_Employee_Company_Id = ? and Attendance_Employee_Id = ? and attendance_date between ? and ?";
        overallAttendance = "select attendance_date,attendance_status from Attendance where Attendance_Employee_Company_id = ? and Attendance_Employee_id = ? order by attendance_date";
        DBAccessUtilities.connectToDatabase();
    }
    public String insertEmployee(String username,String password){
        try{
            commonStatement = DBAccessUtilities.con.prepareStatement(insertadmin);
            commonStatement.setString(1,username);
            commonStatement.setString(2,crypto.encrypt(password, username));
            commonStatement.execute();               
            return "success";                
        }catch(SQLIntegrityConstraintViolationException e){
            logger.log(Level.SEVERE,"SQL integrity violated",e);
            return "User Id already exists";
        }catch(CommunicationsException | NullPointerException e){
           logger.log(Level.SEVERE,"Communication unsuccessful and may be num pointer detected.",e);
           return "Database communication link failure";
        }catch(Exception e){            
            logger.log(Level.SEVERE,"unknown exception",e);
            return "Unable to insert data";                
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {}
        }
    }
    public String getAdmin(String username,String password){
        try {            
            commonStatement = DBAccessUtilities.con.prepareStatement(getadmin);
            commonStatement.setString(1, username);
            commonStatement.setString(2,crypto.encrypt(password, username));
            ResultSet result = commonStatement.executeQuery();                       
            while(result.next()){
                SessionUtilities.validateSession(result.getInt(1), result.getString(2));                
                return "success";
            }
            return "No Administrator found with entered credentials";
        }catch(CommunicationsException | NullPointerException e){
            logger.log(Level.INFO,"Communication unsuccessful and may be numm pointer detected.",e);
           return "Database communication link failure";
        }catch (Exception e) {
            logger.log(Level.SEVERE,"unknown exception",e);
            return "No Administrator found with entered credentials";
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {}
        }                    
    }
    public String markAttendance(String employeeid,String date,String attendanceStatus){
        try {    
            commonStatement = DBAccessUtilities.con.prepareStatement(markattendance);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setLong(2,Long.parseLong(employeeid));
            commonStatement.setString(3, date);
            commonStatement.setString(4, attendanceStatus);                 
            return commonStatement.executeUpdate()>0 ? "success" : "No Employee found with entered credentials";
        }catch(CommunicationsException | NullPointerException e){
           logger.log(Level.SEVERE,"Communication unsuccessfull and may be numm pointer detected.",e);
           return "Database communication link failure";
        }catch(NumberFormatException e){
            logger.log(Level.SEVERE,"Number format exception.",e);
           return "Employee Id should be a number";
        }catch (Exception e) {
            logger.log(Level.SEVERE,"unknown exception",e);
            return "No Employee found with entered credentials";
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {}
        }
    }
    public String addEmployee(String name,String address,String id,String phone){
        try {
            commonStatement = DBAccessUtilities.con.prepareStatement(addEmployee);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setLong(2,Long.parseLong(id));
            commonStatement.setString(3, name);
            commonStatement.setString(4, address); 
            commonStatement.setLong(5, Long.parseLong(phone)); 
            commonStatement.executeUpdate();
            return "success";
        }catch(SQLIntegrityConstraintViolationException e){
            logger.log(Level.SEVERE,"SQL integrity violated",e);
            return "Employee id already exists";
        }catch(CommunicationsException | NullPointerException e){
           logger.log(Level.SEVERE,"Communication unsuccessfull and may be numm pointer detected.",e);
           return "Database communication link failure";
        }catch(NumberFormatException e){
            logger.log(Level.SEVERE,"Number format exception.",e);
           return "Employee Id should be a number";
        }catch (Exception e) {
            logger.log(Level.SEVERE,"unknown exception",e);
            return "Unable to add employee";
        }finally{
            try {
                commonStatement.close();
            } catch (SQLException ex) {}
        }
    }
    public String deleteEmployee(String employeeId){
        try {    
            commonStatement = DBAccessUtilities.con.prepareStatement(deleteEmployee);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setLong(2,Long.parseLong(employeeId));           
            int result = commonStatement.executeUpdate();            
            return result > 0 ? "success" : "No Employee found with entered credentials";
        }catch(CommunicationsException | NullPointerException e){            
            logger.log(Level.SEVERE,"Communication unsuccessfull and may be numm pointer detected.",e);
           return "Database communication link failure";
        }catch(NumberFormatException e){
            logger.log(Level.SEVERE,"Number format exception.",e);
           return "Employee Id should be a number";
        }catch (Exception e) {
            logger.log(Level.SEVERE,"unknown exception",e);
            return "No employee data found";
        }
    }
    public ResultSet getEmployee(String employeeId) throws SQLException{        
        commonStatement = DBAccessUtilities.con.prepareStatement(getEmployee);
        commonStatement.setInt(1,SessionUtilities.companyidloggedin);
        commonStatement.setLong(2,Long.parseLong(employeeId));
        return commonStatement.executeQuery();        
    }
    public String modifyEmployee(String name,String address,String id,String phone){
        try {             
            commonStatement = DBAccessUtilities.con.prepareStatement(modifyEmployee);
            commonStatement.setString(1, name);
            commonStatement.setString(2, address); 
            commonStatement.setLong(3, Long.parseLong(phone)); 
            commonStatement.setInt(5,SessionUtilities.companyidloggedin);
            commonStatement.setLong(4,Long.parseLong(id));            
            int result = commonStatement.executeUpdate();
            return result > 0 ? "success" : "Unable to modify employee";
        }catch(CommunicationsException | NullPointerException e){
            logger.log(Level.SEVERE,"Communication unsuccessfull and may be numm pointer detected.",e);
            return "Database communication link failure";
        }catch (Exception e) {
            logger.log(Level.SEVERE,"unknown exception",e);
            return "Unable to modify employee";
        }
    }
    public String isEmployeeExists(String Emp_Id){
        try{
            commonStatement = DBAccessUtilities.con.prepareStatement(isEmployeeExists);
            commonStatement.setLong(1,Long.parseLong(Emp_Id));
            commonStatement.setInt(2,SessionUtilities.companyidloggedin);
            ResultSet result = commonStatement.executeQuery();
            result.next();            
            return result.getInt(1)==1 ? "Success" : "Employee Not Found";
        }catch (Exception e) {
            logger.log(Level.SEVERE,"unknown exception",e);
            return "Database communication link failure";
        }
    }
    public ResultSet getReportFromToDate(String employeeId,String startDate,String endDate) throws SQLException{                
            commonStatement = DBAccessUtilities.con.prepareStatement(getAttendanceFromTo);
            commonStatement.setInt(1,SessionUtilities.companyidloggedin);
            commonStatement.setString(2,employeeId);
            commonStatement.setString(3, startDate);
            commonStatement.setString(4, endDate);
            ResultSet result = commonStatement.executeQuery();
            return result;                            
    }
    public int getPresentDays(String employeeId,String startDate,String endDate) throws SQLException{        
        commonStatement = DBAccessUtilities.con.prepareStatement(getPresentDays);
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
        commonStatement = DBAccessUtilities.con.prepareStatement(overallAttendance);
        commonStatement.setInt(1,SessionUtilities.companyidloggedin);
        commonStatement.setLong(2,Long.parseLong(employeeId));            
        ResultSet result = commonStatement.executeQuery();
        return result;        
    }
}
