package com.challenge.easy.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<String> alphabet = Stream.of(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}).collect(Collectors.toList());
        List<String> lista = Stream.of(sentence.split("")).collect(Collectors.toList());
        Map<String,Long> map = lista.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(String s: alphabet){
            if(!map.containsKey(s)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
       System.out.println(checkIfPangram("leetcode"));
    }
}
