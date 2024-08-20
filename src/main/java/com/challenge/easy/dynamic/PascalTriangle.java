package com.challenge.easy.dynamic;

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
import java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> triangle = new ArrayList<>();
    	List<Integer> row = new ArrayList<Integer>();
    	
    	for(int i=0; i<numRows; i++) {
    		  
    		for (int j=0; j<=i; j++) {
                row.add(factorial(i) / (factorial(i - j) * factorial(j)));
            }
    		
    		triangle.add(new ArrayList<Integer>(row));
    		row.clear();
    	}
    	
        return triangle;
    }
    
    public static int factorial(int n) {
    	if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
    	//System.out.println(generate(5));
    }
}
