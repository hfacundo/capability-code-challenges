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
    /**
     * We need to traverse string character by character. We mantain a balance counter,
     * which increases by for each 'R' and decreases by '1' for each 'L'. Whenever the balance reach 0, it means the
     * substring up to that point is balanced, an we increment the count of balanced substrings.
     * We continue until we process the entire string
     * @param s
     * @return
     */
    public static int balancedStringSplit(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int balanceCounter = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i);
            // increase balanceCounter for 'R' and decrease balanceCounter for 'L'
            if(c == 'L'){
                balanceCounter--;
            }else if(c == 'R'){
                balanceCounter++;
            }
            // When balance reaches 0, we found a balanced String
            if(balanceCounter == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
