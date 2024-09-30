package com.challenge.easy.string;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer,String> words = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")) {
            Character c = word.charAt(word.length()-1);
            words.put(Character.getNumericValue(c), word.substring(0, word.length()-1));
        }
        for(int i=1; i<=words.size(); i++) {
            if (i == words.size()) {
                result.append(words.get(i));
            } else {
                result.append(words.get(i) + " ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
