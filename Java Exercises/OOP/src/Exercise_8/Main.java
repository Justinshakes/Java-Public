package Exercise_8;

/*
    8. Write a Java program to create class called "TrafficLight"
    with attributes for color and duration, and methods to change
    the color and check for red or green.


 */
public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());

        light.changeColorGreen();

        System.out.println("After: light.changeColorGreen()\nThe light is now green: " + light.isGreen());
        System.out.println("The light duration is: " + light.getDuration());
        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}


class TrafficLight{
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColorGreen() {
        color = "green";
    }

    public void changeColorRed() {
        color = "red";
    }
    public boolean isRed() {
        return color.equals("red");
    }

    public boolean isGreen() {
        return color.equals("green");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}



