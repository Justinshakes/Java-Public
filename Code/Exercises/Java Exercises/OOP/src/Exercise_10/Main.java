package Exercise_10;

import java.util.ArrayList;

/*
    Write a Java program to create a class called "Student" with a name,
    grade, and courses attributes, and methods to add and remove courses.

*/
public class Main {
    public static void main(String[] args) {
        // Create two instances of the Student class
        Student student1 = new Student("Roberta Petrus", 12);
        Student student2 = new Student("Loyd Blair", 11);

        // Print initial details of the students
        student1.printStudentDetails();
        student2.printStudentDetails();

        // Add courses to student1
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");
        System.out.println("\n" + student1.getName() + " after adding courses Math, Science, and English:");
        student1.printStudentDetails();

        // Add courses to student2
        student2.addCourse("Chemistry");
        student2.addCourse("History");
        System.out.println("\n" + student2.getName() + " after adding courses Chemistry and History:");
        student2.printStudentDetails();


        // Remove a course from student1
        System.out.println("\n" + student1.getName() + " removing course Science:");
        student1.removeCourse("Science");
        student1.printStudentDetails();

        // Remove a course from student2
        System.out.println("\n" + student2.getName() + " after removing course History:");
        student2.removeCourse("History");
        student2.printStudentDetails();

    }
}

// Student class
class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    // Constructor to initialize the attributes of the Student class
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    // Getters and setters for the attributes of the Student class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    // Method to add a course to the courses attribute
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course from the courses attribute
    public void removeCourse(String course) {
        courses.remove(course);
    }

    // Method to print the student details
    public void printStudentDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}
