import com.utilities.SessionUtilities;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.JVM)
public class SessionTest {    
    public SessionTest() {
    }
    
    @Test
    public void initialSessionDataTest(){                
        //Checking initial Data of session
        Assert.assertEquals(SessionUtilities.companyidloggedin,0);
        Assert.assertTrue(SessionUtilities.useridloggedin.isEmpty());                
    }    
    
    @Test
    public void validatedSessionDataTest(){
        //Generating random ids and check through validating session
        int randomcompanyid = ThreadLocalRandom.current().nextInt(100);
        String randomuserid = ValidationTest.getRandomString(ThreadLocalRandom.current().nextInt(8,15),"A0aB#Cb1D@cE2dF#Ge3H&ffI4$gJ&Kh5LiM6jNOk7!PlQz8ymx&Rw%Svn9T*oUpVWu#qtXs?YrZ");
        SessionUtilities.validateSession(randomcompanyid, randomuserid);
        Assert.assertEquals(SessionUtilities.companyidloggedin,randomcompanyid);
        Assert.assertEquals(SessionUtilities.useridloggedin,randomuserid);                
    }
    
    @Test
    public void invalidatedSessionDataTest(){
        //Checking through invalidating sessions        
        SessionUtilities.invalidateSession();
        Assert.assertEquals(SessionUtilities.companyidloggedin,0);
        Assert.assertTrue(SessionUtilities.useridloggedin.isEmpty());
    }
}
