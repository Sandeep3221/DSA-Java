package _11LinkedList;

public class DisplayList {
        public static void display(Node head) {
                Node temp=head;
                while (temp!=null) {
                        System.out.println(temp.data+" ");
                        temp=temp.next;//temp ko agge leke chalo bass
                        //ye aek tarike are index hi hai jo agge leke ja rahe hai
                }
        }
        public static void main(String[] args) {
                Node a= new  Node(10);
                Node b= new  Node(20); 
                Node c= new  Node(30); 
                Node d= new  Node(40); 
                Node e= new  Node(50); 
                a.next=b; 
                b.next=c;
                c.next=d;
                d.next=e;
                display(a);
        }
}
