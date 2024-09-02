package com.challenge.easy.twopointer;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ShortestDistanceToCharTest {

    @Test
    public void shortestToCharTest() {
        int[] test1 = ShortestDistanceToChar.shortestToChar("loveleetcode", 'e');
        int[] expected1 = new int[]{3,2,1,0,1,0,0,1,2,2,1,0};
        Assert.assertTrue(Arrays.equals(test1, expected1));

        int[] test2 = ShortestDistanceToChar.shortestToChar("aaab", 'b');
        int[] expected2 = new int[]{3,2,1,0};
        Assert.assertTrue(Arrays.equals(test2, expected2));
    }
}
