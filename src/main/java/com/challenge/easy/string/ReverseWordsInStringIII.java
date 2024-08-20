package com.challenge.easy.string;

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

import java.util.*;
import java.lang.Object;
import java.lang.StringBuilder;

public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {
    	String reverse = "";    	
    	String[] splited = s.split("\\s+");
    	    	
    	for(int i=0; i<splited.length; i++) {
    		reverse += new StringBuilder(splited[i]).reverse().toString();
    		
    		if(i < splited.length-1) {
    			reverse += " ";
    		}
    	}
    	
        return reverse;
    }

    public static void main(String[] args) {
    	//System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
