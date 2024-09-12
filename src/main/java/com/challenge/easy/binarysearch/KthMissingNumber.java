package com.challenge.easy.binarysearch;

import com.challenge.easy.arrays.FindWordsContainingCharacter;

import java.util.logging.Logger;

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
        int kCount=0, kValue=0, i=1, j=0;
        while(kCount!=k/*i<12*/){
            if(j == arr.length){
                j-=1;
            }
            if(i != arr[j]){
                kCount++;
                kValue=i;
            }
            if(i == arr[j]){
                j++;
            }
            i++;
        }
        return kValue;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindWordsContainingCharacter.class.getName());

        int nums[] = {2,3,4,7,11,14,15,16,20};
        int k = 5;

        logger.info("kth value = " + findKthPositive(nums, k));
    }
}
