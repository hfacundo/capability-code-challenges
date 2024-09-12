package com.challenge.easy.string;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Logger;
import java.util.stream.Collectors;

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
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashSet<Character> sentenceSet = sentence.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(HashSet::new));

        for(int i=0; i<alphabet.length();i++){
            if(!sentenceSet.contains(alphabet.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        logger.info("Is the sentence a pangram? "+checkIfPangram(sentence));
    }
}
