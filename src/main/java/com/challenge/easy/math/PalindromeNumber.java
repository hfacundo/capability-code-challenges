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

        int numberInverted = 0;
        int aux= x;

        while (aux != 0){
            numberInverted = (numberInverted * 10) + (aux % 10); //formula to get the reverse of the current number
            aux = aux / 10; // loop until the number aux is to one digit
        }


        return (numberInverted == x && x > 0); // nothing below 0 is palindrome
    }

    public static void main(String[] args) {

    }
}
