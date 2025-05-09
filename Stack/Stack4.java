//1.Question is Stack push the value in bottom of Stack.

import java.util.Stack;
public class Stack4 {
    //We have create function push value end of bottom.
    public static void pushBottom(Stack<Integer>s,int data){
        //first we check is empty or not then use if condition.
        if(s.isEmpty()){
            //empty the stack then push data in stack and return.
            s.push(data);
            return;
        }
        //stack is not then first we do pop then element given stack and store top name variable 
        int top=s.pop();
        //then push the bottom data
        pushBottom(s, data);
        // also then push the top values
        s.push(top);
        
    }
    
    public static void main(String[] args){
        //use collection farmework in stack format
        Stack<Integer>s=new Stack<>();
        //push the element for given stack
        s.push(6);
        s.push(7);
        s.push(3);
        s.push(5);
        //call the pushbottom function
        pushBottom(s,8);
        //stack is not empty you can not pop and peek element
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            s.peek();
        }
    }
}
