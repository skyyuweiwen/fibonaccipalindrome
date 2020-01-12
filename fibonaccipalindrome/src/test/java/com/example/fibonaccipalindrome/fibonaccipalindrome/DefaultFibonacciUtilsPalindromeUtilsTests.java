package com.example.fibonaccipalindrome.fibonaccipalindrome;

import com.example.fibonaccipalindrome.exception.EmptyListException;
import com.example.fibonaccipalindrome.fibonaccipalindrome.impl.DefaultFibonacciPalindrome;
import com.example.fibonaccipalindrome.pair.impl.DefaultPair;
import com.example.fibonaccipalindrome.utils.PalindromeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class DefaultFibonacciUtilsPalindromeUtilsTests {
    private DefaultFibonacciPalindrome fibonacciPalindrome = new DefaultFibonacciPalindrome();

    @Test
    public void findFibonacciPalindromeTestForPalindrome() {
        List<Integer> sequence = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 3, 3, 2, 2);

        DefaultPair location = (DefaultPair) fibonacciPalindrome.findFibonacciPalindrome(sequence);
        Assert.assertEquals(Integer.valueOf(7), location.getFirst());
        Assert.assertEquals(Integer.valueOf(7), location.getSecond());
    }

    @Test
    public void findFibonacciPalindromeTestForFibonacci() {
        List<Integer> sequence = Arrays.asList(1, 1, 2, 3, 1);

        DefaultPair location = (DefaultPair) fibonacciPalindrome.findFibonacciPalindrome(sequence);;
        Assert.assertEquals(Integer.valueOf(1), location.getFirst());
        Assert.assertEquals(Integer.valueOf(3), location.getSecond());
    }

    @Test
    public void findFibonacciPalindromeTestForWhole() {
        List<Integer> sequence = Arrays.asList(1, 1, 2, 2, 1, 1);

        DefaultPair location = (DefaultPair) fibonacciPalindrome.findFibonacciPalindrome(sequence);;
        Assert.assertEquals(Integer.valueOf(1), location.getFirst());
        Assert.assertEquals(Integer.valueOf(6), location.getSecond());
    }

    @Test(expected = EmptyListException.class)
    public void findFibonacciPalindromeTestForEmpty() {
        List<Integer> sequence = Arrays.asList();

        DefaultPair location = (DefaultPair) fibonacciPalindrome.findFibonacciPalindrome(sequence);;
    }
}
