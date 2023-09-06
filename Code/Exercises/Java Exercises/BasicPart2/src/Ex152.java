/*
    152. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

    Sample Output:
    Input first number: 25
    Input second number: 37
    Input third number: 45
    Input fourth number: 23
    Numbers are not equal!
 */

import java.util.Scanner;

public class Ex152 {
    public static void main(String[] args) {

        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = sc.nextInt();
        System.out.print("Input second number: ");
        b = sc.nextInt();
        System.out.print("Input third number: ");
        c = sc.nextInt();
        System.out.print("Input fourth number: ");
        d = sc.nextInt();

        if(a == b && b == c && c == d){
            System.out.println("Numbers are equal!");
        }else{
            System.out.println("Numbers are not equal!");
        }
    }
}
