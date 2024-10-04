public class Parade {
    private static int solve(String str, int n) {
        int count = 0, answer = 0;
        int first_informal = -1, last_informal = -1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'I') {
                if (count == 0) {
                    count = 1;
                    first_informal = i;
                } else if (count == 1) {
                    first_informal = i;
                    count++;
                }

                last_informal = i;
            }

        }
        if (first_informal == -1) {
            return 0;
        }
        return ((last_informal - first_informal) + 1);
    }

    public static void main(String[] args) {
        int N = 7;
        String input = "FIFIFIF";
        System.out.println(solve(input, N));
    }
}