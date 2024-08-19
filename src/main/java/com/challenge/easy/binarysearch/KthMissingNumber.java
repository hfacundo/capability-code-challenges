package com.challenge.easy.binarysearch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        List<Integer> array = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> range = IntStream.range(1, arr[arr.length-1]).boxed().collect(Collectors.toList());

        range.removeAll(array);

        if (range.size() >= k)
            return range.get(k-1);

        if (range.isEmpty()) {
            return IntStream.range(array.size()+1, array.size()+k+1).boxed().collect(Collectors.toList()).get(k-1);
        } else {
            range.addAll(IntStream.range(range.get(range.size()-1)+1, range.size()+k-1).boxed().collect(Collectors.toList()));
            return range.get(k-1);
        }
    }

    public static void main(String[] args) {

    }
}
