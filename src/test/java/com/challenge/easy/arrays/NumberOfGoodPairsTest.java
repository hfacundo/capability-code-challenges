package com.challenge.easy.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.challenge.easy.arrays.NumberOfGoodPairs.numIdenticalPairs;

@Test
public class NumberOfGoodPairsTest {

    @Test
    public void numIdenticalPairsTest() {
        Assert.assertEquals(numIdenticalPairs(new int[]{1,2,3,1,1,3}), 4);
        Assert.assertEquals(numIdenticalPairs(new int[]{1,1,1,1}), 6);
        Assert.assertEquals(numIdenticalPairs(new int[]{1,2,3}), 0);
    }
}
