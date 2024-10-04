import java.util.ArrayList;

public class Collatz_Seq {
    private static ArrayList<Integer> collatz(int num) {
        int duplicate = num;
        ArrayList<Integer> sequence = new ArrayList<>();
        while (duplicate != 1) {
            if (duplicate % 2 == 0) {
                sequence.add(duplicate);
                duplicate = duplicate / 2;
            } else {
                sequence.add(duplicate);
                duplicate = (3 * duplicate) + 1;
            }
        }
        if (duplicate == 1) {
            sequence.add(duplicate);
        }
        return sequence;
    }

    private static int maximum(int num) {
        int answer = -1;
        int max_size = Integer.MIN_VALUE;

        for (int i = 1; i <= num; i++) {
            ArrayList<Integer> seq = new ArrayList<>();
            seq = collatz(i);

            int n = seq.size();
            if (n > max_size) {
                max_size = n;
                answer = i;
            }

        }
        return answer;
    }

    private static int maximum_size(int num) {
        int answer = -1;
        int max_size = Integer.MIN_VALUE;

        for (int i = 1; i <= num; i++) {
            ArrayList<Integer> seq = new ArrayList<>();
            seq = collatz(i);

            int n = seq.size();
            if (n > max_size) {
                max_size = n;
                answer = i;
            }

        }
        return max_size;
    }

    private static int max_element(int num) {
        int maximum_number = maximum(num);
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence = collatz(maximum_number);
        int max = sequence.get(0);
        for (int i = 1; i < sequence.size(); i++) {
            if (max < sequence.get(i)) {
                max = sequence.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int num = 5;
        ArrayList<Integer> sequence = collatz(num);

        System.out.print("TASK1:");
        for (int x : sequence) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.print("TASK2: ");
        System.out.print(maximum(num));
        System.out.println(" ");
        System.out.print("TASK3: ");
        System.out.print(maximum_size(num));
        System.out.println(" ");
        System.out.print("TASK4: ");
        System.out.print(max_element(num));

    }
}