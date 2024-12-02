package com.challenge.easy.string;

public class ReverseWordsInStringIII {

    /**
     * Reverses the order of characters in each word within a sentence.
     *
     * @param s The input sentence.
     * @return The sentence with each word reversed.
     */
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest")); // Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords("Mr Ding")); // Output: "rM gniD"
    }
}
