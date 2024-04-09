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
        triangle.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> pastRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                int n1 = 0;
                int n2 = 0;

                try {
                    n1 = (pastRow.get(j - 1));
                } catch (Exception ignored) {
                }
                try {
                    n2 = (pastRow.get(j));
                } catch (Exception ignored) {
                }

                row.add(n1 + n2);
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
