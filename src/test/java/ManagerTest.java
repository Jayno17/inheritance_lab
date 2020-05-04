import Staff.Management.Manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Melinda", "NI123456", 100.0, "Exec");
    }

    @Test
    public void canGetName() {
        assertEquals("Melinda", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("NI123456", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals("Exec", manager.getDeptName());
    }

}
