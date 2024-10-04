public class xpattern {
    public static void main(String[] args) {

        String input = "bhuvanika";
        int length = input.length();
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
                if (i == j) {
                    System.out.print(input.charAt(i));
                } else if (i + j == length - 1) {
                    System.out.print(input.charAt(length - 1 - i));
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
