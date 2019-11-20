package DBOperations;

import Utilities.DBAccessUtilities;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertOperations {
    private DBAccessUtilities dbutil;
    public PreparedStatement insertadmin;
    public InsertOperations(){
        dbutil = new DBAccessUtilities();
        try{
            insertadmin = dbutil.con.prepareStatement("insert into Administrator (Admin_username,Admin_Password) values (?,?)");
        }catch(SQLException e){
            
        }catch(NullPointerException e){
            
        }
    }    
}
