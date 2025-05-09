//this code crate for stack with help of linked list
import java.util.Stack;

public class Stack2 {
    
    static class Node{
        int data;
        Node next;
         Node(int data){
           this.data=data;
           this.next=null;
        }
    
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
    //push
    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head =newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //pop
    public static  int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
} }
    

public static void main(String[] args){
    Stack<Integer>s=new Stack<>();
    s.push(5);
    s.push(7);
    s.push(8);

    while(!s.isEmpty()){
        System.out.println(s.pop());
        s.peek();
    }
}
}


