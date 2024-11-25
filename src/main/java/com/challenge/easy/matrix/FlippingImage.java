package com.challenge.easy.matrix;

import java.util.Arrays;

/**
    # Flipping An Image

     Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

     To flip an image horizontally means that each row of the image is reversed.

     For example, flipping [1,1,0] horizontally results in [0,1,1].
     To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

     For example, inverting [0,1,1] results in [1,0,0].

     Example 1:
         Input: image = [[1,1,0],[1,0,1],[0,0,0]]
         Output: [[1,0,0],[0,1,0],[1,1,1]]
         Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
         Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

     Example 2:
         Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
         Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
         Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
         Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

     Constraints:

         * n == image.length
         * n == image[i].length
         * 1 <= n <= 20
         * images[i][j] is either 0 or 1.
 */
public class FlippingImage {

    // Returns the reverse of an integer array
    // Complexity: O(n) where n is half of the length of the array
    public static int[] reverseArray(int[] singleArr){

        int arrLen = singleArr.length;
        int aux = 0;

        for (int i = 0; i < arrLen/2; i++) {
            aux = singleArr[arrLen-i-1];
            singleArr[arrLen-i-1] = singleArr[i];
            singleArr[i] = aux;
        }
        return singleArr;
    }

    // Changes 1's and 0's of an array
    // Complexity: O(n) where n is the length of the array
    public static int[] invertArray(int[] singleArr){

        for (int i = 0; i < singleArr.length; i++) {
            if (singleArr[i] == 0)
                singleArr[i] = 1;
            else
                singleArr[i] = 0;
        }
        return singleArr;
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            image[i] = reverseArray(image[i]);
            image[i] = invertArray(image[i]);
        }

        return image;
    }

    public static void main(String[] args) {

        flipAndInvertImage(new int[][]{new int[]{1,1,0}, new int[]{1,0,1}, new int[]{0,0,0}});

    }
}
