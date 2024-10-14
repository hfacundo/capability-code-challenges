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
        Hashtable<Character,Integer> hashTable = new Hashtable<>();
        for (int i=0;i<s.length();i++){
            hashTable.put(s.charAt(i),hashTable.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<s.length();i++){
            if (hashTable.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}

