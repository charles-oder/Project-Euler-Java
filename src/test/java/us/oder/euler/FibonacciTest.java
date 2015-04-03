package us.oder.euler;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacciSequenceOfTen(){
        List<Integer> expectedArray = Arrays.asList( 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 );
        Fibonacci fibonacci = new Fibonacci(10);
        assertArrayEquals( expectedArray.toArray(), fibonacci.getSequence().toArray() );
    }

}