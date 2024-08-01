import java.util.Stack;

public class stackexample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Popped element: " + stack.pop()); // Cherry
        System.out.println("Top element: " + stack.peek()); // Banana
        System.out.println("Is the stack empty? " + stack.isEmpty()); // false

        // Search for an element in the Stack
        int position = stack.search("Apple");
        if (position != -1) {
            System.out.println("Position of 'Apple' from the top: " + position);
        } else {
            System.out.println("'Apple' not found in the stack");
        }

        for (String item : stack) {
            System.out.println(item);
        }
        System.out.println("Stack size: " + stack.size()); // Get the size of the stack
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Check if the stack is empty
    }
}
