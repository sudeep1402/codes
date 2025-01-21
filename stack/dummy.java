class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    int top;

    public Stack(int top){
        this.top=null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next=top; 
        top=newNode;
        System.out.println("pushed data is :"+data);
          
    }
    public void pop() {
    }
    public void peek() {
    }
    public boolean isEmpty() {
    }    
}