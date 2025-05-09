
class Linkedlist2 {
    static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //timecomplexity -O(n)
    public void addFirst(int data){
        //first step-1 create a newNode
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //second step-2 newNode ke next me head ki value store ki
        newNode.next=head;

        //third step-3 head is qeual to newNode ke
        head=newNode;
    }
    //timecomplexity- O(1)
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public  void Print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
         Node temp=head;
         while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
         }
         System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        // not found the key
        return -1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthformEnd(int n){
        int size1=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            size1++;
        }
        if(n==size1){
            head=head.next;
            return;
        }
        int i=1;
        int itoFind=size1-n;
        Node prev=head;
        while (i<itoFind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //slow-fast Apporach
    public Node findMode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
         slow=slow.next;//+1
         fast=fast.next.next;//+2
        }
        return slow;
    }

   
     
    public static void main(String[] args) {
        // Linkedlist2 ll=new Linkedlist2();
        // ll.Print();
        // ll.addFirst(11);
        // ll.Print();
        // ll.addFirst(44);
        // ll.Print();
        // ll.addFirst(33);
        // ll.Print();
        // ll.addLast(4);
        // ll.Print();
        // ll.addLast(42);

        // ll.addFirst(11);
        // ll.addFirst(3);
        // ll.addFirst(66);
        // ll.addFirst(33);
        // ll.add(2, 4);
        // //ll.removefirst();
        // //ll.removeLast();
        // ll.Print();
        // //ll.reverse();
        // ll.deleteNthformEnd(3);
        // ll.Print();
        //System.out.println(ll.size);
       // System.out.println(ll.itrSearch(4));

        
    
    }     
        
    }
    

