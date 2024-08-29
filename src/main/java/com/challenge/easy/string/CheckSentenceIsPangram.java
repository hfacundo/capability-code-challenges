package com.challenge.easy.string;

import java.util.HashSet;

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
    	
    	HashSet<Character> alphabet = new HashSet<>();
    	
    	for(int i = 0; i < sentence.length(); i++) {
    		alphabet.add(sentence.charAt(i));    		
    	}    	
    	
        return alphabet.size() == 26;
    }

    public static void main(String[] args) {
    	System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
