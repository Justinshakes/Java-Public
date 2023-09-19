package KYU_8;

public class CheckFactor {

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkForFactor(5, 1));
    }


}
