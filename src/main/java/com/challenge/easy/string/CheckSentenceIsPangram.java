package com.challenge.easy.string;

/**
 * # Check if the Sentence Is Pangram
 * <p>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * <p>
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * <p>
 * Example 1:
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * <p>
 * Example 2:
 * Input: sentence = "leetcode"
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */
public class CheckSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
        char[] lettersToChar = sentence.toCharArray();
        // Create an array to store empty within null in every index, to store the existing letters
        Character[] letters = new Character[26];
        for (char letterToChar : lettersToChar) {
            // Set code to store the index of the letter with the next logic:
            // the char ascii value - 97 (because 97 is the value of the letter A in ascii table)
            // this allows to start from 0 to 26 index
            int code = letterToChar - 97;
            if (letters[code] == null) {
                letters[code] = letterToChar;
            }
        }
        for(Character letter : letters) {
            // If any of the values on to the array are null, is not a pangram
            if (letter == null) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }
}
