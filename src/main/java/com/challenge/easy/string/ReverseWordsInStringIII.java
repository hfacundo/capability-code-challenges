package com.challenge.easy.string;

/**
    # Reverse Words in a String III

     Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

     Example 1:
         Input: s = "Let's take LeetCode contest"
         Output: "s'teL ekat edoCteeL tsetnoc"

     Example 2:
         Input: s = "Mr Ding"
         Output: "rM gniD"

     Constraints:

         * 1 <= s.length <= 5 * 104
         * s contains printable ASCII characters.
         * s does not contain any leading or trailing spaces.
         * There is at least one word in s.
         * All the words in s are separated by a single space.

 */
public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {
        // Convertir la cadena en un arreglo de caracteres
        char [] charArray = s.toCharArray();
        
        int start = 0;
        for (int end = 0; end < charArray.length; end++) {
            // Si encontramos un espacio o el final de la cadena, invertimos la palabra
            if (charArray[end] == ' ' || end == charArray.length - 1) {
                // Si es el final de la cadena, ajustamos 'end' al último carácter
                int wordEnd = (end == charArray.length - 1) ? end : end - 1;
                reverse(charArray, start, wordEnd);
                start = end + 1;  // Mover el inicio a la siguiente palabra
            }
        }

        return new String(charArray);
    }

    public static void reverse(char[] array, int start, int end){
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

    }
}
