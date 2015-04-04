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

    public static boolean isPalindrome( int value ) {
        List<Integer> digits = getDigitList( value );
        for ( int i = 0; i < digits.size()/2; i++ ) {
            if ( !digits.get( i ).equals( digits.get( digits.size() - i - 1 ) ) ) {
                return false;
            }
        }
        return true;
    }
}
