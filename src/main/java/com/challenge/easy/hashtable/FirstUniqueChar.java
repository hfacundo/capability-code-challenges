package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new LinkedHashSet<>();
        for(Character c : s.toCharArray()){
            map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), 0)+1);
            set.add(String.valueOf(c));
        }
        for (String si : set) {
            if(map.get(si)==1){
                return s.indexOf(si);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
