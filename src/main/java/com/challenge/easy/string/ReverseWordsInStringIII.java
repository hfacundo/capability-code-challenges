package com.challenge.easy.string;

import java.util.Arrays;

/**
    # Reverse Words in a String III

     Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

     Example 1:
         Input: s = "Let's take LeetCode contest"
         Output: "s'teL ekat edoCteeL tsetnoc"

     Example 2:
         Input: s = "Mr Ding"
         Output: "rM gniD"

     Constraints:

         * 1 <= s.length <= 5 * 104
         * s contains printable ASCII characters.
         * s does not contain any leading or trailing spaces.
         * There is at least one word in s.
         * All the words in s are separated by a single space.

 */
public class ReverseWordsInStringIII {

    public static String reverseSingleWord(String s){
        int arrLen = s.length();
        char aux = ' ';
        char[] word = s.toCharArray();

        for (int i = 0; i < arrLen/2; i++) {
            aux = word[arrLen-i-1];
            word[arrLen-i-1] = word[i];
            word[i] = aux;
        }
        return new String(word);
    }

    // Split the sentence in an array and reverse every word then recreate the array again
    public static String reverseWords(String s) {

        String[] stringArr = s.split(" ");


        for (int i=0;i<stringArr.length;i++){
            stringArr[i] = reverseSingleWord(stringArr[i]);
        }

        return String.join(" ",stringArr);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
