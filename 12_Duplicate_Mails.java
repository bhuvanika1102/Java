import java.util.HashSet;

public class Duplicate_Mails {
    private static int solve(int[] input, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : input) {
            set.add(x);
        }
        return n - set.size();
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 3, 3, 4, 4, 2 };
        int n = input.length;
        System.out.println(solve(input, n));
    }
}
