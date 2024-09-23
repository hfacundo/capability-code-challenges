package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
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

        HashMap<Integer, Integer> table = new HashMap<>();
        for(int number : arr){
            if(table.containsKey(number)){
                table.put(number, table.get(number) + 1);
            }else{
                table.put(number, 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();

        for(int value : table.values()){
            if(!set.add(value)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
