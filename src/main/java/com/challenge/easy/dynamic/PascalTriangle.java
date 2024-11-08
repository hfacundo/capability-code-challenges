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
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row;

        for (int i = 1; i <= numRows; i++) {
            row = new ArrayList<>();

            if(i == 1)
                row.add(1);
            else{
                List<Integer> temp = res.getLast();
                row.add(1);
                for(int c = 0; c < temp.size() -1; c++) {
                    row.add(temp.get(c) + temp.get(c + 1));
                }
                row.add(1); 
            }            
            res.add(row);
        }
        return res;        
    }

    public static void main(String[] args) {
    }
}
