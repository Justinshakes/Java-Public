package KYU_7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");  // Split the original string into an array of words
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            sb.append(reversedWord);  // Append each reversed word
            if (i < words.length - 1) {
                sb.append(" ");  // Add a space between words
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        // Output: "ehT kciuq nworb xof spmuj revo eht yzal .god"
    }
}
