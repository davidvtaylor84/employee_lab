import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Charles Davenport III", "JJ GH 66 Y", 120000, "Department of the Turning Screw");
    }

    @Test
    public void canGetName(){
        assertEquals("Charles Davenport III", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JJ GH 66 Y", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(120000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Department of the Turning Screw", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(130000, manager.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1200, manager.payBonus());
    }

    @Test
    public void canChangeName(){
        manager.changeName("Mick");
        assertEquals("Mick", manager.getName());
    }

    @Test
    public void dontChangeNameIfNewNameIsNull(){
        manager.changeName("");
        assertEquals("Charles Davenport III", manager.getName());
    }

}
