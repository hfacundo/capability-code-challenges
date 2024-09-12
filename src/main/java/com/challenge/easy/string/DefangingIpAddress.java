package com.challenge.easy.string;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.logging.Logger;

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
        StringBuilder sb = new StringBuilder(address);
        int increment = 1;
        for(int i=0; i<sb.length();i++){
            if(sb.charAt(i)=='.' && sb.charAt(i-1)!='[' && sb.charAt(i+1)!=']'){
                sb.replace(i,i+increment,"[.]");
                //increment+=1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());

        String address = "255.100.50.0";

        logger.info("Defanged version: "+defangIPaddr(address));
    }
}