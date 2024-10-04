import java.util.HashMap;

public class hashmapexample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "chicken");
        map.put(2, "briyani");
        map.put(3, "pani puri");

        // update
        map.put(1, "jigarthanda");

        // remove
        map.remove(2);
        for (int key : map.keySet()) {
            System.out.println("key:" + key + "value: " + map.get(key));

        }
    }
}
/*
 * Additional Methods
 * Here are some additional useful methods:
 * 
 * map.size(): Returns the number of key-value pairs in the map.
 * map.containsKey(1): Checks if the map contains a key.
 * map.containsValue("Apple"): Checks if the map contains a value.
 * map.clear(): Removes all key-value pairs from the map.
 * map.isEmpty(): Checks if the map is empty.
 */