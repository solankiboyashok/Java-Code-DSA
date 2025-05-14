import java.util.Scanner;
public class Linkedlist5 
{
static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static Node tail;
public static int size = 0;

    public static void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        size++;
    }
    newNode.next=head;
    head=newNode;
    size++;

    }
    public static void addEnd(int data){
        Node newNode=new Node(data);
        if(size<1){
           head=tail=newNode;
           size++;
           
        }
        tail.next=newNode;
        tail=newNode;
        size++;

    }
    public static int Search(int key){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==key){
                return index;

            }
            temp=temp.next;
            index++;

        }

        return 0;

    }
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Linkedlist5 l=new Linkedlist5();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n>0) {
            // l.addFirst(sc.nextInt());
             l.addEnd(sc.nextInt());

            
            n--;
        }
        // int key=sc.nextInt();
        // System.out.println(l.Search(key ));
        l.reverse();
        l.print();
    }
    
}
