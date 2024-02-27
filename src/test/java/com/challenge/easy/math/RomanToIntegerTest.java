package com.challenge.easy.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToIntTest() {
        Assert.assertEquals(RomanToInteger.romanToInt("III"), 3);
        Assert.assertEquals(RomanToInteger.romanToInt("LVIII"), 58);
        Assert.assertEquals(RomanToInteger.romanToInt("MCMXCIV"), 1994);
    }
}
