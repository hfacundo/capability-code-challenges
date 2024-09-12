package com.challenge.easy.hashtable;

import com.challenge.easy.arrays.FindWordsContainingCharacter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;

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
        HashMap<Integer, Integer> arrsChecked = new HashMap<Integer, Integer>();
        int currentNumber;
        int i, j, repetitions;
        boolean containsUniqueNumberOfOcurrences=false;
        for(i = 0; i < arr.length; i++){
            currentNumber = arr[i];

            if(!arrsChecked.containsValue(currentNumber)){
                repetitions = 1;
                for(j = i+1; j < arr.length; j++){
                    if(arr[j]== currentNumber){
                        repetitions++;
                    }
                }
                if(!arrsChecked.containsKey(repetitions)){
                    arrsChecked.put(repetitions,currentNumber);
                    containsUniqueNumberOfOcurrences = true;
                }else{
                    containsUniqueNumberOfOcurrences = false;
                    break;
                }
            }
        }
        return containsUniqueNumberOfOcurrences;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindWordsContainingCharacter.class.getName());

        int[] arr = {1,2,2,1,1,3};

        logger.info("" + uniqueOccurrences(arr));
    }
}
