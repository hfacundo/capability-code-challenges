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

        HashMap<Character,Integer> letterInstances = new HashMap<>();

        // We save the index of the instance of the letter, if it repeats the index becomes -1
        for(int i=0; i < s.length(); i++){
            char ch = s.toCharArray()[i];

            if(letterInstances.containsKey(ch))
                letterInstances.put(ch,-1);
            else
                letterInstances.put(ch,i);
        }

        // We look for the lowest greater than -1 in the dict which is the first instance of a unique letter
        for(int i=0; i < s.length(); i++){
            if (letterInstances.containsValue(i))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
    }
}
