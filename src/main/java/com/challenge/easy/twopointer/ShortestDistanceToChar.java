package com.challenge.easy.twopointer;


import java.util.Arrays;

/**
 * # Shortest Distance To A Character
 * <p>
 * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
 * <p>
 * The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
 * <p>
 * Example 1:
 * Input: s = "loveleetcode", c = "e"
 * Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 * Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
 * The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
 * The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
 * For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
 * The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
 * <p>
 * Example 2:
 * Input: s = "aaab", c = "b"
 * Output: [3,2,1,0]
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s[i] and c are lowercase English letters.
 * It is guaranteed that c occurs at least once in s.
 */
public class ShortestDistanceToChar {

    public static int[] shortestToChar(String s, char c) {
        // Find the first index where c appears
        int indexWhereCAppears = s.indexOf(c);
        // Create result array
        int[] res = new int[s.toCharArray().length];
        for (int index = 0; index < s.toCharArray().length; index++) {
            // Check if the value at the index position is equals to c
            if (s.charAt(index) == c) {
                // Set value to zero
                res[index] = 0;
                // Set the index where c appears to the current index
                indexWhereCAppears = index;
            } else {
                // 1. s.substring(indexWhereCAppears + 1) => Cut the string, 1 position after where c appears
                // .indexOf(c) + 1 => Find the first index where c appears (index 0 to length)
                // +1 to get the counting where c appears
                // + indexWhereCAppears = Add the current index where C has appeared
                // - index = subtract the current index to get what is the following "less" distance
                int followingDistanceWhereCAppears = Math.abs((s.substring(indexWhereCAppears + 1).indexOf(c) + 1 + indexWhereCAppears) - index);
                // Subtract the index where c appears minus the current index
                int currentDistanceWhereCAppears = Math.abs(indexWhereCAppears - index);
                // Get the shortest distance
                res[index] = Math.min(currentDistanceWhereCAppears, followingDistanceWhereCAppears);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = shortestToChar("loveleetcode", 'e');
        System.out.println(Arrays.toString(res));
    }
}
