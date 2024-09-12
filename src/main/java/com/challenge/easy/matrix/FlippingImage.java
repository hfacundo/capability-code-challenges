package com.challenge.easy.matrix;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.logging.Logger;

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
        int i = 0, j = 0, x;
        int[][] flippingImage = new int[image.length][image[0].length];
        for(i=0; i<image.length; i++){
            x=image[i].length-1;
            for(j=0; j<image[i].length; j++){
                if(image[i][j]==1){
                    flippingImage[i][x] = 0;
                }else{
                    flippingImage[i][x] = 1;
                }
                x--;
            }
        }
        return flippingImage;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());


        //Image for example 1:
        int[][] image = { { 1,1,0 },
                            { 1,0,1 },
                            { 0,0,0 } };
        //Image for example 2:
        /*int[][] image = { { 1,1,0,0 },
                          { 1,0,0,1 },
                          { 0,1,1,1 },
                          { 1,0,1,0 } };*/

        int[][] flippingImage = flipAndInvertImage(image);

        logger.info("Flipping Image: ");
        printFlippingImage(flippingImage);
    }

    public static void printFlippingImage(int[][] flippingImage){
        for(int i=0; i<flippingImage.length; i++){
            System.out.print("[");
            for(int j=0; j<flippingImage[i].length; j++){
                System.out.print(flippingImage[i][j]);
            }
            System.out.println("]");
        }

    }
}
