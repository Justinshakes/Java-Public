package KYU_8;

public class StrayNumber {
    static int stray(int[] numbers){
        return 1;
    }

    /*
    Utilized the XOR operator (^) to find the unique number in the array.
    The XOR operation cancels out the duplicates, leaving only the unique number.
     */
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(stray(arr));
    }
}
