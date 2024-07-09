package com.challenge.easy.string;

import java.util.ArrayList;

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
        ArrayList<Character> aux =new ArrayList<>();
        int alphabetLength = 26;
        for (char letter:sentence.toCharArray())
            if(!aux.contains(letter))
                aux.add(letter);

        return aux.size()==alphabetLength;
    }

    public static void main(String[] args) {

    }
}
