import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Mickey the Shark", "GH JH UH 1", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Mickey the Shark", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("GH JH UH 1", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000);
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(300, databaseAdmin.payBonus());
    }


}
