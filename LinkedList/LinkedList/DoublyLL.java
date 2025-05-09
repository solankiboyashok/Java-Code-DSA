package LinkedList;

class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;

    //addFirst
    public void addFirst(int data){
      Node newNode=new Node(data);
      if(head==null){
        head=tail=newNode;
        return;
      }
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    //removeFirst
    public int removeFirst(){
        int size=0;
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void print1(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        DoublyLL dll=new DoublyLL();
        dll.addFirst(0);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addLast(4);
         dll.print1();
         dll.removeFirst();
         dll.print1();

    }
}
