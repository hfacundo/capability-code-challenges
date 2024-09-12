package com.challenge.easy.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
    # Split a String in Balanced Strings

     Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

     Given a balanced string s, split it into some number of substrings such that:

     Each substring is balanced.
     Return the maximum number of balanced strings you can obtain.

     Example 1:
         Input: s = "RLRRLLRLRL"
         Output: 4
         Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

     Example 2:
         Input: s = "RLRRRLLRLL"
         Output: 2
         Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
         Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

     Example 3:
         Input: s = "LLLLRRRR"
         Output: 1
         Explanation: s can be split into "LLLLRRRR".

     Constraints:

         # 2 <= s.length <= 1000
         # s[i] is either 'L' or 'R'.
         # s is a balanced string.

 */
public class BalancedString {

    public static int balancedStringSplit(String s) {
//		String  s = "LLLLRRRR";
		
		String strFinal = "";
		
		List<String> listaStr = new ArrayList<String>();
		
		HashMap<String,Integer> lista = new HashMap<String, Integer>();
		lista.put("R", 0);
		
		lista.put("L", 0);
		
		String[] arrayStr=s.split("");
		for (String string : arrayStr) {
			lista.put(string,lista.get(string)+1);
			strFinal+=string;
//			System.out.println(string);
			if (lista.get("R") == lista.get("L")) {
//				System.out.println("STR Final:: "+strFinal);
				listaStr.add(strFinal);
				strFinal = "";
			    lista.put("R", 0);
				lista.put("L", 0);
			}
		}
		
		return listaStr.size();
    }

    public static void main(String[] args) {

    }
}
