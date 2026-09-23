package _11LinkedList;

class Linkedlist{
        Node head;
        Node tail;
        void addAtTail(int val){
                Node temp= new Node(val);
                tail.next=temp; //tail ka next ko karo temp our temp ko agge badhao
                tail=temp;
        }
}

public class LinkedListdataStructure {
        public static void main(String[] args) {
                Linkedlist ll= new Linkedlist();
                ll.addAtTail(10);
        }
}
