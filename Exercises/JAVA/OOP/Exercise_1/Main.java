package Exercise_1;

/*
1. Write a Java program to create a class called "Person"
with a name and age attribute. Create two instances of the
"Person" class, set their attributes using the constructor,
and print their name and age.
*/
public class Main {
    public static void main(String[] args) {
        Person x = new Person("Justin", 24);
        Person y = new Person("Calen", 26);

        System.out.println("Person x: " + "Name: " + x.name + ", Age: " + x.age);
        System.out.println("Person y: " + "Name: " + y.name + ", Age: " + y.age);
    }
}
