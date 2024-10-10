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
        // validate edge cases
        if(arr == null || arr.length == 0) {
            return false;
        }
        // store the frequency of each integer in the array
        Map<Integer, Integer> mapFreq = new HashMap<>();
        // store the frequency in a hashset to check if we encounter duplicate frequencies
        Set<Integer> seenFreq = new HashSet<>();

        // first iteration we store the frequency of each integer
        for (int j : arr) {
            mapFreq.put(j, mapFreq.getOrDefault(j, 0) + 1);
        }
        // second iteration, if we found that a frequency is duplicated
        // we immediately return false
        for(Integer val: mapFreq.values()) {
            if(!seenFreq.add(val)) {
                return false;
            }
        }
        // we return true if the second for validation does not find duplicate frequencies
        return  true;
    }

    public static void main(String[] args) {


    }
}
