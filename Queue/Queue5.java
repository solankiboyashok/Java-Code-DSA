//create a queue with help of 2 stack.

package Queue;
import java.util.Stack;
class Queue5 {
    static class Queue{
    static Stack<Integer>s1=new Stack<>();
    static Stack<Integer>s2=new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }
    

        //add-O(n)
     public void add(int data){
        if(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        if(!s2.isEmpty()){
            s1.push(s2.pop());
        }  
    }

        //remove
        public int remove(){
            if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
            }
          return s1.pop();

        }

        //peek
        public int peek(){
            if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
            }
          return s1.peek();

        }
    

    }   
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(2);
        q.add(5);
        q.add(7);

        while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();            
        }
        

    }


}

