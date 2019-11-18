package Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtilities {
    Pattern pattern;
    Matcher matcher;
    public ValidationUtilities() {
        pattern = Pattern.compile("^(?!.* )(?=.*\\d)(?=.*[A-Z]).{8,15}$");
    }
    public boolean validateUserName(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
