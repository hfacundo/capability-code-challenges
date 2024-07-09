package com.challenge.easy.math;


import java.util.ArrayList;

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
        ArrayList<Integer> nums = new ArrayList<>();
        boolean isPalindrome = x >= 0;

        if(isPalindrome){
            while(x > 0){
                nums.add(x%10);
                x/=10;
            }
            for (int i = 0; i < nums.size(); i++) {
                int j = nums.size() -1 -i;
                if(nums.get(i) != nums.get(j)){
                    isPalindrome = false;
                    break;
                }
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {

    }
}
