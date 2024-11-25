package com.challenge.easy.string;

/**

    # Check if the Sentence Is Pangram

     A pangram is a sentence where every letter of the English alphabet appears at least once.

     Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

     Example 1:
         Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
         Output: true
         Explanation: sentence contains at least one of every letter of the English alphabet.

     Example 2:
         Input: sentence = "leetcode"
         Output: false

     Constraints:

         * 1 <= sentence.length <= 1000
         * sentence consists of lowercase English letters.
 */
public class CheckSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {

        if (sentence.length() < 26)
            return false;

        // We define a string with every valid character
        String thealphabet = "abcdefghijklmnopqrstuvwxyz";

        // For every letter we see if its contained in the sentence
        // Complexity: O(n) where n is the length of the sentence, the complexity of iterating over every letter in the alphabet is a constant 26
        for (char letter:thealphabet.toCharArray())
            if(!sentence.contains(""+letter))
                return false;

        return true;
    }

    public static void main(String[] args) {

    }
}
