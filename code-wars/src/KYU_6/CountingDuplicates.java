package KYU_6;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase(); // Convert the input string to lowercase for case-insensitive comparison
        int count = 0; // Initialize the count variable to keep track of duplicates
        char[] chars = new char[256]; // Create a character array to store encountered characters (assuming ASCII characters)

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Get the current character
            if (chars[currentChar] == 1) {
                // If the character has already been encountered once, increment the count
                // Only increment if it hasn't been counted before (chars[currentChar] == 1)
                count++;
                chars[currentChar] = 2; // Mark the character as counted to avoid duplicate counting
            } else if (chars[currentChar] == 0) {
                // If the character hasn't been encountered before, mark it as encountered
                chars[currentChar] = 1;
            }
        }

        return count; // Return the count of duplicates
    }

    public static void main(String[] args) {
        //System.out.println(duplicateCount("abcde")); // 0
        System.out.println(duplicateCount("aabbcde")); // 2
        //System.out.println(duplicateCount("aabBcde")); // 2
        //System.out.println(duplicateCount("indivisibility")); // 1
        //System.out.println(duplicateCount("Indivisibilities")); // 2
        //System.out.println(duplicateCount("aA11")); // 2
        //System.out.println(duplicateCount("ABBA")); // 2
    }
}
