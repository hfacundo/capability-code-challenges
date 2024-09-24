package com.challenge.easy.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSentenceIsPangramTest {

    @Test
    public void checkIfPangramTest() {
        Assert.assertTrue(CheckSentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        Assert.assertFalse(CheckSentenceIsPangram.checkIfPangram("leetcode"));
    }
}
