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

    public static int[][] flipAndInvertImage(int[][] image) {
    	System.out.println("Before: " + Arrays.deepToString(image));
    	for(int i = 0; i< image.length; i++) {        		
    		for(int j = 0; j< image[0].length; j++) {
    			int first = image[i][j];
            	int second = image[i][image[0].length - 1 - j];            	            	
            	            	
            	if(j < (image[0].length - 1 - j)) {
            		first = first ^ second;
                	second = first ^ second;
                	first = first ^ second;
                	
                	image[i][j] = first;
                	image[i][image[0].length - 1 - j] = second;                	                	
            	}             	            	
            	
            	image[i][j] = 1 - image[i][j];            	
    		}
    	}

        return image;
    }

    public static void main(String[] args) {
    	System.out.println("After: " + Arrays.deepToString(flipAndInvertImage(new int[][]{new int[]{1,1,0,0}, new int[]{1,0,0,1}, new int[]{0,1,1,1}, new int[]{1,0,1,0}})));
    }
}
