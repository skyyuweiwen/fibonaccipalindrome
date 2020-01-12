package com.example.fibonaccipalindrome.controller;

import com.example.fibonaccipalindrome.fibonaccipalindrome.impl.DefaultFibonacciPalindrome;
import com.example.fibonaccipalindrome.pair.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FibonacciPalindromeController {

    @Autowired
    DefaultFibonacciPalindrome defaultFibonacciPalindrome;

    @PostMapping("/find")
    @ResponseBody
    public Pair create(@RequestParam final List<Integer> sequence) {

        return defaultFibonacciPalindrome.findFibonacciPalindrome(sequence);
    }
}
