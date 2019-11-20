package DBOperations;

import Utilities.DBAccessUtilities;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class QueryOperations {
    DBAccessUtilities dbutil;

    public QueryOperations() {
        dbutil = new DBAccessUtilities();
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
            return "0";
        }
    }    
}