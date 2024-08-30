package com.challenge.easy.math;

/**
    # Roman to Integer

     Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

         Symbol       Value
         I             1
         V             5
         X             10
         L             50
         C             100
         D             500
         M             1000
     For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
     The number 27 is written as XXVII, which is XX + V + II.

     Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

         I can be placed before V (5) and X (10) to make 4 and 9.
         X can be placed before L (50) and C (100) to make 40 and 90.
         C can be placed before D (500) and M (1000) to make 400 and 900.
         Given a roman numeral, convert it to an integer.

     Example 1:
         Input: s = "III"
         Output: 3
         Explanation: III = 3.

     Example 2:
         Input: s = "LVIII"
         Output: 58
         Explanation: L = 50, V= 5, III = 3.

     Example 3:
         Input: s = "MCMXCIV"
         Output: 1994
         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

     Constraints:

         * 1 <= s.length <= 15
         * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
         * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanToInteger {

    public static int romanToInt(String s) {

        int acum = 0;
        int digit = 0;
        for(int i = 0; i< s.length(); i++){
            digit = switch (s.charAt(i)) {
                case 'M' -> {
                    acum = (digit == 4) ? acum + 800 : acum + 1000;
                    yield 6;
                }
                case 'D' -> {
                    acum = (digit == 4) ? acum + 300 : acum + 500;
                    yield 5;
                }
                case 'C' -> {
                    acum = (digit == 2) ? acum + 80 : acum + 100;
                    yield 4;
                }
                case 'L' -> {
                    acum = (digit == 2) ? acum + 30 : acum + 50;
                    yield 3;
                }
                case 'X' -> {
                    acum = (digit == 0) ? acum + 8 : acum + 10;
                    yield 2;
                }
                case 'V' -> {
                    acum = (digit == 0) ? acum + 3 : acum + 5;
                    yield 1;
                }
                case 'I' -> {
                    acum += 1;
                    yield 0;
                }
                default -> digit;
            };
        }

        return acum;
    }

    public static void main(String[] args) {
        RomanToInteger.romanToInt("LVIII");
    }
}
