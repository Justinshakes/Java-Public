package KYU_8;

public class Converter {
    public static int binToDecimal(String inp) {
        int total = 0;
        for (int i = inp.length() - 1; i >= 0; i--) {
            System.out.println("i: " + i);
            System.out.println(total);
            if (inp.charAt(i) == '1') {
                int exponent = inp.length() - 1 - i;
                total += Math.pow(2, exponent);
            }
        }
        return total;
    }

    // Figure this out.

    public static void main(String[] args) {
        String s = "1001001";
        System.out.println(s.length());
        System.out.println("Binary: 1001001" + "\nDecimal: " + binToDecimal("1001001"));
    }
}
