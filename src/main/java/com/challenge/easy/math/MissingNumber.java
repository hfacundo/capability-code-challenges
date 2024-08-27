package com.challenge.easy.math;

/**
 * # Missing Number
 * <p>
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * <p>
 * Example 2:
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * <p>
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        // Create new array of Integer's from index 0 to the length of num array + 1
        // This to populate only with the number that exist inside num array
        Integer[] orderNumbers = new Integer[nums.length + 1];
        // Populate only with the number exists on num array
        for (int num : nums) orderNumbers[num] = num;
        for (int iteration = 0; iteration < orderNumbers.length; iteration++) {
            // Check where the value of the given index is null, this is the missing number
            if (orderNumbers[iteration] == null) return iteration;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 0, 1};
        System.out.println(missingNumber(numbers));
    }
}
