package com.challenge.easy.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        Map<Long, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            if(map.containsValue(num)) {
                continue;
            }
            long count = Arrays.stream(arr).filter(n -> n == num).count();
            if(map.containsKey(count)) {
                return false;
            }
            map.put(count, num);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
