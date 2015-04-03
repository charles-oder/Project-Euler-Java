package us.oder.euler;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacciSequenceOfTen(){
        List<Integer> expectedArray = Arrays.asList( 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 );
        Fibonacci fibonacci = new Fibonacci(1000);
        fibonacci.count = 10;
        assertArrayEquals( expectedArray.toArray(), fibonacci.getSequence().toArray() );
    }

    @Test
    public void fibonacciSequenceOfMax50(){
        List<Integer> expectedArray = Arrays.asList( 1, 2, 3, 5, 8, 13, 21, 34 );
        Fibonacci fibonacci = new Fibonacci(50);
        assertArrayEquals( expectedArray.toArray(), fibonacci.getSequence().toArray() );
    }

    @Test
    public void fibonacciSequenceOfEvenNumbersMax100(){
        List<Integer> expectedArray = Arrays.asList( 2, 8, 34 );
        Fibonacci fibonacci = new Fibonacci(100);
        fibonacci.filter = new Fibonacci.IntegerFilter() {
            @Override
            public boolean shouldInclude( Integer i ) {
                return i % 2 == 0;
            }
        };
        assertArrayEquals( expectedArray.toArray(), fibonacci.getSequence().toArray() );
    }

    @Test
    public void fibonacciSequenceOfEvenNumbersMax4000000(){
        Integer expectedSum = 4613732;
        Fibonacci fibonacci = new Fibonacci(4000000);
        fibonacci.filter = new Fibonacci.IntegerFilter() {
            @Override
            public boolean shouldInclude( Integer i ) {
                return i % 2 == 0;
            }
        };
        assertEquals( expectedSum, sum(fibonacci.getSequence()) );
    }

    private Integer sum( List<Integer> sequence ) {
        Integer total = 0;
        for (Integer i : sequence ) {
            total += i;
        }

        return total;
    }

}