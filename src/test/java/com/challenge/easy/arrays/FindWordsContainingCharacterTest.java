package com.challenge.easy.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class FindWordsContainingCharacterTest {

    @Test
    public void numIdenticalPairsTest() {
        List<Integer> test1 = FindWordsContainingCharacter.findWordsContaining(new String[] {"leet","code"}, 'e');
        List<Integer> test2 = FindWordsContainingCharacter.findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"}, 'a');
        List<Integer> test3 = FindWordsContainingCharacter.findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"}, 'z');
        Assert.assertFalse(test1.isEmpty());
        Assert.assertEquals(test1.get(0), 0);
        Assert.assertEquals(test1.get(1), 1);
        Assert.assertFalse(test2.isEmpty());
        Assert.assertEquals(test2.get(0), 0);
        Assert.assertEquals(test2.get(1), 2);
        Assert.assertTrue(test3.isEmpty());
    }
}
