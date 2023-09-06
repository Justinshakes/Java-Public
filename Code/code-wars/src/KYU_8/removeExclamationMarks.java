package KYU_8;

public class removeExclamationMarks {
    public static String removeEx(String s){
        return s.replaceAll("!", "");
    }
    public static void main(String[] args) {
       System.out.println(removeEx("Hello World!"));
    }
}
