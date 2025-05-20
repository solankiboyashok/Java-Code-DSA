package LinkedList;

import java.util.Scanner;

import Arrays.palindromsum;

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
    public static Node findMide(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean checkPalindrome(){
        if(head==null ||head.next==null){
            return true;
        }
        Node mind=findMide(head);
        Node prev=null;
        Node curr=mind;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean cycle(Node head){
        if(head==null)return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public static Node cycleconnected(Node head){
        if(head==null)return null;
        Node slow=head;
        Node fast=head;
        while (fast!=null &&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
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

        // System.out.println("Original list:");
        // list.display();

        // list.reverse();

        // System.out.println("Reversed list:");
        // list.display();
        // System.out.println(list.checkPalindrome());
     
         System.out.println("Cycle detected: " + cycle(head));

         Node cycleStart = cycleconnected(head);
         if (cycleStart != null) {
             System.out.println("Cycle starts at node with data: " + cycleStart.data);
         } else {
             System.out.println("No cycle start node (No cycle detected).");
         }
         
         sc.close();
    }
}
