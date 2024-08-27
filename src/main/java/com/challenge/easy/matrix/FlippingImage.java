package com.challenge.easy.matrix;

/**
 * # Flipping An Image
 * <p>
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * <p>
 * To flip an image horizontally means that each row of the image is reversed.
 * <p>
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * <p>
 * For example, inverting [0,1,1] results in [1,0,0].
 * <p>
 * Example 1:
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * <p>
 * Example 2:
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * <p>
 * Constraints:
 * <p>
 * n == image.length
 * n == image[i].length
 * 1 <= n <= 20
 * images[i][j] is either 0 or 1.
 */
public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        int length = image.length;
        // Iterate throw the array's
        for (int index = 0; index < length; index++) {
            // Create new array to store the reverse and flipped values
            int[] flipped = new int[length];
            // Create index to store the new values within new array
            int flippedIndex = 0;
            // Iterate throw the items from the last index to zero
            for (int indexItem = length - 1; indexItem >= 0; indexItem--) {
                // Check if the value is zero change it to 1 otherwise zero.
                int value = image[index][indexItem] == 0 ? 1 : 0;
                // Store it within new array
                flipped[flippedIndex] = value;
                // Increase the index 1 by 1
                flippedIndex++;
            }
            // Replace old array with modified array
            image[index] = flipped;
        }
        return image;
    }

    public static void printMatrix(int[][] matrix) {
        int length = matrix.length;
        System.out.print("[");
        for (int index = 0; index < length; index++) {
            System.out.print("[");
            for (int indexItem = 0; indexItem < length; indexItem++) {
                System.out.print(matrix[index][indexItem]);
                if (indexItem < length - 1) System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        printMatrix(image);
        int[][] flipped = flipAndInvertImage(image);
        System.out.println("\n");
        printMatrix(flipped);
    }
}
