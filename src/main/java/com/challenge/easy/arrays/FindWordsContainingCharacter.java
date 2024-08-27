package com.challenge.easy.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * # Find Words Containing Character.
 * <p>
 * You are given a 0-indexed array of strings words and a character x.
 * <p>
 * Return an array of indices representing the words that contain the character x.
 * <p>
 * Note that the returned array may be in any order.
 * <p>
 * Example 1:
 * Input: words = ["leet","code"], x = "e"
 * Output: [0,1]
 * Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
 * <p>
 * Example 2:
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
 * Output: [0,2]
 * Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
 * <p>
 * Example 3:
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
 * Output: []
 * Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 50
 * 1 <= words[i].length <= 50
 * x is a lowercase English letter.
 * words[i] consists only of lowercase English letters.
 */
public class FindWordsContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        for (int index = 0; index < words.length; index++) {
            if (words[index].contains(String.valueOf(x))) indexes.add(index);
        }
        return indexes;
    }

    public static void main(String[] args) {
        String[] words = new String[] {"leet","code"};
        findWordsContaining(words, 'e').forEach(System.out::println);
    }
}
