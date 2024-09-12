package com.challenge.easy.string;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.logging.Logger;

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
        String currentSubstring;
        int i, countOfBalancedStrings=0, incrementForBegin=2, incrementForEnd=2;
        if(!isBalanced(s)){
            return -1;
        }

        for(i=0; i<(s.length()); i+=incrementForBegin){
            if(i < s.length()){
                currentSubstring = s.substring((i),(i+incrementForEnd));
                if(isBalanced(currentSubstring)){
                    System.out.println("Balanced Substring: "+currentSubstring);
                    countOfBalancedStrings++;
                    incrementForBegin = (i+incrementForEnd)-i;
                    incrementForEnd=2;
                }else{
                    if((i+incrementForEnd) >= s.length()){
                        return countOfBalancedStrings;
                    }
                    i-=incrementForBegin;
                    incrementForEnd+=2;
                }
            }
        }
        return countOfBalancedStrings;
    }

    public static boolean isBalanced(String substring){
        int numberOfL=0, numberOfR=0, i=0;
        char currentChar;
        while(i<substring.length()){
            currentChar = substring.charAt(i);
            if(currentChar == 'R'){
                numberOfR++;
            }
            if(currentChar == 'L'){
                numberOfL++;
            }
            i++;
        }
        return (numberOfL==numberOfR) ? true:false ;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());

        String s = "RLRRLLRLRL";
        int maximumNumberOfBalancedStrings = balancedStringSplit(s);

        logger.info("Maximum Number Of Balanced Strings: "+maximumNumberOfBalancedStrings);
    }
}
