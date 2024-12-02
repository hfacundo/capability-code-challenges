package com.challenge.easy.recursion;

public class FibonacciNumber {

    /**
     * Computes the Fibonacci number using recursion with memoization.
     *
     * @param n The index in the Fibonacci sequence.
     * @return The Fibonacci number at index n.
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fibHelper(n, new int[n + 1]);
    }

    /**
     * Helper function with memoization to avoid redundant computations.
     *
     * @param n     The index in the Fibonacci sequence.
     * @param cache Cache to store previously computed Fibonacci values.
     * @return The Fibonacci number at index n.
     */
    private static int fibHelper(int n, int[] cache) {
        if (n <= 1) {
            return n;
        }

        // If the value is already computed, return it
        if (cache[n] != 0) {
            return cache[n];
        }

        // Compute and store the result in the cache
        cache[n] = fibHelper(n - 1, cache) + fibHelper(n - 2, cache);
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(2)); // Output: 1
        System.out.println(fib(3)); // Output: 2
        System.out.println(fib(4)); // Output: 3
        System.out.println(fib(10)); // Output: 55
    }
}
