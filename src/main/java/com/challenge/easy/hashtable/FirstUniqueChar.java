package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * # First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * <p>
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> mapByCharacters = new HashMap<>();
        final char[] charArray = s.toCharArray();
        for (char ch : charArray) {
            // If the character exists in the map, will be increment by 1 the repetition of this
            // Otherwise, will be put 1
            mapByCharacters.merge(ch, 1, Integer::sum);
        }
        // Iterate from index 0 until char array length -1
        for (int idx = 0; idx < charArray.length; idx++) {
            // Store the letter inside ch variable
            char ch = charArray[idx];
            // Check if in the map key given the char, is 1 the number of repetition
            if (mapByCharacters.get(ch) == 1) return idx;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));

    }
}
