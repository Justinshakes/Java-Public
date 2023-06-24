package KYU_8;

import java.util.Arrays;

public class TakeFirst3 {

    public static int[] take(int[] arr, int n) {
        return (n >= arr.length)? arr : Arrays.copyOf(arr, n);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));

        // Additional tests
        System.out.println(Arrays.toString(take(new int[]{4, 7, 9}, 2))); // [4, 7]
        System.out.println(Arrays.toString(take(new int[]{1, 2, 3, 4, 5}, 5))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(take(new int[]{}, 3))); // []
        System.out.println(Arrays.toString(take(new int[]{1, 2, 3, 4, 5}, 0))); // []
    }

}
