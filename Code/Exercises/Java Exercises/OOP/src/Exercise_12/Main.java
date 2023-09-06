package Exercise_12;

import java.time.LocalTime;

/*
    12. Write a Java program to create a class called "Airplane" with a flight number,
    destination, and departure time attributes, and methods to check flight status and delay.
*/

public class Main {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
        Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));
        System.out.println("Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight1.delay(40);
        flight2.delay(110);
        System.out.println("\nCurrent Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
    }
}


class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime scheduledDeparture;
    private int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.delayTime = 0;
    }

    public void delay(int minutes) {
        this.delayTime = minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }

    public void checkStatus() {
        if (delayTime == 0) {
            System.out.println("Flight " + flightNumber + " is on time.");
        } else {
            System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");
        }
    }
}

