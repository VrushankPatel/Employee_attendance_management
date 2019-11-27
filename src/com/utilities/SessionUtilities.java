package com.utilities;
public class SessionUtilities {
    public static int companyidloggedin = 0;
    public static String useridloggedin = "";
    public static void invalidateSession(){
        companyidloggedin = 0;
        useridloggedin = "";
    }
    public static void validateSession(int id,String userid){
        companyidloggedin = id;
        useridloggedin = userid;
    }
}
