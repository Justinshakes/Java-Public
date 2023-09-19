package KYU_7;

import java.util.Arrays;

public class Isogram {
    public static boolean isIsogram(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != ' ') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("moose"));
    }
}
