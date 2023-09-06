package KYU_8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            int current = Character.getNumericValue(c);
            if (current < 5) {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println("01011110001100111");
    }
}


/*
    Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
    Return the resulting string.

    Note: input will never be an empty string
     */
