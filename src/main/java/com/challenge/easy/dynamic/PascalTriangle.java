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

        List<List<Integer>> triangle = new ArrayList<>();

        for(int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for(int col = 0; col <= row; col++) {
                if(col == 0 || col == row) {
                    //The first and last elements of each row are always 1
                    currentRow.add(1);
                } else {
                    //Sum of two elements above it
                    int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    currentRow.add(value);
                }
            }
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
