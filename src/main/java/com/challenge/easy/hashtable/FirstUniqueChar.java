package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.Collections;
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

        HashMap<Character, Integer> table = new HashMap<>();
        HashMap<Character, Integer> unique = new HashMap<>();

        for (int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            if(!table.containsKey(c)){
                table.put(c, i);
                unique.put(c, i);
            }else{
                unique.remove(c);
            }
        }

        if(unique.isEmpty()) return -1;
        else return Collections.min(unique.values());
        
    }

    public static void main(String[] args) {

    }
}
