package com.challenge.easy.arrays;

public class FindFirstPalindrome {

    /**
     * This method finds the first palindromic string in the given array of words.
     * A palindromic string reads the same forward and backward.
     *
     * @param words Array of strings to search.
     * @return The first palindromic string, or an empty string if none exists.
     */
    public static String firstPalindrome(String[] words) {
        // Iterate through each word in the array
        for (String word : words) {
            // Check if the word is a palindrome
            if (isPalindrome(word)) {
                // Return the first palindromic word found
                return word;
            }
        }
        // If no palindromic word is found, return an empty string
        return "";
    }

    /**
     * Helper method to check if a given string is a palindrome.
     *
     * @param word The string to check.
     * @return True if the string is a palindrome, false otherwise.
     */
    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        // Compare characters from both ends of the string
        while (left < right) {
            // If characters do not match, it's not a palindrome
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        // If all characters match, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] words1 = {"abc", "car", "ada", "racecar", "cool"};
        String[] words2 = {"notapalindrome", "racecar"};
        String[] words3 = {"def", "ghi"};

        // Test and print results
        System.out.println(firstPalindrome(words1)); // Output: "ada"
        System.out.println(firstPalindrome(words2)); // Output: "racecar"
        System.out.println(firstPalindrome(words3)); // Output: ""
    }
}
