package us.oder.euler;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorGeneratorTest {

    @Test
    public void isPrimeForPrimeNumber(){
        assertTrue( PrimeFactorGenerator.isPrime( 3L ) );
        assertTrue( PrimeFactorGenerator.isPrime( 5L ) );
        assertTrue( PrimeFactorGenerator.isPrime( 7L ) );
        assertTrue( PrimeFactorGenerator.isPrime( 11L ) );
    }

    @Test
    public void isPrimeForPrimeNonNumber(){
        assertFalse( PrimeFactorGenerator.isPrime( 1L ) );
        assertFalse( PrimeFactorGenerator.isPrime( 6L ) );
        assertFalse( PrimeFactorGenerator.isPrime( 22L ) );
        assertFalse( PrimeFactorGenerator.isPrime( 100L ) );
    }

    @Test
    public void getPrimeFactorListOfPerfectSquare() {
        Long testValue = 841L;
        List<Long> expectedList = Arrays.asList( 29L );
        PrimeFactorGenerator generator = new PrimeFactorGenerator(testValue);

        assertArrayEquals( expectedList.toArray(), generator.getPrimeFactors().toArray() );
    }

    @Test
    public void getPrimeFactorListOfProductOfPrimes() {
        Long testValue = 55L;
        List<Long> expectedList = Arrays.asList( 5L, 11L );
        PrimeFactorGenerator generator = new PrimeFactorGenerator(testValue);

        assertArrayEquals( expectedList.toArray(), generator.getPrimeFactors().toArray() );
    }

    @Test
    public void getPrimeFactorList() {
        Long testValue = 13195L;
        List<Long> expectedList = Arrays.asList( 5L, 7L, 13L, 29L );
        PrimeFactorGenerator generator = new PrimeFactorGenerator(testValue);

        assertArrayEquals( expectedList.toArray(), generator.getPrimeFactors().toArray() );
    }

    @Test
    public void getLargestPrimeFactor() {
        Long testValue = 600851475143L;
        PrimeFactorGenerator generator = new PrimeFactorGenerator(testValue);

        assertEquals( 6857L, (long)generator.getLargestPrimeFactor() );
    }

}