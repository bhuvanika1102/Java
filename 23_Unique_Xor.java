public class Unique_Xor {
    private static int solve(int[] arr) {
        int result = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 3, 2 };
        System.out.println(solve(arr));
    }
}
