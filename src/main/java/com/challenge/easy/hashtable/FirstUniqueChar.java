package com.challenge.easy.hashtable;

import java.util.HashMap;

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
        HashMap<Character, Integer> frecuency = new HashMap<>();
        for (char letter : s.toCharArray()){
            frecuency.put(letter, frecuency.getOrDefault(letter, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++){
            if (frecuency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /*System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));*/
    }
}
