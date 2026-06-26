//Implementing Queues using Linked List in Java.
//Queues follow First IN First OUT.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {

    Node head;
    Node tail;

    // Enqueue node : similar to pushing node

    void enqueueNode(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            System.out.println(data + " inserted into queue.");
            return;
        }

        tail.next = newNode;
        tail = newNode;

        System.out.println(data + " inserted into queue.");
    }

    // Dequeue node : similar to popping node

    void dequeueNode() {
        if (head == null) {
            System.out.println("Queue is empty. Nothing to remove.");
            return;
        }

        System.out.println("\nElement " + head.data + " will be removed from the queue.");

        head = head.next;

    }

    // Display queue

    void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Queue myQueue = new Queue();

        // Enqueue elements
        myQueue.enqueueNode(10);
        myQueue.enqueueNode(11);
        myQueue.enqueueNode(30);
        myQueue.enqueueNode(20);

        // Display queue
        System.out.println("\nQueue:");
        myQueue.displayQueue();

        // Dequeue first element
        myQueue.dequeueNode();

        //Updated queue
        System.out.println("\nQueue after dequeue:");
        myQueue.displayQueue();
    }
}