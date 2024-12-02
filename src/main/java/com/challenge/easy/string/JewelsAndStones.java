package com.challenge.easy.string;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    /**
     * Counts how many stones are jewels.
     *
     * @param jewels The string representing jewel types.
     * @param stones The string representing available stones.
     * @return The number of stones that are jewels.
     */
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // Output: 3
        System.out.println(numJewelsInStones("z", "ZZ"));       // Output: 0
    }
}
