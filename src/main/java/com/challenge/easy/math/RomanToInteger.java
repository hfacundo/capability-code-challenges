package com.challenge.easy.math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /**
     * Converts a Roman numeral to an integer.
     *
     * @param s The Roman numeral as a string.
     * @return The integer value of the Roman numeral.
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                // Subtract if the current value is less than the previous value
                result -= currentValue;
            } else {
                // Add otherwise
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));      // Output: 3
        System.out.println(romanToInt("LVIII"));    // Output: 58
        System.out.println(romanToInt("MCMXCIV"));  // Output: 1994
    }
}
