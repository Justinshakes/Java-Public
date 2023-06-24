package KYU_8;

public class Cockroach {
    public static int cockroachSpeed(double x) {
        double conversionFactor = 27.7778; // 1 km/h = 27.7778 cm/s
        return (int) Math.round(x * conversionFactor);
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }
}
