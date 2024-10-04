public class subarray_match {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] target = { 2, 3 };

        boolean found = false;

        // Outer loop for the starting point
        for (int i = 0; i <= arr.length - target.length; i++) {
            // Check if the target subarray matches
            boolean isMatch = true;
            for (int j = 0; j < target.length; j++) {
                if (arr[i + j] != target[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Target subarray found!");
        } else {
            System.out.println("Target subarray not found.");
        }
    }

}
