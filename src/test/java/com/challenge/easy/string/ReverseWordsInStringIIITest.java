package com.challenge.easy.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsInStringIIITest {

    @Test
    public void reverseWordsTest() {
        Assert.assertEquals(ReverseWordsInStringIII.reverseWords("Let's take LeetCode contest"), "s'teL ekat edoCteeL tsetnoc");
        Assert.assertEquals(ReverseWordsInStringIII.reverseWords("Mr Ding"), "rM gniD");
    }

}
