import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("James", "HR");
    }
    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }
    @Test
    public void canIncreaseSalary(){
        assertEquals(11500.0, manager.increaseSalary(1500));
    }
    @Test
    public void canGetBonus(){
        assertEquals(100.0, manager.payBonus());
    }

}
