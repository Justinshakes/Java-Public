package KYU_8;

public class Squared {
    public static int squareSum(int[] n) {
        int total = 0;
        for(int x : n){
            total += Math.pow(x,2);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1, 2, 2}));
    }
}
