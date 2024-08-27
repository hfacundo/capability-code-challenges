package com.challenge.easy.recursion;

/**
 * # Fibonacci Number
 * <p>
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * <p>
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * <p>
 * Example 2:
 * Input: n = 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * <p>
 * Example 3:
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 30
 */
public class FibonacciNumber {

    // Store the result of fibonacci number, to enhance time complexity
    private static final Integer[] mem = new Integer[100];
    // Check how many times will be executed
    public static int count = 0;

    public static int fib(int n) {
        count++;
        // Base case
        if (n == 1 || n == 0) return n;
        // Check if the fib number (result) was previously saved to only reuse
        if (mem[n] != null) return mem[n];
        // Otherwise, store the result within the array position
        mem[n] = fib(n - 1) + fib(n - 2);
        return mem[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(count);
    }
}
