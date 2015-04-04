package us.oder.euler;

import java.util.LinkedList;
import java.util.List;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/4/15.
 */
public abstract class Palindrome {
    public static List<Integer> getDigitList( int value ) {
        LinkedList<Integer> digits = new LinkedList<Integer>();
        while ( value > 0 ) {
            digits.push( value % 10 );
            value /= 10;
        }
        return digits;
    }
}
