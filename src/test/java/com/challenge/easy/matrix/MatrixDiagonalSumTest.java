package com.challenge.easy.matrix;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixDiagonalSumTest {

    @Test
    public void diagonalSumTest() {
        int test1 = MatrixDiagonalSum.diagonalSum(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}});
        Assert.assertEquals(test1, 25);

        int test2 = MatrixDiagonalSum.diagonalSum(new int[][]{new int[]{1,1,1,1}, new int[]{1,1,1,1}, new int[]{1,1,1,1}, new int[]{1,1,1,1}});
        Assert.assertEquals(test2, 8);

        int test3 = MatrixDiagonalSum.diagonalSum(new int[][]{new int[]{5}});
        Assert.assertEquals(test3, 5);
    }

}
