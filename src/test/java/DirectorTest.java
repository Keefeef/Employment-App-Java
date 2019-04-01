import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Dave", 100000);
    }
    @Test
    public void canGetBudget(){
        assertEquals(100000.0, director.getBudget());
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Marketing", director.getDeptName());

    }
}
