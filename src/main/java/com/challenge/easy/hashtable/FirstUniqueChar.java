package com.challenge.easy.hashtable;

/**
    # First Unique Character in a String
     Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

     Example 1:
         Input: s = "leetcode"
         Output: 0

     Example 2:
         Input: s = "loveleetcode"
         Output: 2

     Example 3:
         Input: s = "aabb"
         Output: -1


     Constraints:

         * 1 <= s.length <= 105
         * s consists of only lowercase English letters.
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {

    	for(int i = 0; i<s.length(); i++) {    		
    		String textRight = s.substring(i+1);
    		String textleft = s.substring(0, i);
    		if(textRight.indexOf(s.charAt(i)) == -1 && textleft.indexOf(s.charAt(i)) == -1) return i;
    	}
        return -1;
    }

    public static void main(String[] args) {    	
    	System.out.println(firstUniqChar("aabb"));
    }
}
