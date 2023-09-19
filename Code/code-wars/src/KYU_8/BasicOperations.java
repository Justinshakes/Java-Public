package KYU_8;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 5, 5));
    }
}
