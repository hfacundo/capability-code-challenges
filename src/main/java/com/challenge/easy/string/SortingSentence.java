package com.challenge.easy.string;

import java.util.Arrays;

public class SortingSentence {

    /**
     * Reconstructs the original sentence from a shuffled sentence.
     *
     * @param s The shuffled sentence.
     * @return The original sentence.
     */
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        // Place each word in its correct position
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '1'; // Extract the position and adjust for 0-based index
            sortedWords[position] = word.substring(0, word.length() - 1); // Remove the number
        }

        // Join the sorted words into a sentence
        return String.join(" ", sortedWords);
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3")); // Output: "This is a sentence"
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));    // Output: "Me Myself and I"
    }
}

