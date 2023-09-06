package Exercise_13;

import java.util.ArrayList;
import java.util.List;

/*
13. Write a Java program to create a class called "Inventory" with a collection
of products and methods to add and remove products, and to check for low inventory.
 */

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Create some product objects
        Product product1 = new Product("Apple", 1.99, 10);
        Product product2 = new Product("Banana", 0.99, 5);
        Product product3 = new Product("Orange", 1.49, 3);

        // Add the products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Print the current inventory
        inventory.printInventory();

        // Check for low inventory
        inventory.checkLowInventory();

        // Print the inventory after checking for low inventory
        inventory.printInventory();
    }

}

class Inventory {
    List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // Remove a product from the inventory
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    // Check for products with low inventory
    public void checkLowInventory() {
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                System.out.println(product.getName() + " is low in stock.");
            }
        }
    }

    // Print the current inventory
    public void printInventory() {
        System.out.println("\nInventory:");
        for (Product product : products) {
            System.out.println("[ " + product + " ]");
        }
    }

}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Get the name of the product
    public String getName() {
        return name;
    }

    // Get the price of the product
    public double getPrice() {
        return price;
    }

    // Get the quantity of the product
    public int getQuantity() {
        return quantity;
    }

    // Override the toString() method to provide a string representation of the product
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}
