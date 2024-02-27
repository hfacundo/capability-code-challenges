package com.challenge.easy.recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciNumberTest {

    @Test
    public void fib() {
        Assert.assertEquals(FibonacciNumber.fib(2), 1);
        Assert.assertEquals(FibonacciNumber.fib(3), 2);
        Assert.assertEquals(FibonacciNumber.fib(4), 3);
    }
}
