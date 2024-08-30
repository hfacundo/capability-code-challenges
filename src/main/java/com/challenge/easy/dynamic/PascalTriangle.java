package com.challenge.easy.dynamic;

import java.util.LinkedList;
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
        List<List<Integer>> result = new LinkedList<>();
        for( int i = 0; i < numRows; i++ ){
            List<Integer> row = new LinkedList<>();
            row.add(1);
            if ( i > 0){
               List<Integer> beforeRow = result.get(i-1);
               for(int j = 1; j < beforeRow.size(); j++){
                   row.add(beforeRow.get(j-1) + beforeRow.get(j));
               }
               row.add(1);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PascalTriangle.generate(5));
    }
}
