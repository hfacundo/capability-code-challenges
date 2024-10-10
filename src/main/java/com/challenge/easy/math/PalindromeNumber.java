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
        // if x is negative, it cannot be a palindrome
        if(x < 0){
            return false;
        }
        // if x end in 0 and it is not 0 itself, it cannot be a palindrome
        if(x!=0 && x%10 ==0){
            return false;
        }

        //reverse half of the digits. 121
        // 1.reverseHalf = 0*10 + 121%10 = 1
        // 1. x= 121/10 = 12
        // 2. reverseHalf = 1*10 + 12%10 =10+ 2 = 12
        // 2. x= 12/10 = 1
        // 3. x < reverseHalf = true; break
        int reverseHalf=0;
        while(x > reverseHalf){
            reverseHalf = reverseHalf*10 + x%10;
            x /= 10;
        }
        // Check if reverseHalf matches the remaining part
        // if x has an odd number of dogots, we divide reverseHalf by 10 to remove the middle digit
        return x == reverseHalf || x == reverseHalf/10;
    }

    public static void main(String[] args) {

    }
}
