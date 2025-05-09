//create a queue with help of java collection framework.
package Queue;
//import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class Queue4 {
    public static void main(String[] args){
        Queue<Integer>q=new LinkedList<>();
        /*Queue is a interface you can create a queue in 
        java collection you always use linkedlist and ArrayDueue. */
       // Queue<Integer>q=new ArrayDeque<>();
       q.add(5);
       q.add(3);
       q.add(8);

       while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
       }
    }

}
