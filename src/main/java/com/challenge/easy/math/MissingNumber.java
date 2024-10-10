package com.challenge.easy.math;

/**
    # Missing Number

     Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

     Example 1:
         Input: nums = [3,0,1]
         Output: 2
         Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

     Example 2:
         Input: nums = [0,1]
         Output: 2
         Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

     Example 3:
         Input: nums = [9,6,4,2,3,5,7,0,1]
         Output: 8
         Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

     Constraints:

         * n == nums.length
         * 1 <= n <= 104
         * 0 <= nums[i] <= n
         * All the numbers of nums are unique.
 */
public class MissingNumber {

    /**
     * The sum of the first n natural numbers can be calculated using this formula:
     * sum[0,n] = n(n+1)/2
     * The missing number can be found by subtracting the actual sum of the array from the
     * expected sum
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of the numbers from 0 to n
        int expectedSum = n*(n+1)/2;
        // actual sum
        int actualSum = 0;
        // Calculate the actual sum of the numbers of the array
        for(int value: nums){
            actualSum += value;
        }
        // the missing number is the differentce between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

    }
}
