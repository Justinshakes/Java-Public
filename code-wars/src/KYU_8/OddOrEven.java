package KYU_8;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int total = 0;
        for(int i : array){
            total += i;
        }
        return (total % 2 == 0) ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
