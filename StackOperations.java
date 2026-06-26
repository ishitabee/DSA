//Making an elaborate menu of operations which the user can choose to implement on their stacks, using Java.
//Stacks follow Last IN First OUT.

import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();

        int userChoice;

        System.out.print("Enter the stack size: ");
        int stackSize = sc.nextInt();

        for (int i = 1; i <= stackSize; i++) {
            System.out.print("Enter element " + i + " for the stack: ");
            String stackElement = sc.next();

            myStack.push(stackElement);
        }

        do {
            System.out.println("\nWELCOME TO STACK MENU");

            System.out.println("1. Display Stack");
            System.out.println("2. Pop");
            System.out.println("3. Push");
            System.out.println("4. Peek");
            System.out.println("5. Size");
            System.out.println("6. Check if Empty");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            userChoice = sc.nextInt();

            switch (userChoice) {

                case 1:
                    System.out.println("Stack: " + myStack);
                    break;

                case 2:
                    if (!myStack.isEmpty()) {
                        System.out.println("Popped element: " + myStack.pop());
                        System.out.println("Updated Stack: " + myStack);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to push: ");
                    String element = sc.next();

                    myStack.push(element);

                    System.out.println(element + " pushed into stack.");
                    System.out.println("Updated Stack: " + myStack);
                    break;

                case 4:
                    if (!myStack.isEmpty()) {
                        System.out.println("Top element: " + myStack.peek());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;

                case 5:
                    System.out.println("Size of stack: " + myStack.size());
                    break;

                case 6:
                    System.out.println("Stack is empty " + myStack.isEmpty());
                    break;

                case 7:
                    System.out.println("Exiting the menu.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (userChoice != 7);

        sc.close();
    }
}
