package com.challenge.easy.arrays;

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
        Explanation: Each pair in the array are good. (0,1) ,(0,2), (0,3), (1,2), (1,3), (2,3)

    Example 3:
        Input: nums = [1,2,3]
        Output: 0

    Constraints:

        * 1 <= nums.length <= 100
        * 1 <= nums[i] <= 100

 */
public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int result = 0 ;
        if (1 <= nums.length && nums.length <= 100){
            result = getPairs(nums);
        } 
        return result;
    }

    public static int getPairs(int[] list ) {
        int count = 0;
        for(int i = 0 ; i < list.length ; i++) {
            for( int j = i + 1 ; i < j && j < list.length; j++) {
                if ((list[i] == list[j]) && (list[i] <=100 && 1 <= list[i])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
