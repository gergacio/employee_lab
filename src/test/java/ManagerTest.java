import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    //get reference to Manager class
    Manager manager;
    @Before
    public void before(){
        //refresh instances before each test
        manager = new Manager("Georgi", "abc123",50000,"Software development");
    }
    //tests
    @Test
    public void hasName(){
        assertEquals("Georgi", manager.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals("abc123", manager.getNiNumber());
    }
    @Test
    public void hasSalary(){
        //always provide 3-th parameter
        assertEquals(50000, manager.getSalary(),0);
    }
    @Test
    public void hasDeptName(){
        //always provide 3-th parameter
        assertEquals("Software development", manager.getDeptName());
    }
    @Test
    public void hasRaiseSalary(){
        //test precision (delta)
        assertEquals(60000,manager.raiseSalary(10000),0);
    }
    @Test
    public void hasPayBonus(){
        assertEquals(500,manager.payBonus(),0);
    }
}
