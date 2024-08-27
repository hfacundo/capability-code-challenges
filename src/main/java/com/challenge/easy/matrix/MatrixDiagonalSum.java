package com.challenge.easy.matrix;

/**
 * #
 * <p>
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * <p>
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Primary diagonal 1, 5, 9
 * Secondary diagonal 3, 5, 7
 * https://assets.leetcode.com/uploads/2020/08/14/sample_1911.png
 * <p>
 * Input: mat = [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 * <p>
 * Example 2:
 * Input: mat = [[1,1,1,1],
 * [1,1,1,1],
 * [1,1,1,1],
 * [1,1,1,1]]
 * Output: 8
 * <p>
 * Example 3:
 * Input: mat = [[5]]
 * Output: 5
 * <p>
 * Constraints:
 * <p>
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 */
public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        // Store the length of the arrays into matrix (is the same length of the items within)
        int length = mat.length;
        // Create variable to loop secondary diagonal
        int indexDecreased = length - 1;
        // For loop to loop secondary and primary diagonal
        for (int indexIncreased = 0; indexIncreased < length; indexIncreased++) {
            // Check if the primary and secondary diagonal are matching
            if (indexIncreased == indexDecreased) {
                // Only sum the number at this position once
                res += mat[indexIncreased][indexIncreased];
            } else {
                // Sum the number of the primary and secondary diagonal
                res += (mat[indexIncreased][indexIncreased] + mat[indexIncreased][indexDecreased]);
            }
            indexDecreased--;
        }
        return res;
    }

    public static void main(String[] args) {
//        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));
    }
}
