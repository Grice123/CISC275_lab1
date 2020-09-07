package lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MathTest {

    @Test
    public void testAdd() {
        int sum = Math.add(3,2);
        assertEquals(5, sum);
    }
    
    @Test
    public void testAdd2() {  // TODO: fix this test
    		int sum = Math.add(100, 20);
    		assertEquals(120, sum);
    }

    // TODO: write your testMultiple() here
   
    public void testMultiply() {
    	int ans = Math.multiply(5,2);
    	assertEquals(10,ans);
    }




}