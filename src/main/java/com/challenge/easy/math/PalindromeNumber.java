package com.challenge.easy.math;

import java.util.*;

/**
 * # Palindrome Number
 * <p>
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <p>
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * <p>
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        List<Integer> numbersToArray = new ArrayList<>();
        int num = x;
        // Convert number to array
        while (num > 0) {
            double numDividedByTen = (double) num / 10;
            double decimals = (numDividedByTen - Math.floor(numDividedByTen));
            int res = (int) (Math.round(decimals * 10));
            numbersToArray.add(res);
            num = (int) numDividedByTen;
        }
        List<Integer> reverseNumberToArray = new ArrayList<>(numbersToArray);
        Collections.reverse(numbersToArray);

        // Check if it's palindrome
        boolean isPal = false;
        for (int idx = 0; idx < reverseNumberToArray.size(); idx++) {
            if (numbersToArray.get(idx) == reverseNumberToArray.get(idx)) {
                isPal = true;
            } else return false;
        }
        return isPal;
    }

    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
}
