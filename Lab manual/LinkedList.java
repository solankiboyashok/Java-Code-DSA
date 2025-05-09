class LinkedList {
    static Node head; 
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

     void pairWiseSwap(Node head){
        Node temp = head;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
    Node swap(Node head){
        Node dummy=new Node(-1);
        dummy.next=head;
        Node point =dummy;
        while (point.next!=null && point.next.next!=null) {
            Node swap1=point.next;
            Node swap2=point.next.next;
            swap1.next=swap2.next;
            swap2.next=swap1;
            point.next=swap2;
            point=swap1;
            
        }
        return dummy.next;
    }
    
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);
    

        System.out.println("Original list:");
        list.printList();
        list.pairWiseSwap(head);
        System.out.println("\nList after pairwise swapping:");
        list.printList();
    }
}
    
    

