package com.challenge.easy.string;

public class DefangingIpAddress {

    /**
     * Defangs an IPv4 address by replacing each '.' with '[.]'.
     *
     * @param address The input IPv4 address.
     * @return The defanged version of the address.
     */
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1")); // Output: "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr("255.100.50.0")); // Output: "255[.]100[.]50[.]0"
    }
}

