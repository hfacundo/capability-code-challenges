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

        int lnum = 0;
        int rnum = 0;
        int result = 0;

        // We count the number of R's and L's until they are the same and then add to the counter
        for(char ch:s.toCharArray()){
            if (ch == 'R')
                rnum += 1;
            if (ch == 'L')
                lnum += 1;

            if (rnum == lnum){
                result += 1;
                rnum = 0;
                lnum = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
