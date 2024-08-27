
/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can. Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
Input Format: First line contains number of test cases n Then subsequent n lines contains string S
Output: For each string S, print the output.
Constraint: 1<=|S|<=10^5
Sample Input
abbbacad
Sample Output
cad

*/
import java.util.Stack;

public class different_continous {
    private static String solve(String str) {
        Stack<Character> stk = new Stack<>();
        for (char x : str.toCharArray()) {
            if (!stk.isEmpty() && stk.peek() == x) {
                stk.pop();
            } else {
                stk.push(x);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) {
            result.insert(0, stk.pop()); // Insert at the beginning to preserve order
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abbbacad";
        System.out.println(solve(str)); // Print the result
    }
}
