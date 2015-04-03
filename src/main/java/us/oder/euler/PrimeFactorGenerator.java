package us.oder.euler;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/3/15.
 */
public class PrimeFactorGenerator {
    public static boolean isPrime( int num ) {
        for ( int i = 2; i <= Math.sqrt( num ); i++ ) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
