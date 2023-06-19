package KYU_7;

public class HelloWorld {
    public static String helloWorld() {
        int[] chars = { 72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33 };
        StringBuilder sb = new StringBuilder();

        for (int c : chars) {
            sb.append(Character.toString((char) c));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }
}

