import java.util.Stack;

public class Stack6 {
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
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(8);
        reverseStack(s);
        printStack(s);
    }
}
