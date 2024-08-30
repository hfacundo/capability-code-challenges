package com.challenge.easy.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
        //97 - 122
        char [] charSentence = sentence.toCharArray();
        Arrays.sort(charSentence);
        Set<Character> setList = new HashSet<>();
        for(char element: charSentence){
            setList.add(element);
        }

        if(setList.size() == 26){ //Number of letters
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        CheckSentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }
}
