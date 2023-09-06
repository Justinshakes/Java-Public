package KYU_7;

public class SumOfSequence {
    public static int sequenceSum(int start, int end, int step) {
        int result = 0;
        while (start <= end) {
            System.out.print(start + " + ");
            result += start;
            start += step;
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        assertEquals(15, sequenceSum(1, 5, 1), "sequenceSum(1, 5, 1)");
        assertEquals(5, sequenceSum(1, 5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, sequenceSum(0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals(0, sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }

    // Helper method for testing
    public static void assertEquals(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName + " FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
}
