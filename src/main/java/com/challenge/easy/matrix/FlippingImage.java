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
        // traverse each row of the image
        for(int[] row : image) {
            // We use two pointer technique to flip and invert the row simultaneously
           int left = 0, right = image.length - 1;
           while(left <= right) {
               //Flip elements at the left and right pointers
               // Inverting: XOR with 1 flips 0 to 1 and 1 to 0
               int temp = row[left] ^ 1; // Invert left element
               row[left] = row[right] ^ 1; // Invert right element and move to left
               row[right] = temp;  // place inverted left element on the right
               // Move the pointers towards the center
               left++;
               right--;
           }
        }
        return image;
    }

    public static void main(String[] args) {

    }
}
