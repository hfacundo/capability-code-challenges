package com.challenge.easy.string;

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

        String[] stringArr = s.split(" ");

        // Create a result variable with the same length as the sentence
        String[] orderedStr = new String[stringArr.length];

        char[] word;

        int index;

        // For each word, the index is extracted, transformed to a numeric value and used to insert the rest of the word in the new array
        for (String str:stringArr){
            word = str.toCharArray();

            index = Character.getNumericValue(word[word.length - 1]) - 1;

            orderedStr[index] = str.substring(0,str.length()-1);
        }

        return String.join(" " ,orderedStr);
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
}
