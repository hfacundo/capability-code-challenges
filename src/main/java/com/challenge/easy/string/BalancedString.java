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
        int balancedSub = 0;
        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            int rs = 0;
            int ls = 0;
            for (char c : s.substring(start, (i+1)).toCharArray()) {
                if (c == 'R') rs++;
                else if (c == 'L') ls++;
                if (rs == ls) {
                    balancedSub++;
                    start = i + 1;
                    i++;
                }
            }
        }
        return balancedSub;
    }

    public static void main(String[] args) {
        //System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
}
