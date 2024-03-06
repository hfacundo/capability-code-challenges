package com.challenge.easy.arrays;

/**
     Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

     A string is palindromic if it reads the same forward and backward.

     Example 1:
         Input: words = ["abc","car","ada","racecar","cool"]
         Output: "ada"
         Explanation: The first string that is palindromic is "ada".
         Note that "racecar" is also palindromic, but it is not the first.

     Example 2:
         Input: words = ["notapalindrome","racecar"]
         Output: "racecar"
         Explanation: The first and only string that is palindromic is "racecar".

     Example 3:
         Input: words = ["def","ghi"]
         Output: ""
         Explanation: There are no palindromic strings, so the empty string is returned.

     Constraints:

         * 1 <= words.length <= 100
         * 1 <= words[i].length <= 100
         * words[i] consists only of lowercase English letters.
 */
public class FindFirstPalindrome {

    public static String firstPalindrome(String[] words) {
        for(String word: words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String word){
        int valor = 0;
        int value = word.length() - 1;
        while(valor < value) {
            if(word.charAt(valor) != word.charAt(value)){
                return false;
            }
            valor++;
            value--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","rececar","cool"};
        System.out.println(firstPalindrome(words));

        String[] words2 = {"notepalindrome","racecar"};
        System.out.println(firstPalindrome(words2));

        String[] words3 = {"def","ghi"};
        System.out.println(firstPalindrome(words3));
    }
}
