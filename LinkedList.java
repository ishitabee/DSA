class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    //Constructor 
    LinkedList(){
        head = null;
    }

    void appendNode ( int data )
    {
        Node newNode = new Node(data);

        if ( head == null )
        {
            head = newNode;
        }
        else
        {
            Node cntr = head;
            while (cntr.next != null)
            {
                cntr = cntr.next;
            }
            cntr.next = newNode;
        }
        
    }

    void insertNode ( int position, int data )
    {
        Node newNode = new Node(5);
        Node currentCntr = this.head;
        Node previousCntr = this.head;

        if (position == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            int positionCntr = 1;
            while (positionCntr != position){
                currentCntr = currentCntr.next;
                if (positionCntr > 1){
                    previousCntr = previousCntr.next;
                }
                positionCntr++;
            }

            previousCntr.next = newNode;
            newNode.next = currentCntr;

        }
    }

    
    void deleteNode ( int position )
    {   

        Node currentCntr = this.head;
        Node previousCntr = this.head;
        Node nodeToBeDeleted = this.head;

        if (position == 1){
            head = head.next;
            nodeToBeDeleted = null;
        }
        else{
            int positionCntr = 1;
             while (positionCntr != position){
                currentCntr = currentCntr.next;
                if (positionCntr > 1){
                    previousCntr = previousCntr.next;
                }
                positionCntr++;
            }
            nodeToBeDeleted = currentCntr;

            previousCntr.next = currentCntr.next;
            nodeToBeDeleted = null;
            
        }
    }

    void displayList ()
    {
        System.out.print("The data in the list are  : ");
        Node cntr = head;
        while (cntr != null)
        {
            System.out.print(cntr.data + " ");
            cntr = cntr.next;
        }
        System.out.println("");
    }

    void reverseList ()
    {
        Node currentCntr = this.head.next;
        Node previousCntr = this.head;
        int position = 0;

        if (currentCntr != 1){
            while (currentCntr != null){
                if (position == 0)
                {
                    previousCntr.next = null;
                }
                head = currentCntr;
                currentCntr = currentCntr.next;
                head.next = previousCntr;
                previousCntr = head;
                
                position++;  
            }
            
            this.head = previousCntr;
        }
    }

    public static void main (String[] args)
    {
        LinkedList myList = new LinkedList();
        myList.appendNode(1);
        myList.appendNode(2);
        myList.appendNode(3);
        myList.appendNode(4);
        myList.displayList();
        myList.insertNode(3, 5);
        myList.displayList();
        myList.deleteNode(3);
        myList.displayList();
        myList.reverseList();
        myList.displayList();
    }
}
