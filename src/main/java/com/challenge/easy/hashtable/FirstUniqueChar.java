package com.challenge.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

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
    	Integer resultado = -1;
    	//String s = "leetcode";
    	String arr[] = s.split("");
    	HashMap<String,Integer> lista = new LinkedHashMap<String,Integer>();
    	ArrayList<String> listaOriginal = new ArrayList<String>();
    	
    	for (String string : arr) {
    		listaOriginal.add(string);
    		if (!lista.containsKey(string)) {
    			lista.put(string, 0);	
			}else {
				lista.put(string, lista.get(string)+1);
			}	
		}
    	for (Entry<String, Integer> entry : lista.entrySet()) {
			String  key = entry.getKey();
			Integer val = entry.getValue();
			if (val == 0) {
				resultado = listaOriginal.indexOf(key);
				System.out.println("Primer char no repetido excontrado:: "+key+" index:: "+listaOriginal.indexOf(key));
				break;
			}
		}
    	return resultado;
    }

    public static void main(String[] args) {


    }
}
