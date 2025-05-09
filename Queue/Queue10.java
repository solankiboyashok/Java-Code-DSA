package Queue;
//create stack with help of Deque
import java.util.Deque;
import java.util.LinkedList;

public class Queue10 {

    static class Stack{
        Deque<Integer>d=new LinkedList<>();
        public void push(int data){
           d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }
    static class Queue{
        Deque<Integer>d=new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        //Stack s=new Stack();
        //stack
        // s.push(2);
        // s.push(4);
        // s.push(5);
        // System.out.println("peek="+s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

       //Queue
       Queue s=new Queue();
       s.add(2);
        s.add(4);
        s.add(5);
        System.out.println("peek="+s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
