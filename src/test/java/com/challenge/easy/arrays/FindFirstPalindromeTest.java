package com.challenge.easy.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FindFirstPalindromeTest {

    @Test
    public void firstPalindromeTest() {
        String test1 = FindFirstPalindrome.firstPalindrome(new String[] {"abc","car","ada","racecar","cool"});
        String test2 = FindFirstPalindrome.firstPalindrome(new String[] {"notapalindrome","racecar"});
        String test3 = FindFirstPalindrome.firstPalindrome(new String[] {"def","ghi"});
        Assert.assertEquals(test1, "ada");
        Assert.assertEquals(test2, "racecar");
        Assert.assertEquals(test3, "");
    }
}
