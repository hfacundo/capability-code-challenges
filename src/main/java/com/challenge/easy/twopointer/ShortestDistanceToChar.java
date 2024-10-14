package com.challenge.easy.twopointer;

import java.util.ArrayList;

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
        int [] arrResult = new int[s.length()];
        char [] sSplit = s.toCharArray();
        int result,result2,j=0;
        ArrayList<Integer> AllIndexOfC= new ArrayList<>();
        AllIndexOfC.add(new String(sSplit).indexOf(c));
        while (AllIndexOfC.get(j) != -1){
            AllIndexOfC.add(s.indexOf(c,AllIndexOfC.get(j)+1));
            j++;
        }
        //elimino el ultimo valor dado que es -1 por que ya no encontro mas indices del valor en el string
        AllIndexOfC.remove(AllIndexOfC.size()-1);
        j=0;
        for (int i=0;i<sSplit.length;i++){
            result=AllIndexOfC.get(j)-i;

            if (AllIndexOfC.size()-1!=0){

                if (AllIndexOfC.size()-1==j){
                    result2=AllIndexOfC.get(j)-i;
                    result=i-AllIndexOfC.get(j-1);
                }else{
                    result2=AllIndexOfC.get(j+1)-i;
                }

                arrResult[i] = Math.min(result2, result);

                if (i==AllIndexOfC.get(j)){
                    j++;
                }

            }else {arrResult[i]=result;}
        }
        return arrResult;
    }

    public static void main(String[] args) {

    }
}

