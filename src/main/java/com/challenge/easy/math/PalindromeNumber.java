package com.challenge.easy.math;

public class PalindromeNumber {

    /**
     * Checks if an integer is a palindrome without converting it to a string.
     *
     * @param x The input integer.
     * @return True if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the integer
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number matches the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
    }
}
