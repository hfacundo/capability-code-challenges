package com.challenge.easy.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStonesTest() {
        Assert.assertEquals(JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"), 3);
        Assert.assertEquals(JewelsAndStones.numJewelsInStones("z", "ZZ"), 0);
    }
}
