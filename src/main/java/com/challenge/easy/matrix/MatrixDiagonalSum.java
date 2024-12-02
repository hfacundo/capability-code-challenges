package com.challenge.easy.matrix;

public class MatrixDiagonalSum {

    /**
     * Computes the sum of the diagonals of a square matrix.
     *
     * @param mat The input square matrix.
     * @return The sum of the diagonals.
     */
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add the primary diagonal element
            sum += mat[i][i];
            // Add the secondary diagonal element (avoid double-counting the center for odd n)
            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); // Output: 25
        System.out.println(diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}})); // Output: 8
        System.out.println(diagonalSum(new int[][]{{5}})); // Output: 5
    }
}
