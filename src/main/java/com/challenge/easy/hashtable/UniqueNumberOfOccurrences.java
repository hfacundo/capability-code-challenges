package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
    # Unique Number of Occurrences

     Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

     Example 1:
         Input: arr = [1,2,2,1,1,3]
         Output: true
         Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

     Example 2:
         Input: arr = [1,2]
         Output: false

     Example 3:
         Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
         Output: true

     Constraints:

         * 1 <= arr.length <= 1000
         * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0 ; i < arr.length; i++) {
            int occurrence = occurrences.getOrDefault(arr[i], 0);
            occurrences.put(arr[i], occurrence + 1);
        }

        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (int occurrence : occurrences.values()) {
            if (uniqueOccurrences.contains(occurrence)) {
                return false;
            }
            uniqueOccurrences.add(occurrence);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
