package KYU_7;

public class Triangular {
    public static long triangular(long n) {
        long total = 0;
        if(n <= 0){
            return 0;
        }
        while(n > 0){
            total += n;
            n--;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(triangular(4)); // = 10
    }
}
