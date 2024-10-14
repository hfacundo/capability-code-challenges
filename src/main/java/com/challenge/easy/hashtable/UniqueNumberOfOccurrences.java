package com.challenge.easy.hashtable;

import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

/**
 # Unique Number of Occurrences

 Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 Example 1:
 Input: arr = [1,2,2,1,1,3]
 Output: true
 Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

 Example 2:
 Input: arr = [1,2]
 Output: false

 Example 3:
 Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 Output: true

 Constraints:

 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Hashtable<Integer,Integer> hashTable = new Hashtable<>();
        for (int j : arr) {
            hashTable.put(j, hashTable.getOrDefault(j, 0) + 1);
        }
        //filtre los valores que no se repiten enn el hash
        List <Integer> list= hashTable.values().stream().distinct().collect(Collectors.toList());
        //comparo si los valores filtrados son la misma cantidad que los valores antes de filtrar
        //si es igual significa que todos los valores son diferentes si no alguno de los valores se repite
        return hashTable.size() == list.size();
    }

    public static void main(String[] args) {

    }
}