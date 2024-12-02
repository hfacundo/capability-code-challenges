package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    /**
     * Determines if the occurrences of each value in the array are unique.
     *
     * @param arr The input array of integers.
     * @return True if the number of occurrences is unique, false otherwise.
     */
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each value
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if all occurrence counts are unique
        Set<Integer> uniqueCounts = new HashSet<>(frequencyMap.values());
        return uniqueCounts.size() == frequencyMap.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3})); // Output: true
        System.out.println(uniqueOccurrences(new int[]{1, 2}));             // Output: false
        System.out.println(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})); // Output: true
    }
}
