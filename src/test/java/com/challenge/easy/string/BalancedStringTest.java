package com.challenge.easy.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BalancedStringTest {

    @Test
    public void balancedStringSplitTest() {
        Assert.assertEquals(BalancedString.balancedStringSplit("RLRRLLRLRL"), 4);
        Assert.assertEquals(BalancedString.balancedStringSplit("RLRRRLLRLL"), 2);
        Assert.assertEquals(BalancedString.balancedStringSplit("LLLLRRRR"), 1);
    }

}
