import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Hamish");
    }
    @Test
    public void canIncreaseSalary(){
        assertEquals(21500.0, developer.increaseSalary(1500));
    }
    @Test
    public void canGetBonus(){
        assertEquals(200.0, developer.payBonus());
    }
}
