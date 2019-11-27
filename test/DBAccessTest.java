
import com.utilities.DBAccessUtilities;
import java.sql.SQLException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DBAccessTest {
    @Test
    public void testDatabaseAccess() throws SQLException{
        DBAccessUtilities dbaccesstocken = new DBAccessUtilities();
        assertFalse(dbaccesstocken.con.isClosed());
    }
}
