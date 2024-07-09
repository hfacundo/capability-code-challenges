package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

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
        Boolean isUniqueOccurrence = false;
        Map<Integer,Integer> occurences = new HashMap<>();
        //coontando las ocurrencias de cada numero
        for (int number:arr)
            if(occurences.containsKey(number))
                occurences.put(number,occurences.get(number) + 1);
            else
                occurences.put(number,1);

        //recorriendo el map para saber si tiene numeros unicos
        for (int i = 0; i < occurences.size(); i++)
            for (int j = i+1; j < occurences.size(); j++)
                if (occurences.containsKey(i)) {
                    if (occurences.get(i).equals(occurences.get(j))) {
                        isUniqueOccurrence = false;
                        break;
                    }
                    isUniqueOccurrence = true;
                }
        return isUniqueOccurrence;
    }

    public static void main(String[] args) {

    }
}
