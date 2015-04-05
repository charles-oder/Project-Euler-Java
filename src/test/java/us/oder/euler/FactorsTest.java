package us.oder.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorsTest {

    @Test
    public void generateProductOfFactorsOneThroughTen(){
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedValue = 2520;
        int actualValue = Factors.generateSmallestDividend(testArray);
        assertEquals( expectedValue, actualValue );
    }

}