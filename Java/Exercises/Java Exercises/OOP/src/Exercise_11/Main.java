package Exercise_11;

import java.util.ArrayList;

/*
    11. Write a Java program to create a class called "Library"
    with a collection of books and methods to add and remove books.
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book3 = new Book("The Silmarillion", "J.R.R. Tolkien", 365);

        Library library = new Library();
        library.printBookCollection(); // Print empty collection
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.printBookCollection(); // Print collection with 3 books

        library.removeBook(book2);
        library.printBookCollection(); // Print collection with 2 books


    }
}

class Library {
    private final ArrayList<Book> bookCollection;

    public Library() {
        this.bookCollection = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }

    public void removeBook(Book book) {
        this.bookCollection.remove(book);
    }

    public void printBookCollection() {
        System.out.println("\nBook collection:");
        for(Book book : bookCollection) {
            System.out.println("[ " + book + " ]");
        }
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        return this.title + " by " + this.author + " (" + this.pages + " pages)";
    }
}
