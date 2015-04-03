package us.oder.euler;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class MultipleSequenceTest {

    @Test
    public void testSequenceForMultiplesOfThree() {
        Integer[] expected = new Integer[] {3, 6, 9, 12, 15, 18};
        MultipleSequence sequence = new MultipleSequence(3);
        sequence.max = 20;
        assertArrayEquals( expected, sequence.getSequence() );
    }

    @Test
    public void testMergingSequences() {
        Integer[] expected = new Integer[] {3, 5, 6, 9};
        MultipleSequence threes = new MultipleSequence( 3, 9 );
        MultipleSequence fives = new MultipleSequence( 5, 9 );
        Set<Integer> combined = new TreeSet<Integer>();
        combined.addAll( Arrays.asList(threes.getSequence()) );
        combined.addAll( Arrays.asList(fives.getSequence()) );
        assertArrayEquals( expected, combined.toArray( new Integer[combined.size()] ) );
    }

    @Test
    public void testSumOfMultiplesOfThreeAndFiveUnderOneThousand() {
        Integer expected = 233168;
        MultipleSequence threes = new MultipleSequence( 3, 999 );
        MultipleSequence fives = new MultipleSequence( 5, 999 );
        Set<Integer> combined = new TreeSet<Integer>();
        combined.addAll( Arrays.asList( threes.getSequence() ) );
        combined.addAll( Arrays.asList( fives.getSequence() ) );
        Integer sum = 0;
        for (Integer i : combined) {
            sum += i;
        }
        assertEquals( expected, sum );
    }

}