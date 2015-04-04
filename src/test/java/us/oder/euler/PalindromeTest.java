package us.oder.euler;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PalindromeTest {


    @Test
    public void getDigitList(){
        int testValue = 123456789;
        List<Integer> expectedList = new ArrayList<Integer>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ));
        List<Integer> actualList = Palindrome.getDigitList(testValue);
        assertArrayEquals( expectedList.toArray(), actualList.toArray() );
    }

    @Test
    public void isPalindromeOnPalindrome() {
        int testValue = 9009;
        assertTrue( Palindrome.isPalindrome( testValue ) );
    }

    @Test
    public void isPalindromeOnNonPalindrome() {
        int testValue = 9019;
        assertFalse( Palindrome.isPalindrome( testValue ) );
    }

    @Test
    public void findLargestPalindromeOfTwoDigitProducts() {
        int expectedValue = 9009;
        int actualValue = Palindrome.findLargestPalindromeOfProducts(2);
        assertEquals( expectedValue, actualValue );
    }

}