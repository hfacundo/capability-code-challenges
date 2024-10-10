package com.challenge.easy.dynamic;

import java.util.ArrayList;
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
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        // return an empty triangle if numRows == 0
        if (numRows == 0) {
            return triangle;
        }
        // first row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            // first element of each row is '1'
            currentRow.add(1);

            // fill in the middle elements
            for (int j = 1; j < i; j++) {
                int value = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(value);
            }
            // last element of each row is '1'
            currentRow.add(1);
            // add the current row to the triangle
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
