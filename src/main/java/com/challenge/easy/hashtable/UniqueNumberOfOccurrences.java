package com.challenge.easy.hashtable;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
    # Unique Number of Occurrences

     Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

     Example 1:
         Input: arr = [1,2,2,1,1,3]
         Output: true
         Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

     Example 2:
         Input: arr = [1,2]
         Output: false

     Example 3:
         Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
         Output: true

     Constraints:

         * 1 <= arr.length <= 1000
         * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
    	Boolean result = true;
//    	int arr[] =  {-3,0,1,-3,1,1,1,-3,10,0};
    	Map<Integer, Integer> lista = new LinkedHashMap<Integer, Integer>();
    	Set<Integer> noDuplicates = new HashSet<Integer>();
    	for (int number : arr) {
    		if (!lista.containsKey(number)) {
    			lista.put(number, 0);	
			}else {
				lista.put(number, lista.get(number)+1);
			}	
		}
    	for (Map.Entry<Integer, Integer> entry : lista.entrySet()) {
//    		Integer key = entry.getKey();
    		Integer val = entry.getValue();
    		if(!noDuplicates.add(val)) {
    			result = false;
    			break;
    		}
		}
    	return result;
//    	System.out.println("El resultado es:: "+result);
//    	System.out.println(lista.toString());
    }

    public static void main(String[] args) {

    }
}
