import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before

    public void before(){
        databaseAdmin = new DatabaseAdmin("James");
    }
    @Test
    public void canIncreaseSalary(){
        assertEquals(21500.0, databaseAdmin.increaseSalary(1500));
    }
    @Test
    public void canGetBonus(){
        assertEquals(200.0, databaseAdmin.payBonus());
    }

}
