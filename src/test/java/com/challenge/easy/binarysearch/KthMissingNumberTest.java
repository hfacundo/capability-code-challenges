package com.challenge.easy.binarysearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KthMissingNumberTest {

    @Test
    public void findKthPositiveTest() {
        int test1 = KthMissingNumber.findKthPositive(new int[] {2,3,4,7,11}, 5);
        int test2 = KthMissingNumber.findKthPositive(new int[] {1,2,3,4}, 2);
        Assert.assertEquals(test1, 9);
        Assert.assertEquals(test2, 6);
    }
}
