package com.challenge.easy.string;

import java.util.StringJoiner;

/**
 * # Sorting the Sentence
 * <p>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
 * <p>
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
 * <p>
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 * <p>
 * Example 1:
 * Input: s = "is2 sentence4 This1 a3"
 * Output: "This is a sentence"
 * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 * <p>
 * Example 2:
 * Input: s = "Myself2 Me1 I4 and3"
 * Output: "Me Myself and I"
 * Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 * <p>
 * Constraints:
 * <p>
 * 2 <= s.length <= 200
 * s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
 * The number of words in s is between 1 and 9.
 * The words in s are separated by a single space.
 * s contains no leading or trailing spaces.
 */
public class SortingSentence {

    public static String sortSentence(String s) {
        String[] sentenceArray = s.split(" ");
        String[] sentenceOrderedArray = new String[sentenceArray.length];
        StringJoiner res = new StringJoiner(" ");
        for (String sentence : sentenceArray) {
            String indexStr = sentence.substring(sentence.length() - 1);
            String sentenceWithoutNumber = sentence.replace(indexStr, "");
            sentenceOrderedArray[Integer.parseInt(indexStr) - 1] = sentenceWithoutNumber;
        }
        for(String sentenceInOrder : sentenceOrderedArray) {
            res.add(sentenceInOrder);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
}
