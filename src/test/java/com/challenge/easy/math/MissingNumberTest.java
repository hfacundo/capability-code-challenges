package com.challenge.easy.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingNumberTest {

    @Test
    public void missingNumberTest() {
        Assert.assertEquals(MissingNumber.missingNumber(new int[]{3,0,1}), 2);
        Assert.assertEquals(MissingNumber.missingNumber(new int[]{0,1}), 2);
        Assert.assertEquals(MissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}), 8);
    }
}
