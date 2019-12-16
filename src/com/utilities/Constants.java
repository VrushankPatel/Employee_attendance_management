package com.utilities;
public class Constants {
    // Prepared statememnts
    public static final String INSERTADMIN = "insert into Administrator (Admin_username,Admin_Password) values (?,?)";        
    public static final String GETADMIN = "select * from Administrator where Admin_username = ? and Admin_Password = ?";
    public static final String MARKATTENDANCE = "replace into Attendance values(?,?,?,?)";
    public static final String ADDEMPLOYEE = "insert into Employee values(?,?,?,?,?)";
    public static final String DELETEEMPLOYEE = "delete from Employee where Employee_Company_id = ? and Employee_id = ?";
    public static final String MODIFYEMPLOYEE = "update Employee set Emp_full_name = ?, Emp_address = ?, Emp_phone = ? where Employee_id = ? and Employee_Company_id = ?";
    public static final String GETEMPLOYEE = "select Emp_full_name,Emp_address,Emp_phone from Employee where Employee_Company_id = ? and Employee_id = ?";
    public static final String ISEMPLOYEEEXISTS = "select count(*) from Employee where Employee_id = ? and Employee_Company_id = ?";
    public static final String GETATTENDANCEFROMTO = "select attendance_date,attendance_status from Attendance where Attendance_Employee_Company_Id = ? and Attendance_Employee_Id = ? and attendance_date between ? and ? order by attendance_date"; 
    public static final String GETPRESENTDAYS = "select count(*) from Attendance where attendance_status = \"PRESENT\" and Attendance_Employee_Company_Id = ? and Attendance_Employee_Id = ? and attendance_date between ? and ?";
    public static final String OVERALLATTENDANCE = "select attendance_date,attendance_status from Attendance where Attendance_Employee_Company_id = ? and Attendance_Employee_id = ? order by attendance_date";    
    public static final String EMPLOYEESLIST = "select Employee_id,Emp_full_name,Emp_address from Employee where Employee_Company_id = ?";
    //Messages
    public static final String DBLINKERROR = "Database communication link failure";
    public static final String USERIDEXISTS = "User Id already exists";
    public static final String SUCCESS = "success";
    public static final String ADDSUCCESS = "Data inserted successfully.";
    public static final String DELETESUCCESS = "Data deleted successfully.";
    public static final String INSERTIONERROR = "Unable to insert data";
    public static final String MODIFYERROR = "Unable to modify data";
    public static final String NOADMINFOUND = "No Administrator found with entered credentials";
    public static final String NOEMPLOYEEFOUND = "No Employee found with entered credentials";
    public static final String EMPLOYEEIDNOTANUMBER = "Employee Id should be a number";
    public static final String INVALIDCREDENTIALS = "Invalid Credentials";
    
    //Database credenntials
    public static final String DBUSERNAME = "51I7Tu9aQd";
    public static final String DBPASSWORD = "4rGK6ktdZM";
}
