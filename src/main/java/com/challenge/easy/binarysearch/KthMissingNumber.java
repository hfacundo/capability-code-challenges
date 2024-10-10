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
    /**
     * Because is a positive sorted array, for example for the index-zero based
     * array with 10 elements without missing elements is [1,2,3,4,5,6,7,8,9,10]
     * where arr[i] value is index i+1. Note i starts from zero.
     *
     * Then for each position i in the array, the number of missing numbers up to
     * arr[i] is arr[i] - (i+1). Example: for array [2,4,6], The number of missing
     * numbers from index=2 is array[2] -  (index+1) = 6 - (2+1) = 6 - 3 = 3 missing
     * numbers: 1,3 and 5. At index 0, array[0] - (0+1) = 2 - 1 = 1 missing numner: 1.
     * At index 1, array[1] - (1+1) = 4 - 2 = 2 missing numbers: 1 and 3
     *
     * If we need to find the range in which k missing number falls, we can use
     * binary search
     * @param arr of numberss
     * @param k missing numbers
     * @return
     */
    public static int findKthPositive(int[] arr, int k) {
        if(arr == null || arr.length < k){
            return 0;
        }
        // for binary search we define the indices of the array
        int left = 0, right = arr.length - 1;
        while(left <= right){
            // We define the middle point to halve the array
            int mid = left + (right - left) / 2;
            // Calculate how many numbers aare missing up to arr[mid]
            int missing = arr[mid] - (mid+1);
            // We compare if the number of missing numbers is less than k(what we need to find
            // with binary search, the k missing numbers)
            if(missing < k){
                // we move to the right half
                left = mid + 1;
            }else{
                // we move to the left half
                right = mid - 1;
            }
        }
        // after left and right indices cross, we return the number that
        // is missing up to position left

        return left + k;
    }

    public static void main(String[] args) {

    }
}
