public class buysell {
    public static void main(String[] args) {
        int[] input = { 7, 1, 5, 3, 6, 4, 9 };
        int flag = 0, max_value = 0, max_idx = -1, one_idx = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 && i != input.length - 1) {
                flag = 1;
                one_idx = i;
            }
        }
        if (flag == 1) {
            for (int j = one_idx + 1; j < input.length; j++) {
                if (input[j] > max_value) {
                    max_value = input[j];
                    max_idx = j + 1;
                    j++;
                } else {
                    j++;
                }
            }
            if (flag == 0) {
                System.out.println("Can'nt able to buy!");
            } else {
                System.out.println("the output is: " + max_idx);
            }
        }
    }
}
