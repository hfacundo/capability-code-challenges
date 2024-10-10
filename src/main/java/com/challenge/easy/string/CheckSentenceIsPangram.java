package com.challenge.easy.string;

import java.util.HashSet;
import java.util.Set;

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
        // we define the variable that holds all the lowercase letter og English Alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // we declare a Set to hold all the characters of the sentence string
        Set<Character> seenChars = new HashSet<Character>();

        // We travers all the characters of the sentence string and we store them into the Set
        for(char c: sentence.toCharArray()) {
            // check if the character is between 'a' and 'z',
            if(c>='a' && c<='z') {
                // we store the chars
                seenChars.add(c);
            }
        }

        // if the set contains 26 characters by the end of the traversal, the sentence is a pangram
        return seenChars.size()==26;
    }

    public static void main(String[] args) {

    }
}
