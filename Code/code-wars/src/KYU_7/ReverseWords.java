package KYU_7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.trim().isEmpty()) {
            // If the original string consists of only spaces or is empty, return the original string as is
            return original;
        }

        String[] words = original.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            sb.append(reversedWord);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        // Output: "ehT kciuq nworb xof spmuj revo eht yzal .god"
    }
}
