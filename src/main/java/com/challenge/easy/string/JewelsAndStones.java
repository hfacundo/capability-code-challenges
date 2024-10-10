package com.challenge.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**

     # Jewels and Stones

     You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
     Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

     Letters are case sensitive, so "a" is considered a different type of stone from "A".

     Example 1:
         Input: jewels = "aA", stones = "aAAbbbb"
         Output: 3

     Example 2:
         Input: jewels = "z", stones = "ZZ"
         Output: 0

     Constraints:

         * 1 <= jewels.length, stones.length <= 50
         * jewels and stones consist of only English letters.
         * All the characters of jewels are unique.
 */
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        if(jewels == null || jewels.isEmpty() || stones == null || stones.isEmpty()) {
            return 0;
        }
        // A Set to hold the characters that represent a jewel
        Set<Character> seenJewels = new HashSet<Character>();

        // Traverse to store the jewels in the set
        for(char c : jewels.toCharArray()){
            seenJewels.add(c);
        }
        int countJewels = 0;
        // traverse each stone to check how many of them are jewels
        for(char c : stones.toCharArray()){
            if(seenJewels.contains(c)){
                countJewels++;
            }
        }
        // We return the number of jewels occurrences in stones
        return  countJewels;
    }

    public static void main(String[] args) {

    }
}
