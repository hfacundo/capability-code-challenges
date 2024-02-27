package com.challenge.easy.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DefangingIpAddressTest {

    @Test
    public void defangIPaddrTest() {
        Assert.assertEquals(DefangingIpAddress.defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
        Assert.assertEquals(DefangingIpAddress.defangIPaddr("255.100.50.0"), "255[.]100[.]50[.]0");
    }
}
