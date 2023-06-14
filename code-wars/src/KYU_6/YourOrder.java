package KYU_6;

public class YourOrder {
    public static String order(String words) {
        // If the input string is empty, return an empty string
        if (words.isEmpty()) {
            return "";
        }

        // Split the input string into an array of words
        String[] wordArray = words.split(" ");

        // Create a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        // Iterate from 1 to the length of the word array
        for (int i = 1; i <= wordArray.length; i++) {
            // Search for the word containing the current number
            for (String word : wordArray) {
                if (word.contains(String.valueOf(i))) {
                    // Append the word to the result StringBuilder
                    result.append(word).append(" ");
                    break;
                }
            }
        }

        // Convert the result StringBuilder to a string and trim any trailing spaces
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "is2 Thi1s T4est 3a";
        String input2 = "4of Fo1r pe6ople g3ood th5e the2";
        String input3 = "";

        System.out.println(order(input1)); // Output: "Thi1s is2 3a T4est"
        System.out.println(order(input2)); // Output: "Fo1r the2 g3ood 4of th5e pe6ople"
        System.out.println(order(input3)); // Output: ""
    }
}
