package Exercise_2;

/*
    2. Write a Java program to create a class called "Dog" with a name and breed attribute.
    Create two instances of the "Dog" class, set their attributes using the constructor and modify
     the attributes using the setter methods and print the updated values.
*/
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jackson", "Black Lab");
        Dog d2 = new Dog("Scout", "Blue Tik");

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        d1.setAttribute("Golden Retriever");
        d2.setAttribute("Corgi");

        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}
