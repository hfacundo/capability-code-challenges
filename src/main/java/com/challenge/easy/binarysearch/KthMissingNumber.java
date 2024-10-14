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

    static int missedNumbers(int[] nums, int pos) {
        //numberOfMissingNumbersBeforeOf1stElemt se utiliza para checar si antes de la posicion inicial hay mas elementos perdidos
        int numberOfMissingNumbersBeforeOf1stElement = nums[0] - 1;
        //aux se suma en el resultado para agregar los elementos perdidos antes del primer elemento del arreglo
        return nums[pos] - nums[0] - pos + numberOfMissingNumbersBeforeOf1stElement;
    }

    public static int findKthPositive(int[] arr, int k) {
        int left=0, right=arr.length-1,arrayLength=arr.length,mid=0;

        if (k > missedNumbers(arr,arrayLength-1))
            return arr[arrayLength-1] + k - missedNumbers(arr,arrayLength-1);

        while (left < right){
            mid= (left + right) / 2;
            if (missedNumbers(arr,mid) >= k){
                right=mid;
            }else {
                left= (mid + 1);
            }
        }

        return arr[left-1] + k - missedNumbers(arr,left-1);
    }

    public static void main(String[] args) {

    }
}
