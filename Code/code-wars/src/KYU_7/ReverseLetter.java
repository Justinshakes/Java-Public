package KYU_7;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                reversed.append(ch);
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "krishan";
        String reversed = ReverseLetter.reverseLetter(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
