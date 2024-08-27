package com.challenge.easy.string;

import java.util.ArrayList;
import java.util.List;

/**
 * # Split a String in Balanced Strings
 * <p>
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * <p>
 * Given a balanced string s, split it into some number of substrings such that:
 * <p>
 * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain.
 * <p>
 * Example 1:
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 * <p>
 * Example 2:
 * Input: s = "RLRRRLLRLL"
 * Output: 2
 * Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
 * Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
 * <p>
 * Example 3:
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 * <p>
 * Constraints:
 * <p>
 * # 2 <= s.length <= 1000
 * # s[i] is either 'L' or 'R'.
 * # s is a balanced string.
 */
public class BalancedString {

    public static int balancedStringSplit(String s) {
        int balancedCounting = 0;
        int res = 0;
        for(char character : s.toCharArray()) {
            // If the character is equals to R increase the balanced counting
            if(character == 'R') {
                balancedCounting++;
            }
            // Otherwise decreased the balanced counting
            else {
                balancedCounting--;
            }
            // If the balanced counting is equals to zero, it's means
            // it has encountered substring balanced
            if(balancedCounting == 0) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
