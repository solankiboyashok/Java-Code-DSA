//creat a stack with help of 2 Queue.

import java.util.LinkedList;
import java.util.Queue;

public class Stack15 {
    static class Stack{
       static Queue <Integer>s1=new LinkedList<>();
       static Queue <Integer>s2=new LinkedList<>();
       public static boolean isEmpty(){
          return s1.isEmpty() && s2.isEmpty();
       }
       //add -O(1)
       public void add(int data){
        if(!s1.isEmpty()){
           s1.add(data); 
        }else{
           s2.add(data);
        }
       }

       //remove-O(1)
       public int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int top=-1;
        //case:1
        if(!s1.isEmpty()){
            while (!s1.isEmpty()) {
               top=s1.remove();
               if(s1.isEmpty()){
                break;
               } 
               s2.add(top);
            }
        }//case:2
        else{
                while (!s2.isEmpty()) {
               top=s2.remove();
               if(s2.isEmpty()){
                break;
               } 
               s1.add(top);
            }

        }
        return top;

       }

       //peek-O(1)
        public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int top=-1;
        //case:1
        if(!s1.isEmpty()){
            while (!s1.isEmpty()) {
               top=s1.remove();
            
               s2.add(top);
            }
        }//case:2
        else{
                while (!s2.isEmpty()) {
               top=s2.remove();
             
               s1.add(top);
            }

        }
        return top;

       }

       public static void main(String[] args){
        Stack s=new Stack();
        s.add(2);
        s.add(4);
        s.add(3);

        while (!isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }

       }


    }
    
}
