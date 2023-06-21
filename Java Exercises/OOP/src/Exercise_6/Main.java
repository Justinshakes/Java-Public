package Exercise_6;

/*
    6. Write a Java program to create a class called "Employee" with a name,
    job title, and salary attributes, and methods to calculate and update salary.
 */
public class Main {
    public static void main(String[] args) {
        // Create two Employee objects with initial values
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        System.out.println("\nEmployee Details:");
        // Print details of both employees
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        // Increase salaries by a given percentage
        employee1.raiseSalary(8);
        employee2.raiseSalary(12);

        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for 'Franziska Waltraud':");
        // Print updated details of the first employee
        employee1.printEmployeeDetails();
        System.out.println("\n12% for 'Hubertus Andrea':");
        // Print updated details of the second employee
        employee2.printEmployeeDetails();
    }
}

class Employee{
    // Private instance variables
    private String name;
    private String title;
    private double salary;

    // Constructor to initialize the Employee object with given values
    Employee(String name, String title, double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    // Method to print the details of the employee
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + title);
        System.out.println("Salary: " + salary);
    }

    // Method to increase the salary of the employee by a given percentage
    public void raiseSalary(double percent){
        this.salary *= 1 + (percent/100);
    }

    // Getter methods to retrieve the values of instance variables
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods to modify the values of instance variables
    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
