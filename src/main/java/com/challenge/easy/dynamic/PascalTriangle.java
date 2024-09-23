package com.challenge.easy.dynamic;

import java.util.List;
import java.util.ArrayList;

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
        
        List<List<Integer>> pascal = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            List<Integer> rowList = new ArrayList<>();
            int num = 1;
            for(int i = 1; i <= row; i++){
                rowList.add(num);
                num = (num * (row - i)) / i;
            }
            pascal.add(rowList);
        }
        return pascal;
    }

    public static void main(String[] args) {

    }
}
