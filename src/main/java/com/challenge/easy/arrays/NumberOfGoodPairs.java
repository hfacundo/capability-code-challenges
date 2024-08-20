package com.challenge.easy.arrays;

/**
    # Number of Good Pairs

    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

    Example 2:
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.

    Example 3:
        Input: nums = [1,2,3]
        Output: 0

    Constraints:

        * 1 <= nums.length <= 100
        * 1 <= nums[i] <= 100

 */

import java.util.*;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
    	int result = 0;
    	
    	Map<Integer, Integer> list = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i<nums.length; i++) {
    		if(!list.containsKey(nums[i])) {
    			list.put(nums[i], 1);
    		} else {
    			list.put(nums[i], list.get(nums[i])+1);
    		} 		
    	}
    	
    	for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
    		if(entry.getValue() > 1) {
    			result += getCombinations(entry.getValue());
    		}
    	}
    	
        return result ;
    }
    
    public static int getCombinations(int value) {
    	int result = 0;
    
    	for(int i=1; i<value; i++) {
    		result += value - i;
    	}
    	
    	return result;
    }

    public static void main(String[] args) {
    	
    }
}
