package com.challenge.easy.dynamic;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTest {

    @Test
    public void generateTest() {
        List<List<Integer>> test1 = PascalTriangle.generate(5);
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(List.of(1));
        expected1.add(List.of(1, 1));
        expected1.add(List.of(1, 2, 1));
        expected1.add(List.of(1, 3, 3, 1));
        expected1.add(List.of(1, 4, 6, 4, 1));
        Assert.assertEquals(test1, expected1);

        List<List<Integer>> test2 = PascalTriangle.generate(1);
        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(List.of(1));
        Assert.assertEquals(test2, expected2);
    }
}
