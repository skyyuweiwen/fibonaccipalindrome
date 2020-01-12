package com.example.fibonaccipalindrome.fibonaccipalindrome.impl;

import com.example.fibonaccipalindrome.exception.EmptyListException;
import com.example.fibonaccipalindrome.fibonaccipalindrome.FibonacciPalindrome;
import com.example.fibonaccipalindrome.pair.Pair;
import com.example.fibonaccipalindrome.pair.impl.DefaultPair;
import com.example.fibonaccipalindrome.utils.FibonacciUtils;
import com.example.fibonaccipalindrome.utils.PalindromeUtils;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Default impl for FibonacciPalindrome.
 */
@Component
public class DefaultFibonacciPalindrome implements FibonacciPalindrome {

    @Override
    public Pair findFibonacciPalindrome(List<Integer> sequence) {
        if (sequence == null || sequence.isEmpty() || sequence.size() ==1) {
            throw new EmptyListException("The input is not appropriate for this function.");
        }

        if(sequence.size() ==2){
            if(sequence.get(0) == sequence.get(1))
                return new DefaultPair(0, 1);
        }

        Pair palindromePair = PalindromeUtils.findOutPalindrome(sequence);

        if ((int) palindromePair.getSecond() >= 3) {
            return palindromePair;
        } else {
            Pair fibonacci = FibonacciUtils.findOutFibonacci(sequence);
            return fibonacci;
        }

    }

}
