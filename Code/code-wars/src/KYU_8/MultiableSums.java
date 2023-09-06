package KYU_8;

public class MultiableSums {
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumMul(2, 9));    // Expected output: 20
        System.out.println(sumMul(3, 13));   // Expected output: 30
        System.out.println(sumMul(4, 123));  // Expected output: 1860

        // Additional test cases
        System.out.println(sumMul(5, 20));   // Expected output: 30
        System.out.println(sumMul(7, 50));   // Expected output: 154
        System.out.println(sumMul(1, 100));  // Expected output: 4950
    }

    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("n and m must be positive integers.");
        }

        long sum = 0;
        for (int i = n; i < m; i += n) {
            sum += i;
        }

        return sum;
    }
}

