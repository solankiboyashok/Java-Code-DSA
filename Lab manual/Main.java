import java.util.*;

public class Main {
  public static class MinStack{
    Stack<Integer> st;
    int min;
    
    public MinStack(){
      st = new Stack<>();
    }
    public boolean isEmpty(){
      return st.size() == 0;
    }
    public int size(){
      return st.size();
    }
    
    public void push(int val){
      if(st.size() == 0){
        st.push(val);
        min = val;
      }else if(val > st.peek() ) {
        st.push(val);
      }else{
        st.push(val + val - min);
        min = val;
      }
    }
    public int getMin(){
      if(st.size() == 0){
        return -1;
      }else{
        return min;
      }
    }
    public int top(){
      if(st.size() == 0){
        System.out.println("Stack Underflow");
        return -1;
      }else{
        if(st.peek() >= min){
          return st.peek();
        }else{
          return min;
        }
      }
    }
    public int pop(){
      if(st.size() == 0){
        System.out.println("Stack Underflow");
        return -1;
      }else{
        if(st.peek() >= min){
          return st.pop();
        }else{
          int originalVal = min;
          
          min = 2 * min - st.peek();
          return originalVal;
        }
      }
    }
  }
  static void displayMinStack(MinStack stack) {
      System.out.println("Size: " + stack.size());
      System.out.println("Top: " + stack.top());
      System.out.println("Min: " + stack.getMin());
      System.out.println("pop: " + stack.pop());
      Stack<Integer> tempStack = new Stack<>();
      

      // Restore the original stack
      while (!tempStack.isEmpty()) {
          stack.st.push(tempStack.pop());
      }
    }
  
  
  public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        displayMinStack(minStack);
    }
}