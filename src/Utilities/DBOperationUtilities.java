package Utilities;

import EncryptionEngine.CryptoUtilitiy;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;

public class DBOperationUtilities {
    public PreparedStatement insertadmin,getadmin,markattendance,addEmployee,deleteEmployee,modifyEmployee,getEmployee,isEmployeeExists,getAttendanceFromTo,getPresentDays;
    DBAccessUtilities dbutil;
    CryptoUtilitiy crypto;
    public DBOperationUtilities(DBAccessUtilities dbtocken){
        dbutil = dbtocken;
        crypto = new CryptoUtilitiy();
        try{
            insertadmin = dbutil.con.prepareStatement("insert into Administrator (Admin_username,Admin_Password) values (?,?)");
            getadmin = dbutil.con.prepareStatement("select * from Administrator where Admin_username = ? and Admin_Password = ?");
            markattendance = dbutil.con.prepareStatement("replace into Attendance values(?,?,?,?)");
            addEmployee = dbutil.con.prepareStatement("insert into Employee values(?,?,?,?,?)");
            getEmployee = dbutil.con.prepareStatement("select Emp_full_name,Emp_address,Emp_phone from Employee where Employee_Company_id = ? and Employee_id = ?");
            modifyEmployee = dbutil.con.prepareStatement("update Employee set Emp_full_name = ?, Emp_address = ?, Emp_phone = ? where Employee_id = ? and Employee_Company_id = ?");
            deleteEmployee = dbutil.con.prepareStatement("delete from Employee where Employee_Company_id = ? and Employee_id = ?");
            isEmployeeExists = dbutil.con.prepareStatement("select count(*) from Employee where Employee_id = ? and Employee_Company_id = ?");
            getAttendanceFromTo = dbutil.con.prepareStatement("select attendance_date,attendance_status from Attendance where Attendance_Employee_Company_Id = ? and Attendance_Employee_Id = ? and attendance_date between ? and ? order by attendance_date");
            getPresentDays = dbutil.con.prepareStatement("select count(*) from Attendance where attendance_status = \"PRESENT\" and Attendance_Employee_Company_Id = ? and Attendance_Employee_Id = ? and attendance_date between ? and ?");
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
                SessionUtilities.validateSession(result.getInt(1), result.getString(2));                
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
            markattendance.setInt(1,SessionUtilities.companyidloggedin);
            markattendance.setLong(2,Long.parseLong(employeeid));
            markattendance.setString(3, date);
            markattendance.setString(4, attendanceStatus);                 
            return markattendance.executeUpdate()>0 ? "success" : "No Employee found with entered credentials";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch(NumberFormatException e){
           return "Employee Id should be a number";
        }catch (Exception e) {
            System.out.println(e.getClass());
            return "No Employee found with entered credentials";
        }                    
    }
    public String addEmployee(String name,String address,String id,String phone){
        try {    
            addEmployee.setInt(1,SessionUtilities.companyidloggedin);
            addEmployee.setLong(2,Long.parseLong(id));
            addEmployee.setString(3, name);
            addEmployee.setString(4, address); 
            addEmployee.setLong(5, Long.parseLong(phone)); 
            addEmployee.executeUpdate();
            return "success";
        }catch(SQLIntegrityConstraintViolationException e){
            return "Employee id already exists";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch(NumberFormatException e){
           return "Employee Id should be a number";
        }catch (Exception e) {
            System.out.println(e.getClass());
            return "Unable to add employee";
        }
    }
    public String deleteEmployee(String employeeId){
        try {    
            deleteEmployee.setInt(1,SessionUtilities.companyidloggedin);
            deleteEmployee.setLong(2,Long.parseLong(employeeId));           
            int result = deleteEmployee.executeUpdate();            
            return result > 0 ? "success" : "No Employee found with entered credentials";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch(NumberFormatException e){
           return "Employee Id should be a number";
        }catch (Exception e) {
            System.out.println(e.getClass());
            return "No employee data found";
        }
    }
    public ResultSet getEmployee(String employeeId){
        try{
            getEmployee.setInt(1,SessionUtilities.companyidloggedin);
            getEmployee.setLong(2,Long.parseLong(employeeId));
            return getEmployee.executeQuery();
        }catch(Exception e){
            return null;
        }
    }
    public String modifyEmployee(String name,String address,String id,String phone){
        try {                
            modifyEmployee.setString(1, name);
            modifyEmployee.setString(2, address); 
            modifyEmployee.setLong(3, Long.parseLong(phone)); 
            modifyEmployee.setInt(5,SessionUtilities.companyidloggedin);
            modifyEmployee.setLong(4,Long.parseLong(id));            
            int result = modifyEmployee.executeUpdate();
            System.out.println(result);
            return result > 0 ? "success" : "Unable to modify employee";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch (Exception e) {
            System.out.println(e.getClass());
            return "Unable to modify employee";
        }
    }
    public String isEmployeeExists(String Emp_Id){
        try{
            isEmployeeExists.setLong(1,Long.parseLong(Emp_Id));
            isEmployeeExists.setInt(2,SessionUtilities.companyidloggedin);
            System.out.println(isEmployeeExists.toString());
            ResultSet result = isEmployeeExists.executeQuery();
            result.next();            
            return result.getInt(1)==1 ? "Success" : "Employee Not Found";
        }catch(CommunicationsException | NullPointerException e){
           return "Database communication link failure";
        }catch (Exception e) {
            return "Unable to generate report";
        }
    }
    public ResultSet getReportFromToDate(String employeeId,String startDate,String endDate){        
        try{
            getAttendanceFromTo.setInt(1,SessionUtilities.companyidloggedin);
            getAttendanceFromTo.setString(2,employeeId);
            getAttendanceFromTo.setString(3, startDate);
            getAttendanceFromTo.setString(4, endDate);
            ResultSet result = getAttendanceFromTo.executeQuery();
            return result;
        }catch(Exception e){
            return null;
        }
    }
    public int getPresentDays(String employeeId,String startDate,String endDate){
        try{
            getPresentDays.setInt(1,SessionUtilities.companyidloggedin);
            getPresentDays.setString(2,employeeId);
            getPresentDays.setString(3, startDate);
            getPresentDays.setString(4, endDate);
            ResultSet result = getPresentDays.executeQuery();
            System.out.println(getPresentDays.toString());
            if(result.next()){
                return result.getInt(1);
            }
            return 0;
        }catch(Exception e){
            return 0;
        }
    }
}
