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
        if (1 <= numRows && numRows <= 30){
            return generateTriangle(numRows); 
        }
        return null; 
    }

    public static List<List<Integer>> generateTriangle(int rows){
        
        List<List<Integer>> list = new ArrayList<>();

        for (int n = 0; n < rows; n++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (n > 0) {
                // Usamos la relación de recurrencia T[n][k] = T[n-1][k-1] + T[n-1][k]
                List<Integer> previousRow = list.get(n - 1);
                for (int k = 1; k < n; k++) {
                    row.add(previousRow.get(k - 1) + previousRow.get(k));
                }
            }
            if (n > 0) {
                row.add(1); 
            }
            list.add(row); 
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
