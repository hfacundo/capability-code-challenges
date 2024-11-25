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

    // The constraints help to limit the necessary code with three conditions
    // 1. if the number is less than 0 it cant be a palindrome
    // 2. if it's a two-digit number, both have to be the same
    // 3. if it's a three-digit number, only the first and last have to be the same
    public static boolean isPalindrome(int x) {

        if(x < 0 )
            return false;

        if(x <= 99)
            return x%10 == x/10; // We get the numbers with the reminder of dividing by ten and by dividing the number by ten
        else
            return x%10 == x/100; // We get the numbers with the reminder of dividing by ten and by dividing the number by a hundred
    }

    public static void main(String[] args) {
    }
}
