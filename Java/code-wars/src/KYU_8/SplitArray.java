package KYU_8;

import java.util.Arrays;

public class SplitArray {

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }
}
