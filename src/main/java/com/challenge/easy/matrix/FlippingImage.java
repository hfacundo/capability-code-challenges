package com.challenge.easy.matrix;

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

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            double middle = (double)image[i].length / 2;
            for(int j=0; j <= middle -1; j++){
                int temp = image[i][j];
                image[i][j]= (image[i][image.length -1 -j] == 0)? 1: 0;
                image[i][image.length -1 -j] = (temp == 0)? 1: 0;
            }
            if (image[i].length % 2 != 0){
                image[i][(int) middle]= (image[i][(int) middle] == 0)? 1: 0;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        FlippingImage.flipAndInvertImage(new int[][]{new int[]{1,1,0}, new int[]{1,0,1}, new int[]{0,0,0}});
    }
}
