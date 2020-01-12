package com.example.fibonaccipalindrome.utils;

import com.example.fibonaccipalindrome.pair.impl.DefaultPair;

import java.util.List;

public class PalindromeUtils {

    public static DefaultPair findOutPalindrome(List<Integer> sequence) {
        int start = 0, end = 0;
        int num1, num2, len;
        for (int i = 0; i < sequence.size(); i++) {
            num1 = getMaxLength(sequence, i, i);
            num2 = getMaxLength(sequence, i, i + 1);
            len = Math.max(num1, num2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        //return string.substring(start, end + 1);
        return new DefaultPair(start +1 , end - start + 1);
    }
/*

    public static DefaultPair longestPalindrome(String string) {
        int start = 0, end = 0;
        int num1, num2, len;
        for (int i = 0; i < string.length(); i++) {
            num1 = getMaxLength(string, i, i);
            num2 = getMaxLength(string, i, i + 1);
            len = Math.max(num1, num2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        //return string.substring(start, end + 1);
        System.out.println("longestPalindrome: " + string.substring(start, end + 1));
        return new DefaultPair(start , end - start);
    }
*/

    public static int getMaxLength(List<Integer> s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.size() && s.get(L) == s.get(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
