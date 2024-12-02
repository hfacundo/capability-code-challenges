package com.challenge.easy.string;

import java.util.HashSet;
import java.util.Set;

public class CheckSentenceIsPangram {

    /**
     * Checks if the given sentence is a pangram.
     *
     * @param sentence The input string.
     * @return True if the sentence is a pangram, false otherwise.
     */
    public static boolean checkIfPangram(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            uniqueChars.add(c);
            if (uniqueChars.size() == 26) {
                return true;
            }
        }

        return uniqueChars.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); // Output: true
        System.out.println(checkIfPangram("leetcode")); // Output: false
    }
}
