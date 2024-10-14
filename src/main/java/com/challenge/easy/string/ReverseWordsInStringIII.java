package com.challenge.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        return Arrays.stream(s.split(" "))
                .map(ReverseWordsInStringIII::reverseString)
                .collect(Collectors.joining(" "));
        /*String[] words = s.split(" ");
        List<String> reversedWords = new ArrayList<>(words.length);
        for (String word : words) {
            reversedWords.add(reverseString(word));
        }
        return String.join(" ", reversedWords);*/
        //return reversedWords.stream().collect(Collectors.joining(" "));
    }

    private static String reverseString(String s) {
        char[] reversedArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reversedArray[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(reversedArray);
    }

    public static void main(String[] args) {

    }
}
