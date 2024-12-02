package com.challenge.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    /**
     * This method calculates the number of good pairs in the array.
     * A pair (i, j) is good if nums[i] == nums[j] and i < j.
     *
     * @param nums Array of integers.
     * @return The number of good pairs.
     */
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        // Count occurrences of each number and calculate good pairs
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                // If the number has been seen before, add its count to goodPairs
                goodPairs += countMap.get(num);
            }
            // Update the count of the number
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // Output: 4
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}));       // Output: 6
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3}));          // Output: 0
    }
}
