package com.challenge.easy.twopointer;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.logging.Logger;

/**
    # Shortest Distance To A Character

     Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

     The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

     Example 1:
         Input: s = "loveleetcode", c = "e"
         Output: [3,2,1,0,1,0,0,1,2,2,1,0]
         Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
         The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
         The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
         For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
         The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.

     Example 2:
         Input: s = "aaab", c = "b"
         Output: [3,2,1,0]

     Constraints:

         * 1 <= s.length <= 104
         * s[i] and c are lowercase English letters.
         * It is guaranteed that c occurs at least once in s.
 */
public class ShortestDistanceToChar {

    public static int[] shortestToChar(String s, char c) {
        int[] responseArray=new int[s.length()];
        int cOccurrences=s.length()+1;

        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)==c){
                cOccurrences =i;
            }
            responseArray[i] = (cOccurrences==(s.length()+1)) ? s.length()+1 : i-cOccurrences;
        }

        cOccurrences=s.length()+1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==c){
                cOccurrences=i;
            }
            if(cOccurrences!=(s.length()+1)){
                responseArray[i] = (responseArray[i]>(cOccurrences -i)) ? cOccurrences -i:responseArray[i];
            }
        }
        return responseArray;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());

        String s = "loveleetcode";
        char c = 'e';
        int [] responseArray = shortestToChar(s,c);

        logger.info("Response array: ");
        System.out.print("[");
        for(int i=0;i<responseArray.length;i++){
            if(i==(responseArray.length-1)){
                System.out.println(responseArray[i]+"]");
            }else{
                System.out.print(responseArray[i]+",");
            }
        }
    }

}
