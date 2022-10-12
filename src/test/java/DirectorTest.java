import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Baron Hell", "JJ HJ 66 Y", 3000000, "Lord of the Turning Screw", 367.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Baron Hell", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JJ HJ 66 Y", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(3000000, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Lord of the Turning Screw", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10);
        assertEquals(3000010, director.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(30000, director.payBonus());
    }

    @Test
    public void canGetBudget(){
        assertEquals(367.99, director.getBudget(), 0.00);
    }

}
