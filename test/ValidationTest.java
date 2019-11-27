
import com.utilities.ValidationUtilities;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import static org.junit.Assert.*;
import org.junit.Test;

public class ValidationTest {
    ValidationUtilities validation;
    public ValidationTest() {
        validation  = new ValidationUtilities();
    }
    
    @Test
    public void testValidation(){  
        StringBuilder string;                     
        string = new StringBuilder(getAlphaNumericString(ThreadLocalRandom.current().nextInt(8,15)));
        System.out.println(string+"\n"+Pattern.compile("^(?!.* )(?=.*[@$!%*#?&])(?=.*\\d)(?=.*[A-Z]).{8,15}$").matcher(string).matches()+"\n"+validation.validateUserNameAndPassword(new String[]{string.toString()}));
        assertEquals(Pattern.compile("^(?!.* )(?=.*[@$!%*#?&])(?=.*\\d)(?=.*[A-Z]).{8,15}$").matcher(string).matches(), validation.validateUserNameAndPassword(new String[]{string.toString()}));        
    }
    
    static String getAlphaNumericString(int n) 
    {         
        StringBuilder sb = new StringBuilder(n);   
        for (int i = 0; i < n; i++) {             
            sb.append("A0aB#Cb1D@cE2dF#Ge3H&ffI4$gJ&Kh5LiM6jNOk7!PlQz8ymx&Rw%Svn9T*oUpVWu#qtXs?YrZ" .charAt((int)("A0aB#Cb1D@cE2dF#Ge3H&ffI4$gJ&Kh5LiM6jNOk7!PlQz8ymx&Rw%Svn9T*oUpVWu#qtXs?YrZ".length() * Math.random()))); 
        } 
        return sb.toString(); 
    } 
}
