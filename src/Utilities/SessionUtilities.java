package Utilities;
public class SessionUtilities {
    public static int companyidloggedin = 2;
    public static String useridloggedin = "";
    public static void invalidateSession(){
        companyidloggedin = 0;
        useridloggedin = "";
    }
    public static void validateSession(int ID,String UserID){
        
    }
}
