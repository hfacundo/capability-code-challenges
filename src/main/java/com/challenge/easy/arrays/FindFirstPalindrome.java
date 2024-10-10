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
        // validate edge cases
        if( words == null || words.length == 0 ){
            return "";
        }
        // Iterate through each word in the array
        for(int i = 0; i < words.length; i++){
            if(words[i] == null || words[i].isEmpty() || words[i].length() > 100){
                continue;
            }
            // check if the current word is a palindrome
            if(validatePalindrome(words[i])){
                return words[i];
            };
        }

        return ""; // return an empty string if no palindorme is found
    }

    /**
     * Method to validate if a word is palindromic
     * @param word the word to validate
     * @return true if the word is palindromic false otherwise
     */
    private static boolean validatePalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while(left <= right){
            if(word.charAt(left) != word.charAt(right)){
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
