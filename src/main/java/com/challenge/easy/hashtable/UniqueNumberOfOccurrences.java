package com.challenge.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * # Unique Number of Occurrences
 * <p>
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * <p>
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * <p>
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * <p>
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapNumbers = new HashMap<>();
        // List where it will be store the repetition of numbers
        List<Integer> repeated = new ArrayList<>();
        for (int num : arr) {
            // If it doesn't exist the number, will be put 1 within the value
            // Otherwise will be sum the current value plus 1
            mapNumbers.merge(num, 1, Integer::sum);
        }
        // Iterate throw the map
        for (Map.Entry<Integer, Integer> entry : mapNumbers.entrySet()) {
            // Check if within repeated arraylist exists the number of repetition
            if (repeated.contains(entry.getValue())) return false;
            // Otherwise add the repetition on to arraylist
            else repeated.add(entry.getValue());
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr));
    }
}
