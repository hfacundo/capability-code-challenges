package com.challenge.easy.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
    # Pascal's Triangle

     Given an integer numRows, return the first numRows of Pascal's triangle.

     In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

                1
               1 1
              1 2 1
             1 3 3 1
            1 4 6 4 1

     https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif

     Example 1:
         Input: numRows = 5
         Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

     Example 2:
         Input: numRows = 1
         Output: [[1]]

     Constraints:

        * 1 <= numRows <= 30

 */
public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> output = new ArrayList<>();
    	output.add(Arrays.asList(1));
    	
    	for(int i = 1; i < numRows; i++) { 
    		
    		List<Integer> innerList = new ArrayList<>();    		
    		innerList.add(1);

    		List<Integer> numbers = output.get(i-1); 
    		
    		for(int j = 1; j<i; j++) { 
    			innerList.add(numbers.get(j-1) + numbers.get(j));
    		}
    		
    		innerList.add(1);
    		output.add(innerList);

    	}
    	
    	return output;
    }


    public static void main(String[] args) {
    	System.out.println(Arrays.toString(generate(6).toArray()));
    }
}
