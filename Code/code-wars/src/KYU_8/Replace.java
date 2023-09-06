package KYU_8;

public class Replace {
    /*public static String replace(final String s) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (char c : s.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                sb.append("!");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }*/

    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static void main(String[] args) {
        System.out.println(replace("ABCDE"));  // !BCD!
    }
}
