public class Subarray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        // Outer loop for starting point
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for ending point
            for (int j = i; j < arr.length; j++) {
                // Print subarray from arr[i] to arr[j]
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
