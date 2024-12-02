package com.challenge.easy.twopointer;

import java.util.Arrays;

public class ShortestDistanceToChar {

    /**
     * Computes the shortest distance from each character in the string to the specified character.
     *
     * @param s The input string.
     * @param c The target character.
     * @return An array of distances.
     */
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        Arrays.fill(result, n); // Initialize with a large value

        int prev = -n; // Set to a very small value
        // Left-to-right pass
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = i - prev;
        }

        prev = 2 * n; // Set to a very large value
        // Right-to-left pass
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e'))); // Output: [3,2,1,0,1,0,0,1,2,2,1,0]
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));         // Output: [3,2,1,0]
    }
}
