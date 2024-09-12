package com.challenge.easy.dynamic;

import com.challenge.easy.arrays.FindWordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
        int i=0, j=0, k=0;

        while(i < numRows){
            pascalTriangle.add(new ArrayList<Integer>());

            j=0;
            k=0;
            while(j <= i){
                if(j==0 || j==i){
                    pascalTriangle.get(i).add(1);
                }else{
                    pascalTriangle.get(i).add(pascalTriangle.get(i-1).get(k)+pascalTriangle.get(i-1).get(k+1));
                    k++;
                }
                j++;
            }

            i++;
        }

        return pascalTriangle;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindWordsContainingCharacter.class.getName());

        List<List<Integer>> pascalTriangle = generate(9);

        logger.info("Pascal Triangle: ");
        for(List<Integer> row : pascalTriangle ){
            System.out.println(row);
        }
    }
}
