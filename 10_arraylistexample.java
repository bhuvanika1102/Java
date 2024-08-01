import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("First element: " + list.get(0)); // Apple

        // Modify elements
        list.set(1, "Blueberry");

        // Remove elements
        list.remove(2);

        for (String item : list) {
            System.out.println(item);
        }
    }
}

/*
 * Additional Methods
 * Here are some additional useful methods:
 * 
 * list.size(): Returns the number of elements in the list.
 * list.contains("Apple"): Checks if the list contains "Apple".
 * list.indexOf("Blueberry"): Returns the index of "Blueberry".
 * list.clear(): Removes all elements from the list.
 * list.isEmpty(): Checks if the list is empty.
 */