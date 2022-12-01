import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;
    @Before
    public void before(){
        //refresh instances before each test
        developer = new Developer("GG", "abc1234",60000);
    }
    //tests
    @Test
    public void hasName(){
        assertEquals("GG", developer.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals("abc1234", developer.getNiNumber());
    }
    @Test
    public void hasSalary(){
        //always provide 3-th parameter
        assertEquals(60000, developer.getSalary(),0);
    }

    @Test
    public void hasRaiseSalary(){
        //test precision (delta)
        assertEquals(70000,developer.raiseSalary(10000),0);
    }
    @Test
    public void hasPayBonus(){
        assertEquals(600,developer.payBonus(),0);
    }
}
