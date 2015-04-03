package us.oder.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorGeneratorTest {

    @Test
    public void isPrimeForPrimeNumber(){
        assertTrue( PrimeFactorGenerator.isPrime( 3 ) );
        assertTrue( PrimeFactorGenerator.isPrime( 5 ) );
        assertTrue( PrimeFactorGenerator.isPrime( 7 ) );
        assertTrue( PrimeFactorGenerator.isPrime( 11 ) );
    }

    @Test
    public void isPrimeForPrimeNonNumber(){
        assertFalse( PrimeFactorGenerator.isPrime( 4 ) );
        assertFalse( PrimeFactorGenerator.isPrime( 6 ) );
        assertFalse( PrimeFactorGenerator.isPrime( 22 ) );
        assertFalse( PrimeFactorGenerator.isPrime( 100 ) );
    }

}