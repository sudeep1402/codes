import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Outputs 30

        // Pop an element
        System.out.println("Popped element: " + stack.pop());  // Outputs 30

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Outputs false

        // Search for an element in the stack
        System.out.println("Position of 10: " + stack.search(10));  // Outputs 1 (1-based index)
    }
}
