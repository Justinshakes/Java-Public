package KYU_6;

public class BreakcamelCase {

    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(" ");
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));

        // Additional tests
        System.out.println(camelCase("helloWorld")); // "hello World"
        System.out.println(camelCase("breakCamelCase")); // "break Camel Case"
        System.out.println(camelCase("codeChallenge")); // "code Challenge"
        System.out.println(camelCase("camel")); // "camel"
    }

}
