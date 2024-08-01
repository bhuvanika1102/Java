//USING ARRAYLIST

import java.util.ArrayList;

public class sort1 {
    public static void main(String[] args) {
        int[] input = { 12, 2, 35, 43, 20, 1 };
        ArrayList<Integer> descend = new ArrayList<>();
        ArrayList<Integer> ascend = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                } else {
                    j++;
                }
            }
        }
        for (int x : input) {
            descend.add(x);
        }
        for (int i = input.length - 1; i >= 0; i--) {
            ascend.add(input[i]);
        }
        int j = 0, k = 0;
        for (int i = 0; i < input.length; i++) {

            if (i % 2 == 0) {
                int a = ascend.get(j);
                result.add(a);
                j++;
            } else {
                int b = descend.get(k);
                result.add(b);
                k++;
            }

        }
        for (int x : result) {
            System.out.println(x);
        }
    }

}
