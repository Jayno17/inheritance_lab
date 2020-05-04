import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Mary", "NI123457", 1000.0, "Exec", 100000.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.0, director.getBudget(), 1.0 );
    }

}

