package _11LinkedList;

public class LinkedListOperations {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // Head of Linked List
    Node head;


    // =========================
    // 1. Insert at Head
    // =========================
    void insertAtHead(int data) {

        Node newNode= new Node(data);

        newNode.next=head;
        head=newNode;



    }


    // =========================
    // 2. Insert at Tail
    // =========================
    void insertAtTail(int data) {

        Node temp= head;
        Node newNode= new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        //what the fuckkk did not got it 



    }


    // =========================
    // 3. Delete Head
    // =========================
    void deleteHead() {

       head=head.next;



    }


    // =========================
    // 4. Delete Tail
    // =========================
    void deleteTail() {

        // TODO: Write your logic here



    }


    // =========================
    // 5. Print / Traverse List
    // =========================
    void printList() {
        Node temp=head; 
        while (temp!=null) {
            System.out.println(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.print(" ");
    }


    // =========================
    // Main Method
    // =========================
    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        // Build the list
        list.insertAtHead(20);
        list.insertAtHead(10);

        list.insertAtTail(30);
        list.insertAtTail(40);

        // Expected:
        // 10 -> 20 -> 30 -> 40 -> null
        list.printList();


        // Delete first node
        list.deleteHead();

        // Expected:
        // 20 -> 30 -> 40 -> null
        list.printList();


        // Delete last node
        list.deleteTail();

        // Expected:
        // 20 -> 30 -> null
        list.printList();
    }
}
