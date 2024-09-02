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
        List<List<Integer>> rowResult = new ArrayList<>();
        List<Integer> one = Arrays.asList(new Integer[]{1});
        List<Integer> two = Arrays.asList(new Integer[]{1,1});
        if(numRows==1){
            rowResult.add(one);
            return  rowResult;
        }else if(numRows ==2){
            rowResult.add(one);
            rowResult.add(two);
            return rowResult;
        }
        rowResult.add(one);
        rowResult.add(two);
        
        for(int i=2;i<numRows;i++){
            List<Integer> prevRow = rowResult.get(i-1);
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j=0;j<prevRow.size()-1;j++){
                nextRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            nextRow.add(1);
            rowResult.add(nextRow);
        }
        
        return rowResult;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(5));
        System.out.println(generate(6));
        System.out.println(generate(7));
        System.out.println(generate(8));
    }
}
