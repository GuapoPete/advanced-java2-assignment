package genericsLambdas;

import java.util.List;
import java.util.ArrayList;

public class Inventory<T> {
    private List<T> items;

    // Define a public constructor with no parameters that sets the list instance variable to an empty list
    public Inventory() {
        items = new ArrayList<>();
    }

    // Define a function that returns all items in the list instance variable
    public List<T> getItems() {
        return items;
    }

    // Define a function that takes an item of any type as input and adds it to the list
    public void addItem(T item) {
        items.add(item);
    }

    // Define a function that takes an item of any type as input, removes it from the list, and then returns the updated list
    public List<T> removeItem(T item) {
        items.remove(item);
        return items;
    }

    // Define a function that returns the number of items currently in the list
    public int getItemCount() {
        return items.size();
    }
}
