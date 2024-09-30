package com.challenge.easy.matrix;

/**
    #

     Given a square matrix mat, return the sum of the matrix diagonals.

     Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.



     Example 1:
        1 2 3
        4 5 6
        7 8 9
     Primary diagonal 1, 5, 9
     Secondary diagonal 3, 5, 7
     https://assets.leetcode.com/uploads/2020/08/14/sample_1911.png

     Input: mat = [[1,2,3],
     [4,5,6],
     [7,8,9]]
     Output: 25
     Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
     Notice that element mat[1][1] = 5 is counted only once.

     Example 2:
         Input: mat = [[1,1,1,1],
         [1,1,1,1],
         [1,1,1,1],
         [1,1,1,1]]
         Output: 8

     Example 3:
         Input: mat = [[5]]
         Output: 5

     Constraints:

         * n == mat.length == mat[i].length
         * 1 <= n <= 100
         * 1 <= mat[i][j] <= 100
 */
public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i=0; i<mat.length; i++) {
            sum = sum + mat[i][i];
        }
        for(int i=0; i<mat.length; i++){
            int j = mat.length-i-1;
            if (i!=j) {
                sum = sum + mat[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
