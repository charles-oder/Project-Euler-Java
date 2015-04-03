package us.oder.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/3/15.
 */
public class Fibonacci {

    private final int count;

    public Fibonacci(int count){
        this.count = count;
    }

    public List<Integer> getSequence() {
        List<Integer> output = new ArrayList<Integer>();
        Integer[] lastTwo = new Integer[] {0, 1};
        Integer currentValue = lastTwo[1];
        while (output.size() < count ) {
            output.add( currentValue );
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = currentValue;
            currentValue = lastTwo[0] + lastTwo[1];
        }
        return output;
    }
}
