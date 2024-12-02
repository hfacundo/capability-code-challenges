package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    /**
     * Finds the index of the first unique character in a string.
     *
     * @param s The input string.
     * @return The index of the first non-repeating character, or -1 if none exists.
     */
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));     // Output: 0
        System.out.println(firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(firstUniqChar("aabb"));         // Output: -1
    }
}
