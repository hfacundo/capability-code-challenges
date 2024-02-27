package com.challenge.easy.hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueNumberOfOccurrencesTest {

    @Test
    public void uniqueOccurrencesTest() {
        Assert.assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        Assert.assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1,2}));
        Assert.assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
