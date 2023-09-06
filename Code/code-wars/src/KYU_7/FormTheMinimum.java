package KYU_7;

import java.util.Arrays;

/*
Task
Given a list of digits, return the smallest number
that could be formed from these digits, using the
digits only once (ignore duplicates).
 */
public class FormTheMinimum {

    public static int minValue(int[] values) {
        Arrays.sort(values);
        StringBuilder sb = new StringBuilder();
        for (int x : values) {
            if (sb.toString().contains(Integer.toString(x))) {
                continue;
            } else {
                sb.append(x);
            }
        }
        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[]{4, 7, 5, 7})); //457
    }
}
