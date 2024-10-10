package com.challenge.easy.string;

import java.io.StringWriter;

/**
    # Reverse Words in a String III

     Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

     Example 1:
         Input: s = "Let's take LeetCode contest"
         Output: "s'teL ekat edoCteeL tsetnoc"

     Example 2:
         Input: s = "Mr Ding"
         Output: "rM gniD"

     Constraints:

         * 1 <= s.length <= 5 * 104
         * s contains printable ASCII characters.
         * s does not contain any leading or trailing spaces.
         * There is at least one word in s.
         * All the words in s are separated by a single space.

 */
public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {
        // We declare the variable that holds the strings reversed
        StringWriter result = new StringWriter();
        String[] words = s.split(" ");
        for(String word : words) {
            // we define a char array for each word
            char[] arr = word.toCharArray();
            // Reverse each array of characters
            reverseWord(arr);
            // We create a String with the arr and append to the result
            result.append(new String(arr));
            // We append an space after each word appended to the result
            result.append(" ");
        }
        // We return a final String but before we remove leading and trailing spaces.
        return result.toString().trim();
    }

    private static void reverseWord(char[] word) {
        int left = 0, right = word.length - 1;
        while (left < right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

    }
}
