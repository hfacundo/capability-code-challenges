package com.challenge.easy.hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqueCharTest {

    @Test
    public void firstUniqCharTest() {
        Assert.assertEquals(FirstUniqueChar.firstUniqueChar("leetcode"), 0);
        Assert.assertEquals(FirstUniqueChar.firstUniqueChar("loveleetcode"), 2);
        Assert.assertEquals(FirstUniqueChar.firstUniqueChar("aabb"), -1);
    }
}
