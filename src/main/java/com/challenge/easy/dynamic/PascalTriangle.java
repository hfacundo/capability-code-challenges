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
         Input: numRows =
         Output: [[1]]

     Constraints:

        * 1 <= numRows <= 30

 */
public class PascalTriangle {

    /*
    Algorithm explanation:

    The next row is defined by adding the elements of the previous row with an offset of 1, example

    [1,3,3,1]
      [1,3,3,1]
    -----------
    [1,4,6,4,1]

     */


    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows < 1) return result;

        // The first element of the triangle is added and returned if its the only row

        result.add(new ArrayList<>());

        result.get(0).add(1);

        if (numRows == 1) return result;

        // For each row

        for (int i=1;i<numRows;i++){

            result.add(new ArrayList<>());

            // The previous row is copied
            for (int j = 0; j < result.get(i-1).size(); j++) {
                result.get(i).add(result.get(i-1).get(j));
            }

            // We add the elements of the previous row to the element of the current one with an offset of 1
            for (int j = 1; j < result.get(i-1).size(); j++) {
                result.get(i).set(j,result.get(i).get(j) + result.get(i-1).get(j-1));
            }

            // The last 1 is added at the end of the row
            result.get(i).add(1);

        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> test1 = PascalTriangle.generate(5);

    }
}
