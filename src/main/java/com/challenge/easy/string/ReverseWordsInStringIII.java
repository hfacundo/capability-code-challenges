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
public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {
    	
    	//Split and join reversed words with space
    	/*
    	String[] words = s.split("\s");
    	StringJoiner sj = new StringJoiner(" ");
    	System.out.println(Arrays.toString(words));
    	for(int i = 0; i< words.length; i++) {
    		String word = "";
    		for(int j = words[i].length() -1 ; j>=0 ; j--) {
    			word+= words[i].charAt(j);
    		}

    		words[i] = word;
    		sj.add(word);
    	}
    	
    	System.out.println(Arrays.toString(words));
    	
        return sj.toString(); 
        */
    	
    	//Substring words and append in reverse order to string 
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 0; i<s.length(); i++) {
    		
    		String remainder = s.substring(i);
    		
    		int lastIndex = remainder.indexOf(" ");
    		
    		String word = "";
    		
    		if(lastIndex != -1) {
    			word = s.substring(i, i+lastIndex);
    			i += word.length();    			
    		}else {
    			word = remainder;
    			i= s.length() -1;
    		}
    		
    		for(int j = word.length() -1; j >= 0; j--) {
    			sb.append(word.charAt(j));
    		}
    		
    		if(lastIndex!=-1) sb.append(" ");
    	}
    	
    	return sb.toString();
    	
    }

    public static void main(String[] args) {
    	System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
