package com.challenge.easy.string;

import java.io.StringWriter;

/**
    # Defanging an IP Address

     Given a valid (IPv4) IP address, return a defanged version of that IP address.

     A defanged IP address replaces every period "." with "[.]".

     Example 1:
         Input: address = "1.1.1.1"
         Output: "1[.]1[.]1[.]1"

     Example 2:
         Input: address = "255.100.50.0"
         Output: "255[.]100[.]50[.]0"

     Constraints:

        * The given address is a valid IPv4 address.

 */
public class DefangingIpAddress {

    public static String defangIPaddr(String address) {
        // we declare the variable that will hold the defanged ip address
        StringWriter defrangedIP = new StringWriter();
        if( address == null || address.length() == 0 ) {
            return "";
        }
        // traverse each character of the IP
        for(char c : address.toCharArray()) {
            // We check if the char is '.'
            if(c == '.') {
                // we append "[.]" instead of period
                defrangedIP.append("[.]");
            }else{
                // Otherwise we append the character
                defrangedIP.append(c);
            }
        }
        return defrangedIP.toString();
    }

    public static void main(String[] args) {

    }
}
