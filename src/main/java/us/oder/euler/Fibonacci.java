package us.oder.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/3/15.
 */
public class Fibonacci {

    public int count;
    public int max;
    public IntegerFilter filter;
    private Integer currentValue;
    private Integer[] lastTwo;

    public interface IntegerFilter {
        boolean shouldInclude( Integer i );
    }

    public Fibonacci(int max){
        this.max = max;
        this.count = Integer.MAX_VALUE;
    }

    public List<Integer> getSequence() {
        List<Integer> output = new ArrayList<Integer>();
        lastTwo = new Integer[] {0, 1};
        currentValue = lastTwo[1];
        while ( currentValue <= max && output.size() < count ) {
            if ( filter != null && !filter.shouldInclude( currentValue ) ) {
                incrementValues();
                continue;
            }
            output.add( currentValue );
            incrementValues();
        }
        return output;
    }

    private void incrementValues() {
        lastTwo[0] = lastTwo[1];
        lastTwo[1] = currentValue;
        currentValue = lastTwo[0] + lastTwo[1];
    }
}
