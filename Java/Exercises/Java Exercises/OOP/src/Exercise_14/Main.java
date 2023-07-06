package Exercise_14;
import java.util.ArrayList;

/*
14. Write a Java program to create a class called "School"
with attributes for students, teachers, and classes, and
methods to add and remove students and teachers, and to create classes.
 */
public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Adding students and teachers
        school.addStudent("John");
        school.addStudent("Emily");
        school.addTeacher("Mr. Smith");
        school.addTeacher("Ms. Johnson");

        // Adding classes
        school.addClass("Math");
        school.addClass("Science");
        school.addClass("English");

        // Printing students, teachers, and classes
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());

        // Removing a student
        school.removeStudent("John");

        // Removing a teacher
        school.removeTeacher("Ms. Johnson");

        // Removing a class
        school.removeClass("Science");

        // Printing students, teachers, and classes
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
    }
}

class School {
    private final ArrayList<String> students = new ArrayList<>();
    private final ArrayList<String> teachers = new ArrayList<>();
    private final ArrayList<String> classes = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
        System.out.println("Added student: " + student);
    }

    public void removeStudent(String student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Removed student: " + student);
        } else {
            System.out.println("Student not found: " + student);
        }
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
        System.out.println("Added teacher: " + teacher);
    }

    public void removeTeacher(String teacher) {
        if (teachers.contains(teacher)) {
            teachers.remove(teacher);
            System.out.println("Removed teacher: " + teacher);
        } else {
            System.out.println("Teacher not found: " + teacher);
        }
    }

    public void addClass(String className) {
        classes.add(className);
        System.out.println("Added class: " + className);
    }

    public void removeClass(String className) {
        if (classes.contains(className)) {
            classes.remove(className);
            System.out.println("Removed class: " + className);
        } else {
            System.out.println("Class not found: " + className);
        }
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public ArrayList<String> getTeachers() {
        return teachers;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }
}
