package com.challenge.easy.hashtable;

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

import java.util.*;
import java.util.Hashtable;
import java.util.Enumeration;
import java.lang.*;

public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
    	boolean ocurrences = false;
    	Hashtable<Integer, Integer> map = new Hashtable<>();
    	Set <Integer> uniques = new HashSet<Integer>();
    	
    	//count
    	for(int i=0; i<arr.length; i++) {
    		if (map.containsKey(arr[i])) {
    			map.put(arr[i], map.get(arr[i]) + 1);
    		} else {
    			map.put(arr[i], 1);
    		 }
    	}
    	
    	Enumeration<Integer> e = map.keys();
    	
    	 while (e.hasMoreElements()) {
    		 int key = e.nextElement();
    		 uniques.add(map.get(key));    	 	
    	 }
    		    	 
    	 if(map.size() == uniques.size()) {
    		 ocurrences = true;
    	 }
    	 
        return ocurrences;
    }

    public static void main(String[] args) {
    	//System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
