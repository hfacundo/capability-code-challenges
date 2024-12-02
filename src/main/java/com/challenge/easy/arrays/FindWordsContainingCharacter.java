package com.challenge.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    /**
     * This method finds indices of words containing the specified character.
     *
     * @param words Array of strings to search.
     * @param x The character to search for.
     * @return A list of indices of words that contain the character.
     */
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        // Iterate over each word and check if it contains the character x
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) { // Check if the character exists in the word
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the function with sample inputs
        String[] words1 = {"leet", "code"};
        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};

        System.out.println(findWordsContaining(words1, 'e')); // Output: [0, 1]
        System.out.println(findWordsContaining(words2, 'a')); // Output: [0, 2]
        System.out.println(findWordsContaining(words3, 'z')); // Output: []
    }
}
