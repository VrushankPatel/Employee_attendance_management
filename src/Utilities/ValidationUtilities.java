package Utilities;

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
}
