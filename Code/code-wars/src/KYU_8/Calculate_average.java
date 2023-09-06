package KYU_8;

import java.util.Arrays;

public class Calculate_average {
    public static double find_average(int[] array) {
        // Use Arrays.stream() to create a stream of integers from the array
        // Then, use the average() method to calculate the average of the elements in the stream
        // If the stream is empty, return a default value of 0 using orElse(0)
        return Arrays.stream(array).average().orElse(0);
    }

    /*The orElse() method is triggered when the average() method
    called on the stream does not have a value to return.*/

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Average: " + find_average(arr));
    }
}
