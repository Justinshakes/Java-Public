package KYU_7;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (String x : a1) {
            for (String y : a2) {
                int difference = Math.abs(x.length() - y.length());

                if (difference > maxLength) {
                    maxLength = difference;
                }

                if (difference < minLength) {
                    minLength = difference;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        int result = mxdiflg(a1, a2);
        System.out.println("Max difference in string lengths: " + result);
    }
}
