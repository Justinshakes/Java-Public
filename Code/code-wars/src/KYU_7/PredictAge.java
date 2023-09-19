package KYU_7;

public class PredictAge {

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // Step 1: Square each age
        int squaredSum = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;

        // Step 2: Take the square root of the sum
        double squareRoot = Math.sqrt(squaredSum);

        // Step 3: Divide by two
        int predictedAge = (int) (squareRoot / 2);

        // Return the predicted age rounded down to the nearest integer
        return predictedAge;
    }

    public static void main(String[] args) {
        // Test the predictAge function
        int predictedAge = predictAge(65, 60, 75, 55, 60, 63, 64, 45);
        System.out.println("Predicted Age: " + predictedAge); // = 86
    }
}
