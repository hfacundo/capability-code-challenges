package com.challenge.easy.string;

public class BalancedString {

    /**
     * Splits a balanced string into the maximum number of balanced substrings.
     *
     * @param s The input balanced string.
     * @return The maximum number of balanced substrings.
     */
    public static int balancedStringSplit(String s) {
        int balance = 0; // Tracks the balance between 'L' and 'R'
        int count = 0;   // Tracks the number of balanced substrings

        // Iterate through the string
        for (char c : s.toCharArray()) {
            // Update balance based on the character
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }

            // When balance is zero, we have a balanced substring
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL")); // Output: 4
        System.out.println(balancedStringSplit("RLRRRLLRLL")); // Output: 2
        System.out.println(balancedStringSplit("LLLLRRRR"));   // Output: 1
    }
}
