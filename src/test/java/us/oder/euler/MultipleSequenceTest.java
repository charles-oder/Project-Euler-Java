package us.oder.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSequenceTest {

    @Test
    public void testSequenceForMultiplesOfThree() {
        Integer[] expected = new Integer[] {3, 6, 9, 12, 15, 18};
        MultipleSequence sequence = new MultipleSequence(3);
        sequence.max = 20;
        assertArrayEquals( expected, sequence.getSequence() );
    }

}