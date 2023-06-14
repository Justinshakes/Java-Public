package KYU_7;

public class UpperLowerCase {
    public static String solve(final String str) {
        int lower = 0, upper = 0;

        // Iterate over each character in the input string
        for (char c : str.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                upper++; // Increment the count of uppercase characters
            } else {
                lower++; // Increment the count of lowercase characters
            }
        }

        // Return the string converted to lowercase if there are more lowercase characters,
        // otherwise return the string converted to uppercase
        return (lower >= upper) ? str.toLowerCase() : str.toUpperCase();
    }


    public static void main(String[] args) {
        // Test cases
        String input1 = "hello world";
        String input2 = "HELLO WORLD";
        String input3 = "HeLLo WoRLD";
        String input4 = "";
        String input5 = "A";

        // Test case 1: All lowercase
        System.out.println("Input: " + input1);
        System.out.println("Output: " + solve(input1));

        // Test case 2: All uppercase
        System.out.println("Input: " + input2);
        System.out.println("Output: " + solve(input2));

        // Test case 3: Mixed case
        System.out.println("Input: " + input3);
        System.out.println("Output: " + solve(input3));

        // Test case 4: Empty string
        System.out.println("Input: " + input4);
        System.out.println("Output: " + solve(input4));

        // Test case 5: Single character
        System.out.println("Input: " + input5);
        System.out.println("Output: " + solve(input5));
    }
}
