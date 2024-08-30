package com.challenge.easy.arrays;

import java.util.Arrays;

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
        Arrays.sort(nums);
        int goodPairs = 0;
        int sequence = 1;
        for(int i = 0; i < nums.length; i++) {
            if(i+1 < nums.length){
                if(nums[i] == nums[i+1]){
                    sequence++;
                    goodPairs = goodPairs + sequence -1;
                }
                else{
                    sequence = 1;
                }
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfGoodPairs.numIdenticalPairs(new int[]{7,4,5,6, 3, 3, 3, 3 ,3 ,3 }));
    }
}
