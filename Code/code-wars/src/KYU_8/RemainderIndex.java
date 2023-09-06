package KYU_8;

import java.util.Arrays;

public class RemainderIndex {

    public static int[] multipleOfIndex(int[] array) {
        int[] result = new int[array.length];
        int resultIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                result[resultIndex] = array[i];
                resultIndex++;
            }
        }

        return Arrays.copyOf(result, resultIndex);
    }

    public static void main(String[] args) {
        int[] numbers = {-56, -85, 72, -26, -14, 76, -27, 72, 35, -21, -67, 87, 0, 21, 59, 27, -92, 68};
        int[] result = multipleOfIndex(numbers);
        System.out.println(Arrays.toString(result)); // [-85, 72, 0, 68]
    }
}
