package JUnit;

import static org.junit.Assert.*;  
import org.junit.Test;  
  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-6,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  