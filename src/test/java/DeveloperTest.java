import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Susan Deep", "JK HG JH 4", 50000);
    }

    @Test
    public void canGetName(){
        assertEquals("Susan Deep", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JK HG JH 4", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(15000);
        assertEquals(65000, developer.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(500, developer.payBonus());
    }

}
