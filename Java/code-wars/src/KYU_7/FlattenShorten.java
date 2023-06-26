package KYU_7;

import java.util.Arrays;

public class FlattenShorten {
    public static int[] flattenAndSort(int[][] array) {
        // Check if the array is empty
        if (array.length == 0) {
            return new int[0];
        }

        // Calculate the total length of the resulting flattened array
        int totalLength = 0;
        for (int[] subArray : array) {
            totalLength += subArray.length;
        }

        // Create a new array with the correct size based on the total length
        int[] resultArr = new int[totalLength];
        int index = 0;

        // Flatten the array and store the elements in the resultArr
        for (int[] subArray : array) {
            for (int num : subArray) {
                resultArr[index] = num;
                index++;
            }
        }

        // Sort the elements in ascending order
        Arrays.sort(resultArr);

        return resultArr;
    }

    public static void main(String[] args) {
        // Test the flattenAndSort method
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}))); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
