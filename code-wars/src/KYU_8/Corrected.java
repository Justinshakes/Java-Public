package KYU_8;

public class Corrected {

    public static String correct(String string) {
        string = string.replace("5", "S")
                .replace("0", "O")
                .replace("1", "I");
        return string;
    }

    public static void main(String[] args) {
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        // Expected "ROBERT MERLE - THE DAY OF THE DOLPHIN"
    }
}
