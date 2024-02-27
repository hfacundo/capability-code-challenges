package com.challenge.easy.hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqueCharTest {

    @Test
    public void firstUniqCharTest() {
        Assert.assertEquals(FirstUniqueChar.firstUniqChar("leetcode"), 0);
        Assert.assertEquals(FirstUniqueChar.firstUniqChar("loveleetcode"), 2);
        Assert.assertEquals(FirstUniqueChar.firstUniqChar("aabb"), -1);
    }
}
