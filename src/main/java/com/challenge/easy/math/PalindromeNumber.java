package com.challenge.easy.math;

/**
    # Palindrome Number

     Given an integer x, return true if x is a palindrome, and false otherwise.

     Example 1:
         Input: x = 121
         Output: true
         Explanation: 121 reads as 121 from left to right and from right to left.

     Example 2:
         Input: x = -121
         Output: false
         Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

     Example 3:
         Input: x = 10
         Output: false
         Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

     Constraints:

        * -231 <= x <= 231 - 1


     Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        while (x>0) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x/10;

        }
        return original == reverse;
    }

    public static void main(String[] args) {

    }
}
