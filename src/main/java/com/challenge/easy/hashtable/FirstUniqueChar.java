package com.challenge.easy.hashtable;

import java.util.Hashtable;

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
        Hashtable<Character, Integer> letters = new Hashtable<>();
        int n = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (letters.containsKey(c)) {
                letters.replace(c, letters.get(c)+1);
            } else {
                letters.put(c, n);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (letters.get(c) == 1) {
                return s.indexOf(c);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
