package com.challenge.easy.math;

import com.challenge.easy.arrays.FindFirstPalindrome;

import java.util.HashMap;
import java.util.logging.Logger;

/**
    # Roman to Integer

     Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

         Symbol       Value
         I             1
         V             5
         X             10
         L             50
         C             100
         D             500
         M             1000
     For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
     The number 27 is written as XXVII, which is XX + V + II.

     Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

         I can be placed before V (5) and X (10) to make 4 and 9.
         X can be placed before L (50) and C (100) to make 40 and 90.
         C can be placed before D (500) and M (1000) to make 400 and 900.
         Given a roman numeral, convert it to an integer.

     Example 1:
         Input: s = "III"
         Output: 3
         Explanation: III = 3.

     Example 2:
         Input: s = "LVIII"
         Output: 58
         Explanation: L = 50, V= 5, III = 3.

     Example 3:
         Input: s = "MCMXCIV"
         Output: 1994
         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

     Constraints:

         * 1 <= s.length <= 15
         * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
         * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        char [] sArray = s.toCharArray();
        Integer number=0;
        char nextChar = '0', currentChar = '0';
        boolean lastNumberFlag=false;
        HashMap<String, Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        for(int i=0; i<sArray.length; i++){
            currentChar = sArray[i];
            if((i+1) > (sArray.length-1)){
                lastNumberFlag = true;
            }else{
                nextChar = sArray[i+1];
            }
            if(lastNumberFlag || romanMap.get(String.valueOf(currentChar)) >= romanMap.get(String.valueOf(nextChar))){
                number = number + romanMap.get(String.valueOf(currentChar));
            }else{
                if ((currentChar=='I' && (nextChar=='V'||nextChar=='X'))
                   || (currentChar=='X' && (nextChar=='L'||nextChar=='C'))
                   || (currentChar=='C' && (nextChar=='D'||nextChar=='M'))){
                        number = number + (romanMap.get(String.valueOf(nextChar)) - romanMap.get(String.valueOf(currentChar)));
                        i++;
                }else{
                    number = -1;
                    return number;
                }
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindFirstPalindrome.class.getName());

        String s = "III";
        int integerNumber = romanToInt(s);

        if(integerNumber != -1){
            logger.info("Integer value: "+integerNumber);
        }else{
            logger.info("Ivalid Roman Number");
        }
    }
}
