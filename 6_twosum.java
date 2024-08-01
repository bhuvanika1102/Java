
public class twosum {
    public static void main(String[] args) {
        int target = 9;
        int[] num = { 2, 7, 11, 15 };
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println("(" + num[i] + "," + num[j] + ")");
                }
            }
        }
    }
}
