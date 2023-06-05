package KYU_8;

public class RemoveChars {
    public static String remove(String str) {
        if (str.length() < 2) {
            return str; // Return the original string if it has less than two characters
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        String modifiedString = "Elephant";
        System.out.println(remove(modifiedString));
    }
}
