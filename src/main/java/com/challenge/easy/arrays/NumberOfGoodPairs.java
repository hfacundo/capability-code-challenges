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

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        //Return the value for that key or the default value
        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        //Number of good pairs
        /*
         * count -1 = Possible pairs, the last one can't form a pair
         * count * (count - 1) = ways to choose pairs counted twice
         */
        for(int count : countMap.values()) {
            if(count > 1) {
                goodPairs += (count * (count - 1)) / 2;
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {

    }
}
