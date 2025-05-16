package LinkedList;

import java.util.Scanner;

public class Linkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node head;
    static Node tail;

    // Add element to the end of the list
    public void addLast(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        System.out.println("Original list:");
        list.display();

        list.reverse();

        System.out.println("Reversed list:");
        list.display();
    }
}
