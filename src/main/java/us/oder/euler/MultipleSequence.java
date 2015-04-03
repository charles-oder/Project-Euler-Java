package us.oder.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectEulerJava
 * us.oder.euler
 * Created by charlesoder on 4/3/15.
 */
public class MultipleSequence {

    private int multiple;

    public int max;

    public MultipleSequence(int multiple){
        this.multiple = multiple;
        this.max = multiple;
    }

    public Integer[] getSequence() {
        List<Integer> list = new ArrayList<Integer>();
        for( int i = multiple; i <= max; i += multiple){
            list.add( i );
        }
        return list.toArray( new Integer[ list.size() ] );
    }
}
