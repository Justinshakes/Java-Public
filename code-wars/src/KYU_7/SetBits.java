package KYU_7;

public class SetBits {
    public static long eliminateUnsetBits(String number) {
        char[] arr = number.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (c == '1') {
                sb.append(c);
            }
        }

        if (sb.length() == 0) {
            return 0;  // No set bits, return 0
        } else {
            return Long.parseLong(sb.toString(), 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(eliminateUnsetBits("11010101010101"));  // Output: 255
        System.out.println(eliminateUnsetBits("111"));           // Output: 7
        System.out.println(eliminateUnsetBits("1000000"));       // Output: 1
        System.out.println(eliminateUnsetBits("000"));           // Output: 0
    }
}
