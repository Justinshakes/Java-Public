package KYU_8;

public class CharProblem {
    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }
}
