package LinkedList;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LastCode {
    Node head;
    Node tail;

    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;

    }


    public void display() {
        Node Temp = head;
        while (Temp != null) {
            System.out.print(Temp.data + " -> ");
            Temp = Temp.next;
        }
        System.out.println("null");
    }
}

class Main{
    public static void main(String[] args) {
        LastCode ll = new LastCode();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
             ll.add(val);
            // ll.addlast(val);
        }
        
        ll.display();
        }
      }

