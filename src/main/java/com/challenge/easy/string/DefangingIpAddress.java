package com.challenge.easy.string;
import java.util.regex.Pattern;
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
        if (isValidIPv4(address)) {
            return  address.replace(".", "[.]");
        }
        return null;
    }
    public static boolean isValidIPv4(String ipAddress) {
        String ipv4Pattern = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."
                            + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."
                            + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."
                            + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        Pattern pattern = Pattern.compile(ipv4Pattern);

        return pattern.matcher(ipAddress).matches();
    }
    public static void main(String[] args) {

    }
}
