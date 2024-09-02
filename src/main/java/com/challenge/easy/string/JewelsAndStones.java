package com.challenge.easy.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<String> listaStones = Stream.of(stones.split("")).collect(Collectors.toList());
        List<String> listaJewels = Stream.of(jewels.split("")).collect(Collectors.toList());
        Map<String, Long> jewelsMap = listaJewels.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String, Long> stonesMap = listaStones.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        int acc = 0;
        for(String key: jewelsMap.keySet()){
            acc+= stonesMap.getOrDefault(key, 0L);
        }
        return acc;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
