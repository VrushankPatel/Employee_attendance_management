
import com.utilities.ValidationUtilities;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import static org.junit.Assert.*;
import org.junit.Test;

public class ValidationTest {
    ValidationUtilities validation;
    StringBuilder string;                     
    public ValidationTest() {
        validation  = new ValidationUtilities();
    }
    
    @Test
    public void testValidation(){          
        string = new StringBuilder(getRandomString(ThreadLocalRandom.current().nextInt(8,15),"A0aB#Cb1D@cE2dF#Ge3H&ffI4$gJ&Kh5LiM6jNOk7!PlQz8ymx&Rw%Svn9T*oUpVWu#qtXs?YrZ"));
        assertEquals(Pattern.compile("^(?!.* )(?=.*[@$!%*#?&])(?=.*\\d)(?=.*[A-Z]).{8,15}$").matcher(string).matches(), validation.validateUserNameAndPassword(new String[]{string.toString()}));        
    }
    
    @Test
    public void testUserIdValidation(){
        string = new StringBuilder(getRandomString(ThreadLocalRandom.current().nextInt(0,20),"0123456789"));
        assertEquals(validation.validateEmployeeId(string.toString()), string.length()==10);        
    }
    
    
    static String getRandomString(int n,String dataset){         
        StringBuilder sb = new StringBuilder(n);   
        for (int i = 0; i < n; i++) {             
            sb.append(dataset.charAt((int)(dataset.length() * Math.random()))); 
        } 
        return sb.toString(); 
    }    
}
