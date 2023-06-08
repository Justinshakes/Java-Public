package KYU_8;
import java.util.Arrays;
public class Calculate_average {
    public static double findAverage(int[] array) {
        double total = 0;
        for (int x : array) {
            total += x;
        }
        return total / array.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Average: " + findAverage(arr));
    }
}
