class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    // Pop method to remove data from the stack
    public void pop() {
        if (top == null) {
            System.out.println("Empty stack.");
            return;
        }
        int popData = top.data;
        top = top.next;
        System.out.println("The data was: " + popData);
    }

    // Push method to add data to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Data is pushed: " + data);
    }

    // isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Peek method to view the top element
    public void peek() {
        if (top == null) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.println("The top item is: " + top.data);
    }
}

public class dummy {
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(10);  // Push elements
        s.push(20);
        s.push(30);

        s.pop();  // Pop an element

        s.peek();  // Peek the top element

        // Print if the stack is empty
        if (s.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}
