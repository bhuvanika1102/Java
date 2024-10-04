import java.util.HashMap;
import java.util.Map;

public class Find_Unique {
    private static int solve(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (Integer x : arr) {
            if (freq.containsKey(x)) {
                freq.put(x, freq.get(x) + 1);
            } else {
                freq.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) { // Find element with frequency 1
                return entry.getKey();
            }
        }

        return -1; // Return -1 if no unique element is found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 3, 2 };
        System.out.println(solve(arr));
    }
}
