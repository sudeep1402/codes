// Class to represent a node in the stack
class Node {
    int data;  // Value of the node
    Node next; // Pointer to the next node
    
    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}   

// Class to represent the stack
class Stack {
    Node top; // Points to the top of the stack

    // Constructor to initialize the stack
    public Stack() {
        this.top = null; // Initially, the stack is empty
    }

    // Function to add a node (push) onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // Make the new node point to the previous top
        top = newNode; // Update the top to the new node
        System.out.println(data + " pushed to stack.");
    }

    // Function to remove a node (pop) from the stack
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int poppedValue = top.data;
        top = top.next; // Move the top pointer to the next node
        System.out.println(poppedValue + " popped from stack.");
    }

    // Function to peek the top element of the stack
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element is: " + top.data);
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

// Main class to test the stack operations
public class StackExample1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peek the top element
        stack.peek();
        
        // Pop an element from the stack
        stack.pop();
        
        // Peek the top element again
        stack.peek();
        
        // Pop the remaining elements
        stack.pop();
        stack.pop();
        
        // Try to pop from an empty stack
        stack.pop();
    }
}
