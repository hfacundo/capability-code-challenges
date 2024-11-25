package com.challenge.easy.hashtable;

import java.util.HashMap;
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

        HashMap<Integer, Integer> occurrences = new HashMap<>();

        // First the number of occurrences is stored in a dict
        for (int i : arr)
            if (occurrences.containsKey(i))
                occurrences.put(i,occurrences.get(i)+1);
            else
                occurrences.put(i,1);

        HashMap<Integer,Integer> noOfOccurrencesInstances = new HashMap<>();

        // We iterate over the number of occurrences if it repeats we return false
        for (int key : occurrences.keySet()) {

            if (noOfOccurrencesInstances.containsKey(occurrences.get(key)))
                return false;

            noOfOccurrencesInstances.put(occurrences.get(key),1);
        }

        return true;
    }

    public static void main(String[] args) {
    }
}
