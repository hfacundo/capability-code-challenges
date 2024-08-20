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

import java.util.*;

public class CheckSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
    	boolean result = false;
    	Set <String> alphabet = new HashSet<String>();
    	
    	for(int i=0; i<sentence.length(); i++) {
    		
    		alphabet.add(String.valueOf(sentence.charAt(i)));
    		
    		if(alphabet.size() == 26) {
    			result = true;
    			break;
    		}
    	}
    	
        return result;
    }

    public static void main(String[] args) {
    	
    }
}
