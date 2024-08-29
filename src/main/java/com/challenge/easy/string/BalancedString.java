package com.challenge.easy.string;

import java.util.ArrayList;
import java.util.List;

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
    	
    	/*
    	Less lines - equal quantity of characters 
    	int res= 0;
    	int count = 0;
    	for(int i =0; i< s.length();i++) {
    		count += s.charAt(i) == 'R' ? 1 : -1;
    		if(count == 0) res++;
    	}
    	return res;
    	*/
    	
    	//Adding substring to list and count items
    	List<String> list = new ArrayList<>();
    	int countR = 0;
    	int countL = 0;
    	String substring = "";
    	for(int i = 0; i< s.length();i++) {    		
    		if(s.charAt(i) == 'R') {
    			countR++;
    		}else {
    			countL++;
    		}    		
    		
    		substring+= s.charAt(i);

    		if(countR == countL) {
    			list.add(substring);
    			substring = "";
    			countR = 0;
    	    	countL = 0;
    		}
    	}
        return list.size();
    }

    public static void main(String[] args) {
    	System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
}
