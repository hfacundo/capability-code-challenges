package com.challenge.easy.arrays;

import java.util.HashMap;

/**
    # Number of Good Pairs

    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

    Example 2:
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.

    Example 3:
        Input: nums = [1,2,3]
        Output: 0

    Constraints:

        * 1 <= nums.length <= 100
        * 1 <= nums[i] <= 100

 */
public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        // HashMap tp store the frequency of each number
        HashMap<Integer, Integer> mapFrequency = new HashMap<>();
        int totalPairs = 0;

        // iterate through the array
        for(int i = 0; i < nums.length; i++) {
            // if the number has been seen before, it can form good pairs
           if(mapFrequency.containsKey(nums[i])) {
               // add the current frequency to good pairs count(since each
               // previous occurrence of the number forms a good pair).
               // for example we store for '1' frequency 1 at index 1
               // then we found another '1' at index 3, we get the current frequency '1' and added to
               // totalPairs(current 0)=1
               // we update the frequency of 1 to (2)
               // we find another '1' at index 5, we get frequency 2 and added to counter, now is
               // 3 good pairs, because
               // '1' index '1' with '1' index 3,
               // '1' index '1' with '1' index '5'
               // '1' index '3' with '1' index '5'. Its 3 good pairs
               // adding the current frequency for a number and adding to counter gives us
               // the number of good pairs
               totalPairs += mapFrequency.get(nums[i]);
           }
           // update the frequency of the number
           mapFrequency.put(nums[i], mapFrequency.getOrDefault(nums[i], 0) + 1);

        }
        return totalPairs;
    }

    public static void main(String[] args) {

    }
}
