package com.challenge.easy.hashtable;


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
        int fisrtUnique = -1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1))//si estan dos letras iguales juntas me brinco a la siguiente letra!
                i=i+2;
            for (int j = i+1 ; j < s.length()-1; j++) {
                fisrtUnique = i;
                if(s.charAt(i)==s.charAt(j)){
                    fisrtUnique = -1;
                    break;
                }


            }
            if(fisrtUnique!=-1)
                break;
        }

        return fisrtUnique;
    }

    public static void main(String[] args) {

    }
}
