package com.challenge.easy.hashtable;

import com.challenge.easy.arrays.FindWordsContainingCharacter;

import java.util.*;
import java.util.logging.Logger;

/**
    # First Unique Character in a String
     Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

     Example 1:
         Input: s = "leetcode"
         Output: 0

     Example 2:
         Input: s = "loveleetcode"
         Output: 2

     Example 3:
         Input: s = "aabb"
         Output: -1


     Constraints:

         * 1 <= s.length <= 105
         * s consists of only lowercase English letters.
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        char [] characters = s.toCharArray();
        HashSet<Character> charsChecked = new HashSet<Character>();
        char currentChar;
        int i, j, repetitions;
        for(i = 0; i < characters.length; i++){
            currentChar = characters[i];

            if(!charsChecked.contains(currentChar)){
                charsChecked.add(currentChar);
                repetitions = 1;
                for(j = i+1; j < characters.length; j++){
                    if(characters[j]== currentChar){
                        repetitions++;
                    }
                    if(repetitions>=2){
                        break;
                    }
                }
                if(repetitions==1){
                    break;
                }
            }
            if((i+1)==characters.length){
                return -1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindWordsContainingCharacter.class.getName());

        String s = "leetcode";

        int number = firstUniqChar(s);
        if(number >= 0){
            logger.info("Index of the first non-repeating character: "+number);
        }else{
            logger.info("All the chars repeat at least two times: "+number);
        }

    }
}
