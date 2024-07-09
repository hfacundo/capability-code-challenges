package com.challenge.easy.dynamic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
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
        if(numRows == 1 )
            triangle.add(List.of(1));
        else if (numRows == 2) {
            triangle.add(List.of(1));
            triangle.add(List.of(1,1));
        }
        else {
            triangle.add(List.of(1));
            triangle.add(List.of(1,1));
            for (int i = 1; i < numRows -1; i++) {
                List<Integer> tmpRow = triangle.get(i);
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 0; j < i; j++) {
                    row.add(tmpRow.get(j) + tmpRow.get(j+1));
                }
                row.add(1);
                triangle.add(row);
            }
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
