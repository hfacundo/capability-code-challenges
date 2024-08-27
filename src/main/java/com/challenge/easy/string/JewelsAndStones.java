package com.challenge.easy.string;

/**
 * # Jewels and Stones
 * <p>
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * <p>
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * <p>
 * Example 2:
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 */
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        String[] stonesToCharArray = stones.split("");
        int count = 0;
        for (String stone : stonesToCharArray) {
            if (jewels.contains(stone)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "z", stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
