package com.challenge.easy.binarysearch;

/**
    # Kth Missing Positive Number

     Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

     Return the kth positive integer that is missing from this array.

     Example 1:
         Input: arr = [2,3,4,7,11], k = 5
         Output: 9
         Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

     Example 2:
         Input: arr = [1,2,3,4], k = 2
         Output: 6
         Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

     Constraints:

         * 1 <= arr.length <= 1000
         * 1 <= arr[i] <= 1000
         * 1 <= k <= 1000
         * arr[i] < arr[j] for 1 <= i < j <= arr.length

     Follow up:

     Could you solve this problem in less than O(n) complexity?
 */
public class KthMissingNumber {

    public static int findKthPositive(int[] arr, int k) {

        // Starting variables, to control the binary search and to
        int pivotIdx;
        int arrLen = arr.length;
        int start = 0;
        int end = arrLen-1;

        // Starting variables that are used to control the conditions in binary search
        int missingNo = 0; // Number of missing values in the respective position
        int pivotValue; // If the array had no missing number up to the pivot index this should be the value in that index

        // If the missing number wouldn't be present in the array it gets calculated right away using the length of the array and k
        // Examples:
        // [1,2,3,4] k = 5 len = 4 result = 9
        // [1,4] k = 5 len = 2 (The lower length offsets the result) result = 7
        if(arrLen + k > arr[arrLen-1])
            return arrLen+k;

        // Binary search to find the first element that goes after k missing numbers and use it to calculate it
        while (start <= end) {

            pivotIdx = (end + start) / 2;
            pivotValue = pivotIdx + 1;

            // Calculate quantity of missing numbers
            missingNo = arr[pivotIdx] - pivotValue;

            // If there are missing numbers less than k reduce the lower limit
            if (missingNo < k)
                start = pivotIdx + 1;
            // If there is a number before pivot and the quantity of missing numbers is greater or equal to k, reduce the upper limit
            else if (pivotIdx-1 >= start && arr[pivotIdx-1] - (pivotValue-1) >= k)
                end = pivotIdx;
            // if there is no lower number that satisfies the previous condition calculate the result
            else
                return arr[pivotIdx] - (missingNo - k) - 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
        System.out.println(findKthPositive(new int[]{3,4,7,11}, 2));
        System.out.println(findKthPositive(new int[]{1,2,3,4}, 2));
        System.out.println(findKthPositive(new int[]{1,2,3,4,6}, 2));
    }
}
