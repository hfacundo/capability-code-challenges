package com.challenge.easy.arrays;


/**
 * # Number of Good Pairs
 * <p>
 * Given an array of integers nums, return the number of good pairs.
 * <p>
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * <p>
 * Example 2:
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * <p>
 * Example 3:
 * Input: nums = [1,2,3]
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        // TODO: It's not the best way
        int goodPairs = 0;
        for(int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = index1; index2 < nums.length; index2++) {
                if( index1 < index2 && nums[index1] == nums[index2]) goodPairs++;
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(numbers));
    }
}
