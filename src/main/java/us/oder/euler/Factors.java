package us.oder.euler;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/5/15.
 */
public class Factors {
    public static int generateSmallestDividend( int[] intArray ) {
        int output;
        for (output = intArray[0]; output < Integer.MAX_VALUE; output++) {
            if (isDivisibleByAllValues( output, intArray )) {
                return output;
            }
        }
        return 0;
    }

    private static boolean isDivisibleByAllValues( int output, int[] intArray ) {
        for (int value : intArray) {
            if ( output % value != 0) {
                return false;
            }
        }
        return true;
    }

    public static int generateSmallestDividendForSequence( int sequenceStart, int sequenceEnd ) {
        int[] intArray = new int[sequenceEnd - sequenceStart];
        for ( int i = 0; i < intArray.length; i++ ) {
            intArray[i] = sequenceStart + i;
        }
        return generateSmallestDividend( intArray );
    }
}
