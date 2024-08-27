package com.challenge.easy.string;

/**
 * # Reverse Words in a String III
 * <p>
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * <p>
 * Example 2:
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 104
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 */
public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {
        String[] wordsAsArray = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : wordsAsArray) {
            StringBuffer wordBuffer = new StringBuffer(word);
            result.append(wordBuffer.reverse());
            result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
