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
        int kthPositive = 0 ;
        if (1 <= arr.length && arr.length <= 1000) {
            kthPositive = binarySearch(arr,k);
        }
        return kthPositive;
    }

    public static int binarySearch (int[] list , int k) {
        int low = 1;
        int high = list.length - 1 + k;
        int mid = 0; int count = 0 ; int missingUntilMid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            count = countLessThanOrEquaTo(list, mid);
            missingUntilMid = mid - count;
            if (missingUntilMid < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int countLessThanOrEquaTo(int[] arr , int x){
        int count = 0;
        for (int num : arr){
            if (num <= x) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
