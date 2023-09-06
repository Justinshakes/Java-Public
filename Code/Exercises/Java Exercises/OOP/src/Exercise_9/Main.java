package Exercise_9;

/*
    9. Write a Java program to create a class called "Employee"
    with a name, salary, and hire date attributes, and a method
    to calculate years of service.
 */

import java.time.LocalDate;
import java.time.Period;
public class Main {
    public static void main(String[] args) {
        // Create three instances of the Employee class with different details
        Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));


        // Print employee details and years of service for each employee
        employee1.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.getYearsOfService());

        employee2.printEmployeeDetails();
        System.out.println("Years of Service: " + employee2.getYearsOfService());

        employee3.printEmployeeDetails();
        System.out.println("Years of Service: " + employee3.getYearsOfService());
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor to initialize the attributes of the Employee class
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters and setters for the attributes of the Employee class
    // (omitted for brevity)

    // Method to calculate the years of service based on the hire date
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    // Method to print the employee details
    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
    }
}
