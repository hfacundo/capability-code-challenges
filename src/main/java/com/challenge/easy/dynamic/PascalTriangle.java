package com.challenge.easy.dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
        List<List<Integer>> valueTriangle = new ArrayList<>();
        IntStream.range(0,numRows).forEach(i->{
            List<Integer> row = new ArrayList<>();
            IntStream.range(0,i+1).forEach(j->{
                if(j==0 || j==i){
                    row.add(i);
                }else{
                    List<Integer> prevRow = valueTriangle.get(i-1);
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
            });

        valueTriangle.add(row);
        });
        return valueTriangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }
}
