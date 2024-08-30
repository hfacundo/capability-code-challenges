package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (int number : arr) {
            if (occurrences.containsKey(String.valueOf(number))) {
                occurrences.replace(String.valueOf(number), occurrences.get(String.valueOf(number)) + 1);
            } else {
                occurrences.put(String.valueOf(number), 1);
            }
        }

        return occurrences.values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()).isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{4, 4, 5, 5, 6, 6, 4, 2, 2, 2 , 2}));
    }
}
