package com.challenge.easy.binarysearch;

public class KthMissingNumber {

    /**
     * This method finds the kth missing positive integer in a sorted array.
     *
     * @param arr Array of positive integers in strictly increasing order.
     * @param k   The kth missing positive number to find.
     * @return The kth missing positive integer.
     */
    public static int findKthPositive(int[] arr, int k) {
        int missingCount = 0; // Counter for missing numbers
        int current = 1;     // Start checking from the first positive integer
        int index = 0;       // Index to traverse the array

        // Continue until we find the kth missing number
        while (missingCount < k) {
            // Check if the current number exists in the array
            if (index < arr.length && arr[index] == current) {
                index++; // Move to the next element in the array
            } else {
                missingCount++; // Increment the missing number count
            }
            if (missingCount < k) {
                current++; // Move to the next number
            }
        }

        return current; // Return the kth missing positive number
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)); // Output: 9
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2));     // Output: 6
        System.out.println(findKthPositive(new int[]{3, 6, 8}, 4));        // Output: 5
    }
}
