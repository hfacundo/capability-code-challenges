package com.challenge.easy.twopointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
    # Shortest Distance To A Character

     Given a string s and a character c that occurs in s, return an array of integers answer where 
     answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

     The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

     Example 1:
         Input: s = "loveleetcode", c = "e"
         Output: [3,2,1,0 ,1,0,0,1, 2,2,1,0]
         Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
         The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
         The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
         For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same:
          abs(4 - 3) == abs(4 - 5) = 1.
         The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.

     Example 2:
         Input: s = "aaab", c = "b"
         Output: [3,2,1,0]


Input: s = "loveleetcode", c = "e"

 3, 5, 6, 11 

		l,o,v,e,l,e,e,t,c,o,d ,e
		0,1,2,3,4,5,6,7,8,9,10,11
		3,2,1,0,1,0,0,1,2,2,1, 0



     Constraints:

         * 1 <= s.length <= 104
         * s[i] and c are lowercase English letters.
         * It is guaranteed that c occurs at least once in s.
 */
public class ShortestDistanceToChar {

    public static int[] shortestToChar(String s, char c) {
//    	char c = 'e';
//    	String s = "loveleetcode";
    	String arr[] = s.split("");
    	ArrayList<Integer> listaOcurrencias = new ArrayList<Integer>();
    	ArrayList<String> listaOriginal = new ArrayList<String>();
    	ArrayList<Integer> resultado = new ArrayList<Integer>();
    	
    	int counter = 0;
    	
    	for (String string : arr) {
    		listaOriginal.add(string);	
    		if (string.equals(c+"")) {
    			listaOcurrencias.add(counter);
			}
    		counter++;
		}
    	int indexListaOriginal = 0;
    	int indexListaOcurrencias = 0;
    	int pivote1 = 0;
    	int pivote2 = listaOcurrencias.get(indexListaOcurrencias);
    	int distanciaIzq= 0;
    	int distanciaDer = 0;
    	
//    	Boolean imprimir = 1;
    	
		for (String myChar : listaOriginal) {
			//System.out.println(myChar);
			if (indexListaOriginal <= listaOriginal.size()) {
				int distanciaCercanaAbs = Math.abs(indexListaOriginal - pivote2);
				if(pivote1 != 0 ) {
					distanciaIzq = indexListaOriginal-pivote1;
					distanciaDer = pivote2 - indexListaOriginal;
					int distanciaCorta = (distanciaIzq < distanciaDer) ? distanciaIzq:distanciaDer;
					resultado.add(distanciaCorta);
//					System.out.println(distanciaCorta);
				}else {
					resultado.add(distanciaCercanaAbs);
//					System.out.println(distanciaCercanaAbs);
				}
				if (distanciaCercanaAbs == 0 && indexListaOcurrencias+1 < listaOcurrencias.size()) {
					pivote1 = pivote2;
					indexListaOcurrencias++;
					pivote2 = listaOcurrencias.get(indexListaOcurrencias);
				}
			}
			indexListaOriginal++;
		}
		int[] output = new int[resultado.size()];
		for (int i = 0; i < output.length; i++) {
			output[i] = resultado.get(i);
		}
		return output;
    }

    public static void main(String[] args) {

    }
}
