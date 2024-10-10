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
        if (s == null || s.length() == 0){
            return -1;
        }
        // Use map to store the frequency of each character
        HashMap<Character, Integer> mapFreq = new HashMap<>();
        // first iteration: count the frequency of each character
        for(Character c : s.toCharArray()){
            mapFreq.put(c, mapFreq.getOrDefault(c, 0) + 1);
        }
        // second iteration: find the first character with frequency 1
        for(int i = 0; i < s.length(); i++){
            if(mapFreq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        // return -1 if non-repeating character is found
        return -1;
    }

    public static void main(String[] args) {

    }
}
