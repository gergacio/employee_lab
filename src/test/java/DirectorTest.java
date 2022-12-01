import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        //refresh instances before each test
        director = new Director("GGG", "abc12345",80000,"Software development", 200000);
    }
    //tests
    @Test
    public void hasName(){
        assertEquals("GGG", director.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals("abc12345", director.getNiNumber());
    }
    @Test
    public void hasSalary(){
        //always provide 3-th parameter
        assertEquals(80000, director.getSalary(),0);
    }
    @Test
    public void hasDeptName(){
        //always provide 3-th parameter
        assertEquals("Software development", director.getDeptName());
    }
    @Test
    public void hasRaiseSalary(){
        //test precision (delta)
        assertEquals(90000,director.raiseSalary(10000),0);
    }
    @Test
    public void hasPayBonus(){
        assertEquals(1600,director.payBonus(),0);
    }
    @Test
    public void hasBudget(){
        assertEquals(200000,director.getBudget(),0);
    }
}
