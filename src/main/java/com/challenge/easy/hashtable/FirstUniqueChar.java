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
import java.util.*;
import java.util.Hashtable;
import java.lang.*;

public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
    	int index = -1;
    	Hashtable<Character, Integer> map = new Hashtable<>();
    	char c = ' '; 
    	
    	//count
    	for(int i=0; i<s.length(); i++) {
    		c = s.charAt(i);
    		if (map.containsKey(c)) {
    			map.put(c, map.get(c) + 1);
    		} else {
    			map.put(c, 1);
    		 }
    	}
    	
    	//find unique
    	for(int i=0; i<s.length(); i++) {
    		c = s.charAt(i);
    		if(map.get(c) == 1) {
    			index = i;
    			break;
    		}
    	}
    	    	
        return index;
    }

    public static void main(String[] args) {
    	//System.out.println(firstUniqChar("loveleetcode"));
    }
}
