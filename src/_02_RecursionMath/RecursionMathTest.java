package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(168, RecursionMath.recursiveMultiplication(7, 24));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method

        assertEquals(4, RecursionMath.recursiveDivision(8, 2));
        assertEquals(3, RecursionMath.recursiveDivision(12, 4));
        
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(144, RecursionMath.recursivePower(12, 2));
        assertEquals(27, RecursionMath.recursivePower(3, 3));
    }
}
