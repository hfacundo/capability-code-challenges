package com.challenge.easy.binarysearch;

/**
 * # Kth Missing Positive Number
 * <p>
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * <p>
 * Return the kth positive integer that is missing from this array.
 * <p>
 * Example 1:
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 * <p>
 * Example 2:
 * Input: arr = [1,2,3,4], k = 2
 * Output: 6
 * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 1000
 * 1 <= arr[i] <= 1000
 * 1 <= k <= 1000
 * arr[i] < arr[j] for 1 <= i < j <= arr.length
 * <p>
 * Follow up:
 * <p>
 * Could you solve this problem in less than O(n) complexity?
 */
public class KthMissingNumber {

    public static int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length, middle = 0;
        // While start will be less than end
        while (start < end) {
            // Set middle with the middle index of the array
            middle = (start + end) / 2;
            // Check if the numbers on the left side in the middle are less than k
            if (arr[middle] - 1 - middle < k)
                // The missing positive number is middle side after
                start = middle + 1;
            else
                // The missing positive number is middle side before
                end = middle;
        }
        return end + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 3;
        int ans = findKthPositive(arr, k);
        System.out.println(ans);
    }
}
