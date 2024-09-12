package com.challenge.easy.binarysearch;

import java.util.ArrayList;

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
//     	int nums[] = {1,2,3,4};
//       	int k =2;
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	for (Integer integer : arr) {
    		lista.add(integer);
    	}
    	ArrayList<Integer> resultado = new ArrayList<Integer>();
       	int lastNum = arr[arr.length-1];
       	
       	for (int i = 1; i <= lastNum; i++) {
    		if (!lista.contains(i)) {
    			resultado.add(i);
    		}
    		if (resultado.size() == k) {
//    		   	System.out.println("Resultado::"+i);
    			break;
    		}
    	}
       	if (resultado.size() == 0) {
       		for (int i = lastNum+1; resultado.size() < k; i++) {
       			resultado.add(i);
       		}	
    	}
       	
       	
//       	System.out.println(resultado.getLast());
        return resultado.size() != 0 ? resultado.getLast():0;
    }

    public static void main(String[] args) {
  
    }
}
