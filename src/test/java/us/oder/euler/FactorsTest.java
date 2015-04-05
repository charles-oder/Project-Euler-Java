package us.oder.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorsTest {

    @Test
    public void generateProductOfFactorsOneThroughTen(){
        int expectedValue = 2520;
        int actualValue = Factors.generateSmallestDividendForSequence( 1, 10 );
        assertEquals( expectedValue, actualValue );
    }

    @Test
    public void generateProductOfWayTooBigOfNumbers() {
        int expectedValue = 0;
        int actualValue = Factors.generateSmallestDividendForSequence( 8675309,8676309 );
        assertEquals( expectedValue, actualValue );
    }
}