package com.challenge.easy.hashtable;

import java.util.*;

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

    public static int firstUniqueChar(String s) {
        Map<Character, Integer> occurrences = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int times = occurrences.getOrDefault(c, 0);
            occurrences.put(c, times + 1);
        }

        for(int i=0 ; i<s.length() ; i++) {
            if (1 == occurrences.get(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
