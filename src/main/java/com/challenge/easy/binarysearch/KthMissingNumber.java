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
    	
    	int start = 0;
    	int end = arr.length -1;
    	while (start <= end) {
    		int mid = (start + end) / 2;
    		if((arr[mid] - mid - 1) < k) { 
    			start = mid + 1;		 
    		}else {
    			end = mid-1;
    		}
    	}
    	    	
        return start + k;
    }

    public static void main(String[] args) {
    	System.out.println(findKthPositive(new int[] {2,3,4,7,11}, 5));
    }
}
