package us.oder.euler;

import java.util.*;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/3/15.
 */
public class PrimeFactorGenerator {
    private final Long value;
    private SortedSet<Long> list;

    public PrimeFactorGenerator( Long value ) {
        this.value = value;
    }

    public static boolean isPrime( Long num ) {
        for ( int i = 2; i <= Math.sqrt( num ); i++ ) {
            if ( num % i == 0 ) {
                return false;
            }
        }
        return (num != 1);
    }

    public SortedSet<Long> getPrimeFactors() {
        list = new TreeSet<Long>();
        for ( Long i = 3L; i <= Math.sqrt( value ); i++ ) {
            addToListIfPrime( i );
        }
        return list;
    }

    private void addToListIfPrime( Long i ) {
        if ( isPrimeFactor( i ) ) {
            list.add( i );
            if ( !list.contains( value / i ) && isPrime( value / i )) {
                list.add( value / i );
            }
        }
    }

    private boolean isPrimeFactor( Long i ) {
        return isPrime( i ) && value % i == 0;
    }

    public Long getLargestPrimeFactor() {
        SortedSet<Long> set = getPrimeFactors();
        return set.last();
    }
}
