package com.challenge.easy.string;

/**
    # Split a String in Balanced Strings

     Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

     Given a balanced string s, split it into some number of substrings such that:

     Each substring is balanced.
     Return the maximum number of balanced strings you can obtain.

     Example 1:
         Input: s = "RLRRLLRLRL"
         Output: 4
         Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

     Example 2:
         Input: s = "RLRRRLLRLL"
         Output: 2
         Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
         Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

     Example 3:
         Input: s = "LLLLRRRR"
         Output: 1
         Explanation: s can be split into "LLLLRRRR".

     Constraints:

         # 2 <= s.length <= 1000
         # s[i] is either 'L' or 'R'.
         # s is a balanced string.

 */
public class BalancedString {

    public static int balancedStringSplit(String s) {
        int balance = 0;
        String temp = "";
        for (int i = 0; i < s.length() - 1; i += 2) {
            String letters = s.substring(i, i + 2);

            if (letters.charAt(0) != letters.charAt(1)) {
                if (temp.equals("") || temp.contains(letters)) {
                    balance++;
                    temp = letters;
                }
            } else {
                if (i == s.length() - 2) {
                    break;
                }

                String second = s.substring(i + 2, i + 4);
                if (second.charAt(0) == second.charAt(1)) {
                    if (!letters.equals(second)) {
                        i += 2;
                    } else {
                        temp = letters + second;
                        i += 4;
                    }
                    balance++;
                }
            }
        }
        return balance;
    }

    public static void main(String[] args) {
    }
}
