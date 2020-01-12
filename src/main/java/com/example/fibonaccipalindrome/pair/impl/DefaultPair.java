package com.example.fibonaccipalindrome.pair.impl;

import com.example.fibonaccipalindrome.pair.Pair;

/**
 * Default impl for Pair.
 */
public class DefaultPair implements Pair<Integer, Integer> {

    private Integer start;
    private Integer length;

    public DefaultPair(int start, int length ) {
        this.start = start;
        this.length = length;
    }

    @Override
    public Integer getFirst() {
        return start;
    }

    @Override
    public Integer getSecond() {
        return length;
    }
}
