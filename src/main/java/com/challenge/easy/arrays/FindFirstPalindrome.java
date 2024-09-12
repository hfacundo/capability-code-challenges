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
    	
    	for (String palindromo : words) {
    		
    		   String[] arrayString = palindromo.split("");
    	          
    	       Integer resuduo = arrayString.length % 2;
    	       
    	       Integer mitad = arrayString.length / 2;
    	       
    	       //Revisar si es par o inpar
    	       Integer esInPar = (resuduo != 0) ? 1:0; 
    	       
    	       StringBuilder strBuilder = new StringBuilder();
    	     
    	       String mitad1 = palindromo.substring(0, mitad);
    	       String mitad2 = palindromo.substring(mitad+esInPar, arrayString.length);
    	       strBuilder.append(mitad2);
    	       String mitad2Reverso = strBuilder.reverse().toString();
//    		   System.out.println("Mitad 1 "+mitad1);
//    		   System.out.println("Mitad 2 "+mitad2);
    		   
//    		   System.out.println("Mitad 2 reverse "+mitad2Reverso);
    	       
    	       if (mitad1.equalsIgnoreCase(mitad2Reverso)) {
    	    	   return palindromo;
//    	    	   System.out.println(palindromo);
//    	    	   System.out.println("Es un palindromo");
    	       }else {
//    	    	   System.out.println("No es un palindromo");
    	       }
			
		}
        return "";
    }

    public static void main(String[] args) {

    }
}
