import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    Employee employee;

//    @Before
//    public void before(){
//        employee = new Employee("James", 126, 30000);
//    }

    @Test
    public void hasName(){
        assertEquals("James", employee.getName());
    }

    @Test
    public void hasNiNum(){
        assertEquals(126, employee.getNiNum());
    }

    @Test
    public void canSetName(){
        employee.setName("Bob");
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void canIncreaseSalary(){
        assertEquals(31500.0, employee.increaseSalary(1500));
    }

    @Test
    public void canGetBonus(){
        assertEquals(300.0, employee.payBonus());
    }

}
