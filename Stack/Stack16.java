//Create stack with help of Arraylist

import java.util.ArrayList;
import java.util.Stack;

class Stack16{
    class MyStack {
        // declare ArrayList
        public ArrayList<Integer> stack;
    
        public MyStack() {
        // Initialize ArrayList
          this.stack = new ArrayList<Integer>();    
        }
        
        public  void push(int x) {
            // here we add elements to ArrayList
            this.stack.add(x);
        }
        
        public int pop() {
            // here we remove last element and return it
            return this.stack.remove(this.stack.size() - 1);
        }
        
        public int top() {
            // here we return top element
            return this.stack.get(this.stack.size() - 1);
        }
        
        public boolean empty() {
            // here we check if stack is empty
            return this.stack.size() == 0 ? true : false;
        }
    }
    public static void main(String [] args){
        Stack s=new Stack();
        s.add(2);
        s.add(4);
        s.add(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    
    }

}