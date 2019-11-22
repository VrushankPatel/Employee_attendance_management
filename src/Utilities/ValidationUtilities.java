package Utilities;

import com.mysql.cj.util.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtilities {
    private final Pattern pattern;
    private Matcher matcher;
    public ValidationUtilities() {
        pattern = Pattern.compile("^(?!.* )(?=.*[@$!%*#?&])(?=.*\\d)(?=.*[A-Z]).{8,15}$");
    }
    
    public boolean validateUserNameAndPassword(String str[]){
        for(String s : str){
            if(!pattern.matcher(s).matches()){
                return false;
            }            
        }
        return true;
    }
    
    public boolean validateEmployee(String name,String address,String id,String phone){        
        return  StringUtils.isStrictlyNumeric(phone) && StringUtils.isStrictlyNumeric(id) && name.length() <= 100 && address.length() <= 250 && id.length() == 10 && phone.length() == 10;        
    }
}
