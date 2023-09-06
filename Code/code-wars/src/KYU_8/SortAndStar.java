package KYU_8;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        StringBuilder firstValue = new StringBuilder();

        for (char c : s[0].toCharArray()) {
            firstValue.append(c).append("***");
        }

        // Remove the last three characters from the StringBuilder
        firstValue.setLength(firstValue.length() - 3);

        return firstValue.toString();
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }
}
