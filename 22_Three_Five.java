import java.util.ArrayList;

public class Three_Five {
    private static ArrayList<String> solve(int[] arr) {
        int n = arr.length;
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                answer.add("ThreeFive");
            } else if (arr[i] % 3 == 0) {
                answer.add("Three");
            } else if (arr[i] % 5 == 0) {
                answer.add("Five");
            } else {
                answer.add(String.valueOf(arr[i]));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 15 };
        ArrayList<String> result = new ArrayList<>();
        result = solve(arr);
        for (String x : result) {
            System.out.print(x + " ");
        }
    }
}
