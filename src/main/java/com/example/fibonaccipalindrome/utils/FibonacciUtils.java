package com.example.fibonaccipalindrome.utils;

import com.example.fibonaccipalindrome.exception.EmptyListException;
import com.example.fibonaccipalindrome.pair.Pair;
import com.example.fibonaccipalindrome.pair.impl.DefaultPair;

import java.util.ArrayList;
import java.util.List;

public class FibonacciUtils {

    public static Pair findOutFibonacci(List<Integer> sequence){

        List<Integer> tempList = new ArrayList<>();

        for(int i=0;i<=sequence.size()-3;i++){
            tempList = sequence.subList(i,i+3);

            if(tempList.get(0) == tempList.get(2)||
                    tempList.get(0)+ tempList.get(1) == tempList.get(2)||
                    tempList.get(0) == tempList.get(1) + tempList.get(2)
            )
                return new DefaultPair(i+1, 3);
        }
        throw new EmptyListException("No FibonacciPalindrome found.");
    }

}
