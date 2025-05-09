
class ListNode1 {
   static class Node{
       int data;
       Node next;
      Node(int data){
           this.data=data;
           this.next=null;
       }
   }
   public static Node head;
 
   public static boolean Cycle(){
    Node slow=head;
    Node fast=head;
    if(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
        
    }
    return false;
}
public static void main(String[] args){
    head=new Node(3);
    head.next=new Node(2);
    head.next.next=new Node(1);
    head.next.next=head;
    System.out.println(Cycle());
}

}
   
