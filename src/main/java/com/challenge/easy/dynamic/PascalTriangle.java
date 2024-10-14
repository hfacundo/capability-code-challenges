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
        List<List<Integer>> pyramid = new ArrayList<>();
        for (int i = 0; i < numRows ; i++) {
            if (pyramid.isEmpty()) {
                pyramid.add(List.of(1));
            } else {
                pyramid.add(generateRow(pyramid.get(i - 1)));
            }
        }
        return pyramid;
    }

    public static List<Integer> generateRow(List<Integer> previousRow) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(previousRow.get(0));
        for (int i = 1; i < previousRow.size()  ; i++) {
            int newValue = previousRow.get(i - 1) + previousRow.get(i);
            currentRow.add(newValue);
        }
        currentRow.add(previousRow.get(previousRow.size() - 1));

        return currentRow;
    }

    public static void main(String[] args) {

    }
}
