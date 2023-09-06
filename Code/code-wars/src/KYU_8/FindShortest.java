package KYU_8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindShortest {
    public static int findShort(String s) {
        // Split the sentence into individual words\
        String[] words = s.split(" ");

        // Initialize the shortest length to a large value
        int shortestLength = Integer.MAX_VALUE;

        // Iterate through each word
        for (String word : words) {
            // Check if the length of the word is smaller than the current shortest length
            if (word.length() < shortestLength) {
                shortestLength = word.length();
            }
        }

        // Return the shortest length found
        return shortestLength;
    }


    public static void main(String[] args) {
        String sentence = "bitcoin take over the world maybe who knows perhaps";
        int shortestLength = findShort(sentence);
        System.out.println("Shortest string length: " + shortestLength);
    }
}
