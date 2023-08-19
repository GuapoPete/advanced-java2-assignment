package genericsLambdas;

import java.util.List;
import java.util.ArrayList;

public class Product {
    // Define the instance variables for 'name' and 'price'
    private String name;
    private double price;

    // Define a public constructor for Product that takes a name and price as input and sets the instance variables accordingly
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        // Make an Inventory object that holds Products
        Inventory<Product> myInventory = new Inventory<>();

        // Add as many products as you want to your Inventory Object using the addItem() method you defined
        myInventory.addItem(new Product("Product 1", 10.0));
        myInventory.addItem(new Product("Product 2", 20.0));
        myInventory.addItem(new Product("Product 3", 30.0));

        // Calculate the total price of all products in an Inventory object called myInventory
        double priceTotal = myInventory.getItems()
                .stream()
                .mapToDouble(product -> product.price)
                .sum();

        // Print out priceTotal to the console to make sure you are properly summing your Products!
        System.out.println("Total price of all products: " + priceTotal);

        // Helpful documentation: https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects
    }
}
