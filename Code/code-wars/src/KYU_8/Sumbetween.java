package KYU_8;

public class Sumbetween {
    public static int GetSum(int a, int b) {
        if (a == b)
            return a;

        int total = 0;
        for (int i = (a < b) ? a : b; i <= ((a < b) ? b : a); i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(0, -1));
    }
}
