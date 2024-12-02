package com.challenge.easy.matrix;

public class FlippingImage {

    /**
     * Flips the image horizontally and inverts it.
     *
     * @param image The input binary matrix.
     * @return The resulting matrix after flipping and inverting.
     */
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        // Iterate through each row
        for (int[] row : image) {
            // Flip and invert simultaneously
            for (int i = 0; i < (n + 1) / 2; i++) {
                // Swap and invert the i-th and (n-i-1)-th elements
                int temp = row[i] ^ 1; // Invert the i-th element
                row[i] = row[n - i - 1] ^ 1; // Invert the (n-i-1)-th element
                row[n - i - 1] = temp; // Assign the inverted i-th element to (n-i-1)
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] image1 = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] image2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

        printMatrix(flipAndInvertImage(image1)); // Output: [[1,0,0],[0,1,0],[1,1,1]]
        printMatrix(flipAndInvertImage(image2)); // Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
