package com.challenge.easy.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingSentenceTest {

    @Test
    public void sortSentenceTest() {
        Assert.assertEquals(SortingSentence.sortSentence("is2 sentence4 This1 a3"), "This is a sentence");
        Assert.assertEquals(SortingSentence.sortSentence("Myself2 Me1 I4 and3"), "Me Myself and I");
    }
}
