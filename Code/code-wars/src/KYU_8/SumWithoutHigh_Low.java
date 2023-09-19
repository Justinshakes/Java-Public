package KYU_8;

public class SumWithoutHigh_Low {
    // Method to calculate the sum of an array excluding the highest and lowest values
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 2) {
            return 0; // Return 0 if the array is null or has 2 or fewer elements
        }

        int min = numbers[0]; // Initialize the minimum value as the first element
        int max = numbers[0]; // Initialize the maximum value as the first element
        int total = numbers[0]; // Initialize the total sum as the first element

        for (int i = 1; i < numbers.length; i++) { // Start the loop from the second element

            total += numbers[i]; // Add the current element to the total sum

            if (numbers[i] < min) { // If the current element is smaller than the current minimum
                min = numbers[i]; // Update the minimum value
            } else if (numbers[i] > max) { // If the current element is larger than the current maximum
                max = numbers[i]; // Update the maximum value
            }
        }

        return total - max - min; // Return the sum excluding the highest and lowest values
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{6, 2, 1, 8, 10})); // Test the sum method with an example array
    }
}
