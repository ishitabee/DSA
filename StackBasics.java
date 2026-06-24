//Stack Operations using Java.

import java.util.Stack;

public class StackBasics{
    public static void main(String[] args) {

        Stack <String> myStack = new Stack<>();

        // Push : adds new elements.
        myStack.push("I");
        myStack.push("S");
        myStack.push("H");
        myStack.push("I");
        System.out.println("Stack: " + myStack);

        // Pop : removes the topmost element.
        String element = myStack.pop();
        System.out.println("Pop: " + element);

        // Peek : returns the topmost element.
        String topElement = myStack.peek();
        System.out.println("Peek: " + topElement);

        // isEmpty : checks whether the stack is empty
        boolean isEmpty = myStack.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // Size : returns the number of elements in stack.
        System.out.println("Size: " + myStack.size());
    }
}