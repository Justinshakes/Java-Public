package KYU_8;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return (name.startsWith("r") || name.startsWith("R"))
                ? name + " plays banjo"
                : name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Justin"));
        System.out.println(areYouPlayingBanjo("Ralph"));
    }
}
