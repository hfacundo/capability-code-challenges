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
        int count = 0 ;
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
                if (count == 1) {
                    return word;
                }
            }
        }
        return "";
    }

    public static Boolean isPalindrome( String str) {
        int left = 0;
        int right =str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left ++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;              
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
