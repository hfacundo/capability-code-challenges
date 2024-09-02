package com.challenge.easy.matrix;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FlippingImageTest {

    @Test
    public void flipAndInvertImageTest() {
        int[][] test1 = FlippingImage.flipAndInvertImage(new int[][]{new int[]{1,1,0}, new int[]{1,0,1}, new int[]{0,0,0}});
        int[][] expected1 = new int[][]{new int[]{1, 0, 0}, new int[]{0, 1, 0}, new int[]{1, 1, 1}};
        Assert.assertTrue(areMatricesEqual(test1, expected1));

        int[][] test2 = FlippingImage.flipAndInvertImage(new int[][]{new int[]{1,1,0,0}, new int[]{1,0,0,1}, new int[]{0,1,1,1}, new int[]{1,0,1,0}});
        int[][] expected2 = new int[][]{new int[]{1,1,0,0}, new int[]{0,1,1,0}, new int[]{0,0,0,1}, new int[]{1,0,1,0}};
        Assert.assertTrue(areMatricesEqual(test2, expected2));
    }

    private boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            if (!Arrays.equals(matrix1[i], matrix2[i])) {
                return false;
            }
        }

        return true;
    }
}
