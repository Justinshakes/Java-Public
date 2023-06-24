package Exercise_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create two book objects
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        // Add the books to the book collection
        Book.addBook(book1);
        Book.addBook(book2);

        // Retrieve the book collection using reference
        ArrayList<Book> bookCollection = Book.getBookCollection();

        // Print the list of books
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        // Remove book1 from the book collection
        Book.removeBook(book1);

        System.out.println("test: " + Book.getBookCollection() + "    " + bookCollection);

        // Print the list of books after removal
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}

class Book {
    // Define private attributes for title, author, and ISBN
    private String title;
    private String author;
    private String ISBN;

    // Define a static book collection as an ArrayList
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    // Constructor to initialize a Book object with title, author, and ISBN
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter and setter methods for title, author, and ISBN
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Method to add a book to the book collection
    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    // Method to remove a book from the book collection
    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    // Method to retrieve the book collection
    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
}
