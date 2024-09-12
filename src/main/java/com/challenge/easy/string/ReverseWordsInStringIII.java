package com.challenge.easy.string;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.logging.Logger;

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

    public static String reverseWords(String s) {
        StringBuilder fullReverseWord = new StringBuilder("");
        StringBuilder substring = new StringBuilder("");
        int begin=0, ending=0;
        boolean flag=false;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i)==' '){
                fullReverseWord.append(" ");
            }
            if(s.charAt(i)!=' ' && flag==false){
                begin = i;
                flag = true;
            }
            if((i==(s.length()-1) || s.charAt(i+1)==' ') && flag==true){
                ending = i;
                flag=false;
                substring.setLength(0);
                fullReverseWord.append(substring.append(s.substring(begin, ending+1)).reverse());
            }
        }
        return fullReverseWord.toString();
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());

        String s = "Let's take LeetCode contest";

        logger.info("Reversed word: "+reverseWords(s));
    }
}