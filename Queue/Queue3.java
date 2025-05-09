//create queue with help of linked list.
package Queue;

public class Queue3 {
   static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
   }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        public boolean isEmpty(){
        return head==null && tail==null;
       }
    

     //Add
     public void add(int data){
       Node newNode=new Node(data);
       if(head==null){
        head=tail=newNode;
        return;
       }
       tail.next=newNode;
       tail=newNode;
     }

     //remove
     public int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int frant=head.data;
        //single element
          if(tail==head){
            tail=head=null;
          }else{
            head=head.next;
          }
        return frant;
     }
       
     //peek
     public int peek(){
        if(isEmpty()){
            System.out.println("queue isempty");
            return -1;
        }
        return head.data;
            }
       }
     public static void main(String [] args){
        Queue q=new Queue();
        q.add(3);
        q.add(5);
        q.add(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
     }
    
}


