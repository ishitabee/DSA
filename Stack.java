//Implementing Stacks using Linked Lists in Java.
//Stacks follow Last IN First OUT

class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    
    }
}

public class Stack {

    Node top;

    //push node
    void pushNode(int data){
        Node newNode = new Node(data);

        newNode.next = top;

        top = newNode;

        System.out.println(data + " pushed into stack.");
    }

    //pop node
    void popNode()
    {
        if(top == null)
        {
            System.out.println("Nothing can be popped from an empty stack.");
            return;
        }

        System.out.println("Element " + top.data + " will be popped.");

        top = top.next;
    }

    //display stack
    void displayStack()
    {
        if(top == null)
        {
            System.out.println("Stack is empty.");
            return;
        }

        Node temp = top;

        while(temp != null)
        {
            System.out.println(temp.data);

            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        
        Stack myStack = new Stack();

        //pushing nodes into a stack.
        myStack.pushNode(1);
        myStack.pushNode(16);
        myStack.pushNode(22);
        myStack.pushNode(30);

        //displaying the newly created stack.
        System.out.println("\nStack: ");
        myStack.displayStack();

        //popping node from the stack. Only topmost/last node gets popped out.
        myStack.popNode();
        System.out.println("\nStack after popping the node: ");
        myStack.displayStack();
    }

}
