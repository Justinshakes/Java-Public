package KYU_8;

import java.util.Arrays;

public class Powers {
    public static long[] powersOfTwo(int n){
        long arr[] = new long[n+1];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (long) Math.pow(2,i);
        }

        return arr;
    }

    public static void main(String[] args) {
        //assertArrayEquals(new long[]{1,2,4,8,16}, Kata.powersOfTwo(4));

        System.out.println(Arrays.toString(powersOfTwo(4)));

    }
}
