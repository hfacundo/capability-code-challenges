package com.challenge.easy.string;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
    # Sorting the Sentence

     A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

     A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

     For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
     Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

     Example 1:
         Input: s = "is2 sentence4 This1 a3"
         Output: "This is a sentence"
         Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

     Example 2:
         Input: s = "Myself2 Me1 I4 and3"
         Output: "Me Myself and I"
         Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.

     Constraints:

         * 2 <= s.length <= 200
         * s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
         * The number of words in s is between 1 and 9.
         * The words in s are separated by a single space.
         * s contains no leading or trailing spaces.

 */
public class SortingSentence {

    public static String sortSentence(String s) {
        // Divide the sentence in array of words
        String[] words = s.split(" ");
        // We sort the array by comparing the number at the end of each word in the array
        Arrays.sort(words, Comparator.comparingInt(word-> word.charAt(word.length()-1) -'0'));

        StringWriter result = new StringWriter();
        // We traverse each word of the ordered array
        for (String word : words) {
            // we append to the result the word excluding the las character number and append a space
            result.append(word, 0, word.length()-1).append(" ");
        }
        // We remove leading and trailing spaces from the string and return it
        return result.toString().trim();
    }

    public static void main(String[] args) {

    }
}
