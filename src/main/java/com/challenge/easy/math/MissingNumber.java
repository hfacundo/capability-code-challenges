package com.challenge.easy.math;

public class MissingNumber {

    /**
     * Finds the missing number in the range [0, n] from the input array.
     *
     * @param nums The input array containing n distinct numbers in the range [0, n].
     * @return The missing number.
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int arraySum = 0;

        // Calculate the sum of the array
        for (int num : nums) {
            arraySum += num;
        }

        // Missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));        // Output: 2
        System.out.println(missingNumber(new int[]{0, 1}));           // Output: 2
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); // Output: 8
    }
}
