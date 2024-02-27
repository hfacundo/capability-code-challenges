package com.challenge.easy.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeNumberTest {

    @Test
    public void isPalindromeTest() {
        Assert.assertTrue(PalindromeNumber.isPalindrome(121));
        Assert.assertFalse(PalindromeNumber.isPalindrome(-121));
        Assert.assertFalse(PalindromeNumber.isPalindrome(10));
    }
}
