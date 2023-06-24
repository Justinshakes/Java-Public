package KYU_8;

public class Alphabet {

    public static String position(char alphabet)
    {
        return "Position of alphabet: " + (Character.toLowerCase(alphabet) - 96);
    }
    public static void main(String[] args) {
        System.out.println(position('a'));
        System.out.println(position('b'));


    }
}
