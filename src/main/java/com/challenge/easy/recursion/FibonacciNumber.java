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
    // Hashmap to store previously computed fibonacci numbers
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fib(int n) {
        // we define de base cases
        if (n <= 1) {
            return n;
        }
        // Check if the fibonacci number of n is already computed
        if(memo.containsKey(n)) {
            // we return the already computed fibonacci number
            return memo.get(n);
        }
        // we define de recursive relation
        int result = fib(n - 1) + fib(n - 2);
        // we store the computed fibonacci number
        memo.put(n, result);
        // we return the fibonacci number for n
        return result;
    }

    public static void main(String[] args) {

    }
}
