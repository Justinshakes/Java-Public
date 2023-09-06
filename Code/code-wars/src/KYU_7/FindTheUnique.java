package KYU_7;

import java.util.Arrays;

public class FindTheUnique {
    public static double findUniq(double[] arr) {
        Arrays.sort(arr);

        if (arr[0] != arr[1]) {
            return arr[0];
        } else {
            return arr[arr.length - 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1})); // 2
    }
}

