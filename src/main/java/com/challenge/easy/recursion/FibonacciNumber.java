package com.challenge.easy.recursion;

import java.util.HashMap;
import java.util.Map;

/**
    # Fibonacci Number

     The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

     F(0) = 0, F(1) = 1
     F(n) = F(n - 1) + F(n - 2), for n > 1.
     Given n, calculate F(n).

     Example 1:
         Input: n = 2
         Output: 1
         Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

     Example 2:
         Input: n = 3
         Output: 2
         Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

     Example 3:
         Input: n = 4
         Output: 3
         Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

     Constraints:

        * 0 <= n <= 30
 */
public class FibonacciNumber {

    public static long fib(int n) {
       return fibonacci(n, new HashMap<>());
    }

    private static int fibonacci(int n, Map<Integer, Integer> map){
        if(map.containsKey(n)) return map.get(n);
        if(n==0) return 0;
        if(n==1) return 1;
        map.put(n, fibonacci(n-1,map)+fibonacci(n-2,map));
        return map.get(n);
    }
//102334155 - 244
//102334155 - 364160
    public static void main(String[] args) {
        System.out.println(fib(40));
    }
}
